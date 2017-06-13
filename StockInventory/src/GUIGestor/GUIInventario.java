/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIGestor;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Gestor.*;

public class GUIInventario extends JFrame implements ActionListener {

    protected JButton bCrear, bBorrar, bEditar, bActualizar;
    protected JTextField marca, descripcion, cantidad;
    protected JLabel etMarca, etDescripcion, etCantidad;
    protected JList lista;
    protected DefaultListModel modelo;
    protected Inventario inventario;

    public GUIInventario(String title) {
        super(title);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inventario = new Inventario();

        bCrear = new JButton("crear");
        bCrear.setBounds(10, 60, 100, 20);
        bCrear.addActionListener(this);
        this.add(bCrear);

        bEditar = new JButton("editar");
        bEditar.setBounds(120, 60, 100, 20);
        bEditar.addActionListener(this);
        this.add(bEditar);

        bBorrar = new JButton("borrar");
        bBorrar.setBounds(340, 60, 100, 20);
        bBorrar.addActionListener(this);
        this.add(bBorrar);

        bActualizar = new JButton("actualizar");
        bActualizar.setBounds(230, 60, 100, 20);
        bActualizar.addActionListener(this);
        this.add(bActualizar);

        marca = new JTextField();
        marca.setBounds(10, 20, 100, 20);
        this.add(marca);

        descripcion = new JTextField();
        descripcion.setBounds(120, 20, 100, 20);
        this.add(descripcion);

        cantidad = new JTextField();
        cantidad.setBounds(230, 20, 100, 20);
        this.add(cantidad);

        etMarca = new JLabel("marca");
        etMarca.setBounds(10, 0, 100, 20);
        this.add(etMarca);

        etDescripcion = new JLabel("descripcion");
        etDescripcion.setBounds(120, 0, 100, 20);
        this.add(etDescripcion);

        etCantidad = new JLabel("cantidad");
        etCantidad.setBounds(230, 0, 100, 20);
        this.add(etCantidad);

        modelo = new DefaultListModel();

        lista = new JList();
        lista.setBounds(10, 100, 400, 200);
        lista.setModel(modelo);
        this.add(lista);

    }

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == bCrear) {
            int cant = Integer.parseInt(cantidad.getText());
            inventario.agregarProducto(marca.getText(), descripcion.getText(), cant);
            marca.setText("");
            descripcion.setText("");
            cantidad.setText("");

        }

        if (evt.getSource() == bEditar) {
            int pos = lista.getSelectedIndex();
            //try {

            if (!"".equals(marca.getText()) && "".equals(descripcion.getText()) && "".equals(cantidad.getText())) {
                inventario.getProducto(pos).setMarca(marca.getText());
                modelo.setElementAt(inventario.getProducto(pos), pos);
                marca.setText("");

            }

            if ("".equals(marca.getText()) && !"".equals(descripcion.getText()) && "".equals(cantidad.getText())) {
                inventario.getProducto(pos).setDescripcion(descripcion.getText());
                modelo.setElementAt(inventario.getProducto(pos), pos);
                descripcion.setText("");

            }
            if ("".equals(marca.getText()) && "".equals(descripcion.getText()) && !"".equals(cantidad.getText())) {
                int cant=Integer.parseInt(cantidad.getText());
                inventario.getProducto(pos).setCantidad(cant);
                modelo.setElementAt(inventario.getProducto(pos), pos);
                cantidad.setText("");

            }

            /*} catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ingrese rut o nombre a modificar de la persona");
            }*/
        }

        if (evt.getSource() == bBorrar) {
            int pos = lista.getSelectedIndex();
            modelo.remove(pos);
            inventario.eliminarProducto(pos);

        }
        if (evt.getSource() == bActualizar) {
            modelo.clear();
            for (int i = 0; i < inventario.retDimension(); i++) {
                modelo.addElement(inventario.getProducto(i)+" "+inventario.getProducto(i).getCantidad());
            }
        }

    }

}
