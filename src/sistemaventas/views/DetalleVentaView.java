
package sistemaventas.views;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import sistemaventas.accesoDatos.ClienteData;
import sistemaventas.accesoDatos.DetalleVentaData;
import sistemaventas.accesoDatos.ProductoData;
import sistemaventas.entidades.Cliente;
import sistemaventas.entidades.DetalleVenta;
import sistemaventas.entidades.Producto;

public class DetalleVentaView extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel(){
        
        public boolean isCellEditable(int f, int c){
            
            return false;
        }
    };
    
    private void armarCabecera() {
        modelo.addColumn("Detalles de venta N°");
        modelo.addColumn("ID venta");
        modelo.addColumn("ID producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio de venta");
        jtLista.setModel(modelo);
    }
    
    private void llenarProductos(){
        
        ProductoData prodData = new ProductoData();
        ArrayList<Producto> listProd = prodData.listarProducto();
        jcbProductos.removeAllItems();
        
        for(Producto producto:listProd){
            
            jcbProductos.addItem(new Producto(producto.getIdProducto(), 
                    producto.getNombreProducto(), producto.getDescripcion(), 
                    producto.getPrecioActual(), producto.getStock(), producto.isEstado()));
        }
    }
    
    private void llenarClientes() {
        
        ClienteData clienteData = new ClienteData();
        ArrayList<Cliente> listClien = clienteData.listarCliente();
        jcbClientes.removeAllItems();
        
        for(Cliente cliente:listClien) {
            jcbClientes.addItem(new Cliente(cliente.getIdCliente(), cliente.getApellido(),
                    cliente.getNombre(), cliente.getDireccion(), cliente.getTelefono()));
        }
    }
    
    public DetalleVentaView() {
        initComponents();
        armarCabecera();
        llenarClientes();
        llenarProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jpSalir = new javax.swing.JPanel();
        jlSalir = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLista = new javax.swing.JTable();
        jcbProductos = new javax.swing.JComboBox<>();
        jcbClientes = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(700, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setPreferredSize(new java.awt.Dimension(700, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Detalles de ventas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 530, 100));

        jPanel3.setBackground(new java.awt.Color(0, 0, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpSalir.setBackground(new java.awt.Color(0, 51, 204));

        jlSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlSalir.setForeground(new java.awt.Color(255, 255, 255));
        jlSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSalir.setText("x");
        jlSalir.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jlSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlSalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpSalirLayout = new javax.swing.GroupLayout(jpSalir);
        jpSalir.setLayout(jpSalirLayout);
        jpSalirLayout.setHorizontalGroup(
            jpSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );
        jpSalirLayout.setVerticalGroup(
            jpSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSalirLayout.createSequentialGroup()
                .addComponent(jlSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(jpSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 30));

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

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 690, 70));

        jtLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtLista);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 630, 320));

        jcbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProductosActionPerformed(evt);
            }
        });
        jPanel1.add(jcbProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 140, 40));

        jPanel1.add(jcbClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 160, 140, 40));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 140, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Elija el producto:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 134, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Elija la fecha:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Elija el cliente:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_jlSalirMouseClicked

    private void jcbProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProductosActionPerformed
        
        DetalleVentaData dvd = new DetalleVentaData();
        
        for(int fila = jtLista.getRowCount() - 1; fila >= 0; fila--){
            
            modelo.removeRow(fila);
        }
        
        modelo.setRowCount(0);
        int id = jcbProductos.getItemAt(jcbProductos.getSelectedIndex()).getIdProducto();
//        List<DetalleVenta> listaDvd = dvd.listarDetalleVentasPorProducto(id);
        for(DetalleVenta detaVenta:dvd.listarDetalleVentasPorProducto(id)){
            
            modelo.addRow(new Object[]{
                
                detaVenta.getIdDetalleVenta(),
                detaVenta.getProducto().getIdProducto(),
                detaVenta.getCantidad(),
                detaVenta.getPrecioVenta(),
                detaVenta.getVenta().getIdVenta()
            });
        }
    }//GEN-LAST:event_jcbProductosActionPerformed

    private void jlSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSalirMouseEntered
        jpSalir.setBackground(Color.red);
        jlSalir.setForeground(Color.black);
    }//GEN-LAST:event_jlSalirMouseEntered

    private void jlSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSalirMouseExited
        jpSalir.setBackground(new Color(0, 51, 153));
        jlSalir.setForeground(Color.white);
    }//GEN-LAST:event_jlSalirMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Cliente> jcbClientes;
    private javax.swing.JComboBox<Producto> jcbProductos;
    private javax.swing.JLabel jlSalir;
    private javax.swing.JPanel jpSalir;
    private javax.swing.JTable jtLista;
    // End of variables declaration//GEN-END:variables
}
