package ru.netology.domain;

import lombok.*;

import java.util.Locale;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {
    private int id;
    private String name;
    private int price;

    // метод определения соответствия товара product запросу search
    public boolean matches(String search) {
        return getName().toLowerCase().contains(search.toLowerCase());
    }
}
