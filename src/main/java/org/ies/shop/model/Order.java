package org.ies.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;


@Data
@AllArgsConstructor
public class Order {
    protected int id;
    protected LocalDate date;
    protected Double price;
    protected List<Item> itemList;


}
