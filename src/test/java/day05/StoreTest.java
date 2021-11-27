package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    Store store = new Store();

    @TempDir
    File tempFolder;

    @BeforeEach
    void init(){
        store.addProduct(new Product("Shirt", LocalDate.of(2021,11,15),3000));
        store.addProduct(new Product("T-Shirt", LocalDate.of(2021,10,15),2000));
        store.addProduct(new Product("Shirt", LocalDate.of(2021,10,17),4000));
    }

    @Test
    void writeToFileByMonthTest() throws IOException {
        Path path = tempFolder.toPath().resolve("result.txt");

        Path resultPath = store.writeToFileByMonth(Month.OCTOBER,path);

        List<String> result = Files.readAllLines(path);

        assertEquals("Shirt", result.get(1).split(";")[0]);
        assertEquals(2,result.size());
        assertEquals("soldProducts_OCTOBER.csv",resultPath.toString());
    }

}