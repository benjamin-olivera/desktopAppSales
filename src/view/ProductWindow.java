package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProductWindow extends JFrame {
    private JTextField txtName;
    private JTextField txtPrice;
    private JButton btnAdd;
    private JTable tblProducts;

    public ProductWindow() {
        setTitle("Productos");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 500);
        setLayout(new BorderLayout());

        JPanel pnlForm = new JPanel(new GridLayout(3, 2));
        add(pnlForm, BorderLayout.NORTH);

        pnlForm.add(new JLabel("Nombre:"));
        txtName = new JTextField();
        pnlForm.add(txtName);

        pnlForm.add(new JLabel("Precio:"));
        txtPrice = new JTextField();
        pnlForm.add(txtPrice);

        btnAdd = new JButton("Agregar");
        pnlForm.add(btnAdd);

        tblProducts = new JTable();
        // Aquí deberías configurar el modelo de la tabla para mostrar los productos
        add(new JScrollPane(tblProducts), BorderLayout.CENTER);

        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aquí deberías añadir el código para agregar un nuevo producto
                // usando los datos ingresados en txtName y txtPrice
            }
        });
    }
}
