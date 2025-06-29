package com.ahdev.bookstore.orders.clients.config;

import java.math.BigDecimal;

public record Product(String code, String name, String description, String imageUrl, BigDecimal price) {}
