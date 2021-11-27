package day04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class CourierFileManagerTest {

    CourierFileManager cm = new CourierFileManager();

    @Test
    void createCourierByFile(){
        Path path = Paths.get("src/main/resources/rides.txt");
        Courier courier = cm.createCourierByFile(path);

        assertEquals(2, courier.getRides().get(2).getDay());
        assertEquals(19, courier.getRides().get(3).getKms());
        assertEquals(2,courier.getRides().get(4).getNumberOfRide());
        assertEquals(6,courier.getRides().size());
    }

}