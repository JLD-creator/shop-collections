package org.ies.shop;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.ies.shop.model.Item;
import org.ies.shop.model.Order;
import org.ies.shop.model.Product;

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
