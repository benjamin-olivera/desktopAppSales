package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import model.Customer;
import java.util.List;

public class CustomerWindow extends JFrame {
    private JTextField txtName;
    private JTextField txtLastName;
    private JTextField txtAddress;
    private JTextField txtPhone;
    private JTextField txtId;
    private JButton btnAdd;
    private JTable tblCustomers;

    public CustomerWindow() {
        setTitle("Clientes");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 500);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2)); // Ajusta esto según tus necesidades

        panel.add(new JLabel("Nombres:"));
        txtName = new JTextField();
        panel.add(txtName);

        panel.add(new JLabel("Apellidos:"));
        txtLastName = new JTextField();
        panel.add(txtLastName);

        panel.add(new JLabel("Dirección:"));
        txtAddress = new JTextField();
        panel.add(txtAddress);

        panel.add(new JLabel("Teléfono:"));
        txtPhone = new JTextField();
        panel.add(txtPhone);

        panel.add(new JLabel("DNI:"));
        txtId = new JTextField();
        panel.add(txtId);

        btnAdd = new JButton("Agregar");
        panel.add(btnAdd);

        this.add(panel, BorderLayout.NORTH);

        tblCustomers = new JTable();
        // Aquí deberías configurar el modelo de la tabla para mostrar los clientes
        add(new JScrollPane(tblCustomers), BorderLayout.CENTER);
    }

    public void addCustomerListener(ActionListener listener) {
        btnAdd.addActionListener(listener);
    }

    public String getNombres() {
        return txtName.getText();
    }

    public String getApellidos() {
        return txtLastName.getText();
    }

    public String getDireccion() {
        return txtAddress.getText();
    }

    public String getTelefono() {
        return txtPhone.getText();
    }

    public String getDni() {
        return txtId.getText();
    }

    public void updateTable(List<Customer> model) {
        // Aquí deberías actualizar la tabla de clientes para mostrar los clientes en la lista 'model'
    }
}