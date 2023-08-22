package com.hh.domain;

import lombok.Data;

@Data
public class Book {
    private Integer id;
    private String name;
    private String context;
    private double price;
}
