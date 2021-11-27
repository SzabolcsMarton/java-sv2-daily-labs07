package day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> soldProducts = new ArrayList<>();

    public void addProduct(Product product) {
        if (product.getDateOfSale().isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Date of sale must be earlier then now.");
        }
        soldProducts.add(product);
    }

    public Path writeToFileByMonth(Month month, Path testPath){
        List<String> result = createStringByMonth(month);
        try {
            StringBuilder sb = new StringBuilder().append("soldProducts_").append(month.name()).append(".csv");
            Path path = Path.of(sb.toString());
            Files.write(testPath, result);
            return path;
        }catch (IOException exception){
            throw new IllegalArgumentException("Cannot write file!",exception);
        }
    }

    private List<String> createStringByMonth(Month month) {
        List<String> result = new ArrayList<>();
        for (Product actual : soldProducts) {
            if (actual.getDateOfSale().getMonth() == month) {
                result.add(actual.toString());
            }
        }
        return result;
    }
}
