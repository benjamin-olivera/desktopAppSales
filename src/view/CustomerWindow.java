package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CustomerWindow extends JFrame {
    private JTextField txtName;
    private JTextField txtAddress;
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
                // Aquí deberías añadir el código para agregar un nuevo cliente
                // usando los datos ingresados en txtName y txtAddress
            }
        });
    }
}
