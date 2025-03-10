package org.ies.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class Shop {
    protected String name;
    List<Item> items;
    Map<Integer, Product> productsById;
    List<Order> orders;
}
