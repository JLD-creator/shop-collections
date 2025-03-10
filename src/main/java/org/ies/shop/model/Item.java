package org.ies.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {
    protected int productId;
    protected Double amount;
}
