package view;
import javax.swing.*;
import java.awt.event.*;

public class MainWindow {
	public static void main(String[] args) {
        JFrame frame = new JFrame("Tienda");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        JMenu mnMantenimiento = new JMenu("Mantenimiento");
        menuBar.add(mnMantenimiento);

        JMenuItem mntmClientes = new JMenuItem("Clientes");
        mnMantenimiento.add(mntmClientes);

        JMenuItem mntmProductos = new JMenuItem("Productos");
        mnMantenimiento.add(mntmProductos);

        JMenu mnVentas = new JMenu("Ventas");
        menuBar.add(mnVentas);

        JMenu mnAlmacen = new JMenu("Almacén");
        menuBar.add(mnAlmacen);

        JMenu mnReportes = new JMenu("Reportes");
        menuBar.add(mnReportes);

        
        mntmClientes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CustomerWindow customerWindow = new CustomerWindow();
                customerWindow.setVisible(true);
            }
        });

        mntmProductos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ProductWindow productWindow = new ProductWindow();
                productWindow.setVisible(true);
            }
        });

        JMenuItem mntmVentas = new JMenuItem("Ventas");
        mnVentas.add(mntmVentas);
        mntmVentas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SalesWindow salesWindow = new SalesWindow();
                salesWindow.setVisible(true);
            }
        });

        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
