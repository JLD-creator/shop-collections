package org.ies.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

@Data
@AllArgsConstructor
public class Shop {
    protected String name;
    protected List<Item> items;
    protected Map<Integer, Product> productsById;
    protected List<Order> orders;
    protected TreeSet<Customer> customers;

    public Customer findCustomer(String nif) {
        for (Customer customer : customers) {
            if (customer.getNif().equals(nif)) {
                return customer;
            }
        }
        return null;
    }
    public Order findOrder(String nif, int orderId){
        var customer = findCustomer(nif);
        if (customer != null){
            return customer.findOrder(orderId);
        } else {
            return null;
        }
    }
    public List<Product> productList (String nif, int orderId){
        List<Product> productList = new LinkedList<>();
        var order = findOrder(nif, orderId);
        if (order != null){
            for (var item : order.getItemList()){
                Product product = productsById.get(item.getProductId());
                productList.add(product);
            }
            return productList;
        } else {
            return null;
        }
    }
    public Double spentByCustomer(String nif) {
        var customer = findCustomer(nif);
        if (customer != null) {
            return customer.spent();
        } else {
            return null;
        }
    }
}
