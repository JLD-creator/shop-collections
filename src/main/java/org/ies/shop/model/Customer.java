package org.ies.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Customer  implements  Comparable<Customer>{
    protected String nif;
    protected String name;
    protected String surname;
    List<Order> orders;

    @Override
    public int compareTo(Customer customer) {
        int compare = this.surname.compareTo(customer.surname);
        if (compare == 0){
            compare = this.name.compareTo(customer.name);
        }
        if (compare == 0){
            compare = this.nif.compareTo(customer.nif);
        }
        return compare;
    }
    public Order findOrder(int orderId){
        for (var order: orders){
            if (order.getId() == orderId){
                return order;
            }
        }
        return null;
    }
    public Double spent(){
        double spent = 0;
        for (var order: orders){
            spent += order.getPrice();
        }
        return spent;
    }
}
