package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SalesWindow extends JFrame {
    private JTextField txtCustomer;
    private JTextField txtProduct;
    private JTextField txtQuantity;
    private JButton btnAdd;
    private JTable tblSales;

    public SalesWindow() {
        setTitle("Ventas");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 500);
        setLayout(new BorderLayout());

        JPanel pnlForm = new JPanel(new GridLayout(4, 2));
        add(pnlForm, BorderLayout.NORTH);

        pnlForm.add(new JLabel("Cliente:"));
        txtCustomer = new JTextField();
        pnlForm.add(txtCustomer);

        pnlForm.add(new JLabel("Producto:"));
        txtProduct = new JTextField();
        pnlForm.add(txtProduct);

        pnlForm.add(new JLabel("Cantidad:"));
        txtQuantity = new JTextField();
        pnlForm.add(txtQuantity);

        btnAdd = new JButton("Agregar");
        pnlForm.add(btnAdd);

        tblSales = new JTable();
        // Aquí deberías configurar el modelo de la tabla para mostrar las ventas
        add(new JScrollPane(tblSales), BorderLayout.CENTER);

        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aquí deberías añadir el código para agregar una nueva venta
                // usando los datos ingresados en txtCustomer, txtProduct y txtQuantity
            }
        });
    }
}