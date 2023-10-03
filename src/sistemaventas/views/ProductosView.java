/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package sistemaventas.views;

import javax.swing.SwingUtilities;

/**
 *
 * @author Kaniory
 */
public class ProductosView extends javax.swing.JInternalFrame {

    /**
     * Creates new form ProductosView
     */
    public ProductosView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtPrecio = new javax.swing.JTextField();
        jtStock = new javax.swing.JTextField();
        lbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jrbEstado = new javax.swing.JRadioButton();
        btAgregar = new javax.swing.JButton();
        btBorrar = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        jtDesc = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(700, 600));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("PRODUCTOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jLabel2.setText("Estado");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));

        jLabel3.setText("Codigo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, 20));

        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        jLabel5.setText("Descripcion");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));
        jPanel1.add(jtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 240, -1));
        jPanel1.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 240, -1));
        jPanel1.add(jtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 240, -1));
        jPanel1.add(jtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 240, -1));

        lbl.setText("Precio");
        jPanel1.add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        jLabel7.setText("Stock");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));
        jPanel1.add(jrbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, -1, -1));

        btAgregar.setText("Agregar / Modificar");
        jPanel1.add(btAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, -1, -1));

        btBorrar.setText("Dar de baja");
        jPanel1.add(btBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, -1, -1));

        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        btBuscar.setText("Buscar");
        jPanel1.add(btBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 490, -1, -1));
        jPanel1.add(jtDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 240, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        // TODO add your handling code here:
        jtId.setText("");
        jtNombre.setText("");
        jtDesc.setText("");
        jtPrecio.setText("");
        jtStock.setText("");
        jrbEstado.setSelected(false);
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        Principal mainFrame = (Principal) SwingUtilities.getWindowAncestor(this);
       if (mainFrame != null) {
            // Llama al método en MainFrame
            mainFrame.mostrarMenu();
        }
          this.dispose();
    }//GEN-LAST:event_btSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btBorrar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtDesc;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtStock;
    private javax.swing.JLabel lbl;
    // End of variables declaration//GEN-END:variables
}
