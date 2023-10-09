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
        jrDebito.setSelected(true);
//        if (jcomboProducto.getSelectedItem() == null) {
//            JOptionPane.showMessageDialog(this, "No hay productos, reestocke URGENTE", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
//            
//        } else if (jcomboCliente.getSelectedItem() == null) {
//            JOptionPane.showMessageDialog(this, "No ha cargado al cliente, salga y vuelva a intentarlo", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
//            
//        }

    }
    private void limpiarTXT() {
        jtCantidad.setText("");
        jFecha.setDate(null);
    }

    private void llenarClientes() {
        ClienteData clienteData = new ClienteData();
        ArrayList<Cliente> listaClientes = clienteData.listarCliente();
        jcomboCliente.removeAllItems();
        jcomboCliente.addItem(null);
        for (Cliente cliente : listaClientes) {
            jcomboCliente.addItem(new Cliente(cliente.getIdCliente(), cliente.getApellido(),
                    cliente.getNombre(), cliente.getDireccion(), cliente.getTelefono()));
        }
    }

    public void actualizarPrecio() {
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
    }

    private void llenarProductos() {
        ProductoData productoData = new ProductoData();
        ArrayList<Producto> listaProductos = productoData.listarProducto();
        jcomboProducto.removeAllItems();
        jcomboProducto.addItem(null);
        for (Producto producto : listaProductos) {
            if (producto.isEstado()!=false) {
                jcomboProducto.addItem(new Producto(producto.getIdProducto(), producto.getNombreProducto(),
                        producto.getDescripcion(), producto.getPrecioActual(), producto.getStock(), producto.isEstado()));
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel8 = new javax.swing.JLabel();
        jpCuerpo = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
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

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Ventas");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jpCuerpo.setBackground(new java.awt.Color(255, 255, 255));
        jpCuerpo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jpCuerpo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 30));

        jPanel4.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jpCuerpo.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 690, 70));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cliente");
        jpCuerpo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jcomboCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jpCuerpo.add(jcomboCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 340, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Fecha");
        jpCuerpo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Producto");
        jpCuerpo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cantidad");
        jpCuerpo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Formas de pago");
        jpCuerpo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Precio");
        jpCuerpo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));

        jbPago.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbPago.setText("Pago");
        jbPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPagoActionPerformed(evt);
            }
        });
        jpCuerpo.add(jbPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 100, 40));

        jbSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jpCuerpo.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 100, 40));

        jcomboProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcomboProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboProductoActionPerformed(evt);
            }
        });
        jpCuerpo.add(jcomboProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 340, -1));
        jpCuerpo.add(jFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 340, -1));

        jtCantidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCantidadActionPerformed(evt);
            }
        });
        jpCuerpo.add(jtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 180, -1));

        buttonGroup1.add(jrEfectivo);
        jrEfectivo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jrEfectivo.setForeground(new java.awt.Color(0, 0, 0));
        jrEfectivo.setText("Efectivo (-5% descuento)");
        jrEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEfectivoActionPerformed(evt);
            }
        });
        jpCuerpo.add(jrEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        buttonGroup1.add(jrDebito);
        jrDebito.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jrDebito.setForeground(new java.awt.Color(0, 0, 0));
        jrDebito.setText("Débito");
        jrDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrDebitoActionPerformed(evt);
            }
        });
        jpCuerpo.add(jrDebito, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        buttonGroup1.add(jrCredito);
        jrCredito.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jrCredito.setForeground(new java.awt.Color(0, 0, 0));
        jrCredito.setText("Crédito (+5% Recarga)");
        jrCredito.setToolTipText("");
        jrCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrCreditoActionPerformed(evt);
            }
        });
        jpCuerpo.add(jrCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        jtPrecio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPrecioActionPerformed(evt);
            }
        });
        jpCuerpo.add(jtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 340, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Stock");
        jpCuerpo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        jtStock.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtStockActionPerformed(evt);
            }
        });
        jpCuerpo.add(jtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 80, -1));

        getContentPane().add(jpCuerpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        actualizarPrecio();
    }//GEN-LAST:event_jrEfectivoActionPerformed

    private void jrDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrDebitoActionPerformed
        // TODO add your handling code here:
        actualizarPrecio();
    }//GEN-LAST:event_jrDebitoActionPerformed

    private void jtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPrecioActionPerformed

    private void jbPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPagoActionPerformed
        // TODO add your handling code here:
        LocalDate fechaVenta = null;
        Venta venta = new Venta();
        DetalleVenta detalleVenta = null;
        VentaData ventaData = new VentaData();
        DetalleVentaData detalleVentaData = new DetalleVentaData();
        ProductoData productoData = new ProductoData();
        int idCliente, idProducto, stockProd;

        double precio;

        try {
            if (jcomboProducto.getSelectedItem() != null && jcomboCliente.getSelectedItem() != null && !jtCantidad.getText().isEmpty() && jFecha.getDate() != null) {
                Cliente cliente = (Cliente) jcomboCliente.getSelectedItem();
                idCliente = cliente.getIdCliente();
                if (jFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().isBefore(LocalDate.now())) {
                    fechaVenta = jFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                } else {
                    JOptionPane.showMessageDialog(this, "El campo fecha no puede ser posterior al día de hoy.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                }
                venta.setCliente(cliente);
                venta.setFechaVenta(fechaVenta);

                Producto producto = (Producto) jcomboProducto.getSelectedItem();
                idProducto = producto.getIdProducto();
                stockProd = producto.getStock();
                int cantidad = 0;

                cantidad = Integer.parseInt(jtCantidad.getText());
                if (cantidad < 1) {
                    JOptionPane.showMessageDialog(this, "El campo cantidad no debe ser menor a 1", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                } else if (cantidad > stockProd) {
                    JOptionPane.showMessageDialog(this, "El campo cantidad no debe ser mayor al stock", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                } else {

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
                        llenarProductos();
                    }else{
                    jtStock.setText(""+producto.getStock());
                    }
                    limpiarTXT();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Quedan campos vacios, llene todos por favor", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El campo cantidad debe ser de formato numerico entero y sin puntos", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "El campo fecha es incorrecto, elija una fecha desde el boton del calendario", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            jFecha.setDate(null);
        }

    }//GEN-LAST:event_jbPagoActionPerformed

    private void jtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtStockActionPerformed

    private void jcomboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboProductoActionPerformed
        // TODO add your handling code here:
        if(jcomboProducto.getSelectedItem()==null){
            jtPrecio.setText("");
            jtStock.setText("");
        }else{
            actualizarPrecio();
        }
    }//GEN-LAST:event_jcomboProductoActionPerformed

    private void jrCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrCreditoActionPerformed
        // TODO add your handling code here:
        actualizarPrecio();
    }//GEN-LAST:event_jrCreditoActionPerformed

    private void jtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCantidadActionPerformed
        // TODO add your handling code here:
        actualizarPrecio();

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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbPago;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Cliente> jcomboCliente;
    private javax.swing.JComboBox<Producto> jcomboProducto;
    private javax.swing.JPanel jpCuerpo;
    private javax.swing.JRadioButton jrCredito;
    private javax.swing.JRadioButton jrDebito;
    private javax.swing.JRadioButton jrEfectivo;
    private javax.swing.JTextField jtCantidad;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtStock;
    // End of variables declaration//GEN-END:variables
}
