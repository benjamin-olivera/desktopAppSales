package view;
import javax.swing.*;

import model.Customer;

import java.awt.*;
import java.awt.event.*;
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

        JPanel pnlForm = new JPanel(new GridLayout(3, 2));
        add(pnlForm, BorderLayout.NORTH);

        pnlForm.add(new JLabel("Nombre:"));
        txtName = new JTextField();
        pnlForm.add(txtName);

        pnlForm.add(new JLabel("Dirección:"));
        txtAddress = new JTextField();
        pnlForm.add(txtAddress);

        btnAdd = new JButton("Agregar");
        pnlForm.add(btnAdd);

        tblCustomers = new JTable();
        // Aquí deberías configurar el modelo de la tabla para mostrar los clientes
        add(new JScrollPane(tblCustomers), BorderLayout.CENTER);

        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = txtName.getText();
                String address = txtAddress.getText();

                // Aquí deberías añadir el código para agregar un nuevo cliente
                // Por ejemplo, si tienes una lista de clientes, podrías hacer algo como esto:
                // customerList.add(new Customer(name, address));

                // Luego, deberías actualizar la tabla de clientes para mostrar el nuevo cliente
                // Por ejemplo, si estás usando un DefaultTableModel, podrías hacer algo como esto:
                // ((DefaultTableModel) tblCustomers.getModel()).addRow(new Object[] {name, address});

                // Finalmente, deberías limpiar los campos de texto para el próximo cliente
                txtName.setText("");
                txtAddress.setText("");
            }
           

           
        });
       
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
		// TODO Auto-generated method stub
		
	}
}
