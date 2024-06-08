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
                String name = txtName.getText();
                double price;
                try {
                    price = Double.parseDouble(txtPrice.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(ProductWindow.this, "El precio debe ser un número.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Aquí deberías añadir el código para agregar un nuevo producto
                // Por ejemplo, si tienes una lista de productos, podrías hacer algo como esto:
                // productList.add(new Product(name, price));

                // Luego, deberías actualizar la tabla de productos para mostrar el nuevo producto
                // Por ejemplo, si estás usando un DefaultTableModel, podrías hacer algo como esto:
                // ((DefaultTableModel) tblProducts.getModel()).addRow(new Object[] {name, price});

                // Finalmente, deberías limpiar los campos de texto para el próximo producto
                txtName.setText("");
                txtPrice.setText("");
            }
        });
    }
}
