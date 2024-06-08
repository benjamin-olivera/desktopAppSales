package controller;

import model.Customer;
import view.CustomerWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class CustomerController {
    private CustomerWindow view;
    private List<Customer> model;

    public CustomerController(CustomerWindow view, List<Customer> model) {
        this.view = view;
        this.model = model;

        this.view.addCustomerListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = view.getCustomerName();
                String address = view.getCustomerAddress();
                model.add(new Customer(name, address));
                view.updateTable(model);
            }
        });
    }
}