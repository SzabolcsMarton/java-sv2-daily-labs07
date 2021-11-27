package day05;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

   @Test
    void createProductTest(){
       Product product = new Product("cipo", LocalDate.of(2021,10,11),3000);

       assertEquals("cipo", product.getName());
       assertEquals(LocalDate.of(2021,10,11),product.getDateOfSale());
       assertEquals(3000, product.getPrice());
   }
}