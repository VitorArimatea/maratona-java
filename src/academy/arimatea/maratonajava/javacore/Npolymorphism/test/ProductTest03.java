package academy.arimatea.maratonajava.javacore.Npolymorphism.test;

import academy.arimatea.maratonajava.javacore.Npolymorphism.domain.Computer;
import academy.arimatea.maratonajava.javacore.Npolymorphism.domain.Product;
import academy.arimatea.maratonajava.javacore.Npolymorphism.domain.Tomato;
import academy.arimatea.maratonajava.javacore.Npolymorphism.service.ProductTaxCalculate;

public class ProductTest03 {
    public static void main(String[] args) {
        Product product = new Computer("Galaxy Book 2025", 3500);

        Tomato tomato = new Tomato("Hybrid Tomato", 10);
        tomato.setExpirationDate("22/12/2025");

        ProductTaxCalculate.calculateTax(tomato);
        ProductTaxCalculate.calculateTax(product);
    }
}
