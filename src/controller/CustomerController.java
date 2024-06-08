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
                String nombres = view.getNombres();
                String apellidos = view.getApellidos();
                String direccion = view.getDireccion();
                String telefono = view.getTelefono();
                String dni = view.getDni();
                model.add(new Customer(nombres,apellidos,direccion,telefono,dni));
                view.updateTable(model);
            }
        });
    }
}