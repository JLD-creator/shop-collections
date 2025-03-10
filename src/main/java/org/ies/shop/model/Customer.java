package org.ies.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Customer {
    protected String nif;
    protected String name;
    protected String surname;
    List<Order> orders;

}
