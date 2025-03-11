package org.ies.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;


import java.util.Set;

@Data
@AllArgsConstructor
public class Product {
    protected int idPorduct;
    protected String name;
    protected Double price;
     protected Set<String> tags;


}
