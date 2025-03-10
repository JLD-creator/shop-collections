package org.ies.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;



@Data
@AllArgsConstructor
public class Order {
    protected int id;
    protected String date;
    protected Double price;


}
