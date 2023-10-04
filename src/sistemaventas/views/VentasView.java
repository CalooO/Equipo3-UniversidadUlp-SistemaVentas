/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package sistemaventas.views;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import sistemaventas.accesoDatos.*;
import sistemaventas.entidades.*;

/**
 *
 * @author Sergio
 */
public class VentasView extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentasView
     */
    public VentasView() {
        initComponents();
        llenarClientes();
        llenarProductos();
        jtStock.setEditable(false);
        jtPrecio.setEditable(false);
    }

    private void llenarClientes() {
        ClienteData clienteData = new ClienteData();
        ArrayList<Cliente> listaClientes = clienteData.listarCliente();
        jcomboCliente.removeAllItems();
        for (Cliente cliente : listaClientes) {
            jcomboCliente.addItem(new Cliente(cliente.getIdCliente(), cliente.getApellido(),
                    cliente.getNombre(), cliente.getDireccion(), cliente.getTelefono()));
        }
    }

    private void llenarProductos() {
        ProductoData productoData = new ProductoData();
        ArrayList<Producto> listaProductos = productoData.listarProducto();
        jcomboProducto.removeAllItems();
        for (Producto producto : listaProductos) {
            jcomboProducto.addItem(new Producto(producto.getIdProducto(), producto.getNombreProducto(),
                    producto.getDescripcion(), producto.getPrecioActual(), producto.getStock(), producto.isEstado()));

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jcomboCliente = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbPago = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jcomboProducto = new javax.swing.JComboBox<>();
        jFecha = new com.toedter.calendar.JDateChooser();
        jtCantidad = new javax.swing.JTextField();
        jrEfectivo = new javax.swing.JRadioButton();
        jrDebito = new javax.swing.JRadioButton();
        jrCredito = new javax.swing.JRadioButton();
        jtPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtStock = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(700, 600));
        setPreferredSize(new java.awt.Dimension(700, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setText("Venta");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jcomboCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(jcomboCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 340, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Fecha");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Producto");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Cantidad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Formas de pago");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Precio");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        jbPago.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbPago.setText("Pago");
        jbPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPagoActionPerformed(evt);
            }
        });
        getContentPane().add(jbPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 100, 40));

        jbSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 100, 40));

        jcomboProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcomboProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboProductoActionPerformed(evt);
            }
        });
        getContentPane().add(jcomboProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 340, -1));
        getContentPane().add(jFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 340, -1));

        jtCantidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCantidadActionPerformed(evt);
            }
        });
        getContentPane().add(jtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 180, -1));

        buttonGroup1.add(jrEfectivo);
        jrEfectivo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jrEfectivo.setText("Efectivo (-5% descuento)");
        jrEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEfectivoActionPerformed(evt);
            }
        });
        getContentPane().add(jrEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        buttonGroup1.add(jrDebito);
        jrDebito.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jrDebito.setText("Débito");
        jrDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrDebitoActionPerformed(evt);
            }
        });
        getContentPane().add(jrDebito, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        buttonGroup1.add(jrCredito);
        jrCredito.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jrCredito.setText("Crédito (+5% Recarga)");
        jrCredito.setToolTipText("");
        jrCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrCreditoActionPerformed(evt);
            }
        });
        getContentPane().add(jrCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        jtPrecio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPrecioActionPerformed(evt);
            }
        });
        getContentPane().add(jtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 340, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Stock");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        jtStock.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtStockActionPerformed(evt);
            }
        });
        getContentPane().add(jtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        Principal mainFrame = (Principal) SwingUtilities.getWindowAncestor(this);
        if (mainFrame != null) {
            // Llama al método en MainFrame
            mainFrame.mostrarMenu();
        }
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jrEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEfectivoActionPerformed
        // TODO add your handling code here:
        Producto producto = (Producto) jcomboProducto.getSelectedItem();
        int cantidad;
        double precio = producto.getPrecioActual();

        if (jtCantidad.getText().isEmpty()) {

            jtPrecio.setText("$" + precio);
        } else {
            cantidad = Integer.parseInt(jtCantidad.getText());
            precio *= cantidad;
            jtPrecio.setText("$" + precio);
        }
        jtPrecio.setText("$" + precio * .95);
    }//GEN-LAST:event_jrEfectivoActionPerformed

    private void jrDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrDebitoActionPerformed
        // TODO add your handling code here:
        Producto producto = (Producto) jcomboProducto.getSelectedItem();
        int cantidad;
        double precio = producto.getPrecioActual();

        if (jtCantidad.getText().isEmpty()) {

            jtPrecio.setText("$" + precio);
        } else {
            cantidad = Integer.parseInt(jtCantidad.getText());
            precio *= cantidad;
            jtPrecio.setText("$" + precio);
        }
        jtPrecio.setText("$" + precio);
    }//GEN-LAST:event_jrDebitoActionPerformed

    private void jtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPrecioActionPerformed

    private void jbPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPagoActionPerformed
        // TODO add your handling code here:
        LocalDate fechaVenta = null;
        Venta venta = null;
        DetalleVenta detalleVenta = null;
        VentaData ventaData = new VentaData();
        DetalleVentaData detalleVentaData = new DetalleVentaData();
        ProductoData productoData = new ProductoData();
        int idCliente, idProducto, stockProd;

        double precio;

        try {

            Cliente cliente = (Cliente) jcomboCliente.getSelectedItem();
            idCliente = cliente.getIdCliente();
            if (jFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().isBefore(LocalDate.now())) {
                fechaVenta = jFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            } else {
                JOptionPane.showMessageDialog(this, "El campo fecha no puede ser posterior al día de hoy.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }
            venta = new Venta(cliente, fechaVenta);

            Producto producto = (Producto) jcomboProducto.getSelectedItem();
            idProducto = producto.getIdProducto();
            stockProd = producto.getStock();
            int cantidad = 0;
            if (!jtCantidad.getText().isEmpty()) {
                cantidad = Integer.parseInt(jtCantidad.getText());
                if (cantidad < 1) {
                    JOptionPane.showMessageDialog(this, "El campo cantidad no debe ser menor a 1", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                } else if (cantidad > stockProd) {
                    JOptionPane.showMessageDialog(this, "El campo cantidad no debe ser mayor al stock", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "El campo cantidad no debe estar vacio", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);

            }
            precio = Double.parseDouble(jtPrecio.getText().substring(1));

            /// fijarse que este todo bien antes de guardar la venta
            // y hacerlo antes 
            ventaData.guardarVenta(venta);
            detalleVenta = new DetalleVenta(cantidad, venta, precio, producto);
            detalleVentaData.guardarDetalleVenta(detalleVenta);
            stockProd -= cantidad;
            producto.setStock(stockProd);
            
            productoData.modificarProducto(producto);
            if (stockProd == 0) {
               productoData.borrarProducto(producto.getIdProducto());
            }
        } catch (NumberFormatException e) {
           JOptionPane.showMessageDialog(this, "El campo cantidad debe ser de formato numerico entero y sin puntos", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
//        } catch (NullPointerException e) {
//            JOptionPane.showMessageDialog(this, "El campo fecha es incorrecto, elija una fecha desde el boton del calendario", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
//            jFecha.setDate(null);
        }

    }//GEN-LAST:event_jbPagoActionPerformed

    private void jtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtStockActionPerformed

    private void jcomboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboProductoActionPerformed
        // TODO add your handling code here:
        Producto producto = (Producto) jcomboProducto.getSelectedItem();
        int cantidad;
        double precio = producto.getPrecioActual();
        jtStock.setText("" + producto.getStock());
        if (jtCantidad.getText().isEmpty()) {

            jtPrecio.setText("$" + precio);
        } else {
            cantidad = Integer.parseInt(jtCantidad.getText());
            precio *= cantidad;
            jtPrecio.setText("$" + precio);
        }
        if (jrEfectivo.isSelected()) {
            jtPrecio.setText("$" + precio * .95);
        } else if (jrCredito.isSelected()) {
            jtPrecio.setText("$" + precio * 1.05);
        } else {
            jtPrecio.setText("$" + precio);
        }

    }//GEN-LAST:event_jcomboProductoActionPerformed

    private void jrCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrCreditoActionPerformed
        // TODO add your handling code here:
        Producto producto = (Producto) jcomboProducto.getSelectedItem();
        int cantidad;
        double precio = producto.getPrecioActual();

        if (jtCantidad.getText().isEmpty()) {

            jtPrecio.setText("$" + precio);
        } else {
            cantidad = Integer.parseInt(jtCantidad.getText());
            precio *= cantidad;
            jtPrecio.setText("$" + precio);
        }
        jtPrecio.setText("$" + precio * 1.05);
    }//GEN-LAST:event_jrCreditoActionPerformed

    private void jtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCantidadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser jFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbPago;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Cliente> jcomboCliente;
    private javax.swing.JComboBox<Producto> jcomboProducto;
    private javax.swing.JRadioButton jrCredito;
    private javax.swing.JRadioButton jrDebito;
    private javax.swing.JRadioButton jrEfectivo;
    private javax.swing.JTextField jtCantidad;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtStock;
    // End of variables declaration//GEN-END:variables
}
