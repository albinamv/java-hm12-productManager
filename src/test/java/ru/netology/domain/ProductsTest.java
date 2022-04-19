package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductsTest {

    private Product product = new Product(1, "Лучший продукт", 100);
    private Book book = new Book(2, "Лучшая книга", 200, "Автор");
    private Smartphone smartphone = new Smartphone(3, "Лучший смартфон", 300, "Производитель");

    @Test
    void shouldMatchInParent() {
        assertTrue(product.matches("Лучший"));
    }

    @Test
    void shouldNotMatchInParent() {
        assertFalse(product.matches("1"));
    }

    @Test
    void shouldMatchInParentInDifferentCase() {
        assertTrue(product.matches("ПроДукТ"));
    }

    @Test
    void shouldMatchInBookAuthor() {
        assertTrue(book.matches("Автор"));
    }

    @Test
    void shouldMatchInBookAuthorInDifferentCase() {
        assertTrue(book.matches("АВТОР"));
    }

    @Test
    void shouldMatchInBookName() {
        assertTrue(book.matches("Книга"));
    }

    @Test
    void shouldMatchInSmartphoneManufacturer() {
        assertTrue(smartphone.matches("Производитель"));
    }

    @Test
    void shouldMatchInSmartphoneManufacturerInDifferentCase() {
        assertTrue(smartphone.matches("ПРОИЗВОДИТЕЛЬ"));
    }

    @Test
    void shouldMatchInSmartphoneName() {
        assertTrue(smartphone.matches("Смартфон"));
    }
}