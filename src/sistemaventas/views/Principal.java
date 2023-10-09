/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemaventas.views;

import java.awt.Color;

/**
 *
 * @author Kaniory
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpMain = new javax.swing.JDesktopPane();
        panel = new javax.swing.JPanel();
        jPanelMenu = new javax.swing.JPanel();
        jpProducto = new javax.swing.JPanel();
        jlProducto = new javax.swing.JLabel();
        jpCliente = new javax.swing.JPanel();
        jlCliente = new javax.swing.JLabel();
        jpVentas = new javax.swing.JPanel();
        jlVentas = new javax.swing.JLabel();
        jpDetalleVentas = new javax.swing.JPanel();
        jlDetalleVentas = new javax.swing.JLabel();
        jpHeader = new javax.swing.JPanel();
        jpSalir = new javax.swing.JPanel();
        jlSalir = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jdpMain.setBackground(new java.awt.Color(255, 255, 255));
        jdpMain.setPreferredSize(new java.awt.Dimension(800, 700));

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenu.setBackground(new java.awt.Color(0, 0, 153));
        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpProducto.setBackground(new java.awt.Color(0, 0, 153));

        jlProducto.setBackground(new java.awt.Color(204, 204, 204));
        jlProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlProducto.setForeground(new java.awt.Color(255, 255, 255));
        jlProducto.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlProducto.setText("Producto ");
        jlProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlProductoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlProductoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlProductoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jpProductoLayout = new javax.swing.GroupLayout(jpProducto);
        jpProducto.setLayout(jpProductoLayout);
        jpProductoLayout.setHorizontalGroup(
            jpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpProductoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpProductoLayout.setVerticalGroup(
            jpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpProductoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelMenu.add(jpProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 173, 30));

        jpCliente.setBackground(new java.awt.Color(0, 0, 153));
        jpCliente.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jpClienteCaretPositionChanged(evt);
            }
        });

        jlCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlCliente.setForeground(new java.awt.Color(255, 255, 255));
        jlCliente.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlCliente.setText("Cliente ");
        jlCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlClienteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlClienteMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jpClienteLayout = new javax.swing.GroupLayout(jpCliente);
        jpCliente.setLayout(jpClienteLayout);
        jpClienteLayout.setHorizontalGroup(
            jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpClienteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpClienteLayout.setVerticalGroup(
            jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpClienteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelMenu.add(jpCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 173, 30));

        jpVentas.setBackground(new java.awt.Color(0, 0, 153));

        jlVentas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlVentas.setForeground(new java.awt.Color(255, 255, 255));
        jlVentas.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlVentas.setText("Ventas ");
        jlVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlVentasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlVentasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlVentasMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jpVentasLayout = new javax.swing.GroupLayout(jpVentas);
        jpVentas.setLayout(jpVentasLayout);
        jpVentasLayout.setHorizontalGroup(
            jpVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
        );
        jpVentasLayout.setVerticalGroup(
            jpVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelMenu.add(jpVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 173, 30));

        jpDetalleVentas.setBackground(new java.awt.Color(0, 0, 153));

        jlDetalleVentas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlDetalleVentas.setForeground(new java.awt.Color(255, 255, 255));
        jlDetalleVentas.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlDetalleVentas.setText("Detalles de ventas ");
        jlDetalleVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlDetalleVentasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlDetalleVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlDetalleVentasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlDetalleVentasMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jpDetalleVentasLayout = new javax.swing.GroupLayout(jpDetalleVentas);
        jpDetalleVentas.setLayout(jpDetalleVentasLayout);
        jpDetalleVentasLayout.setHorizontalGroup(
            jpDetalleVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlDetalleVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
        );
        jpDetalleVentasLayout.setVerticalGroup(
            jpDetalleVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlDetalleVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelMenu.add(jpDetalleVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 173, 30));

        panel.add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 173, 700));

        jpHeader.setBackground(new java.awt.Color(255, 255, 255));
        jpHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpSalir.setBackground(new java.awt.Color(255, 255, 255));
        jpSalir.setForeground(new java.awt.Color(255, 255, 255));
        jpSalir.setPreferredSize(new java.awt.Dimension(34, 34));

        jlSalir.setBackground(new java.awt.Color(204, 0, 0));
        jlSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSalir.setText("x");
        jlSalir.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jlSalir.setPreferredSize(new java.awt.Dimension(34, 34));
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlSalirMousePressed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpHeader.add(jpSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 36, 20));

        panel.add(jpHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo fravemax azul.png"))); // NOI18N
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        jdpMain.setLayer(panel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpMainLayout = new javax.swing.GroupLayout(jdpMain);
        jdpMain.setLayout(jdpMainLayout);
        jdpMainLayout.setHorizontalGroup(
            jdpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jdpMainLayout.setVerticalGroup(
            jdpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_jlSalirMouseClicked

    private void jlSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSalirMousePressed
        jpSalir.setBackground(new Color(255,51,51));
        jlSalir.setForeground(Color.black);
    }//GEN-LAST:event_jlSalirMousePressed

    private void jlSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSalirMouseExited
        
        jpSalir.setBackground(Color.white);
        jlSalir.setForeground(Color.black);
    }//GEN-LAST:event_jlSalirMouseExited

    private void jlSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSalirMouseEntered
        
        jpSalir.setBackground(new Color(204,0,0));
        jlSalir.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_jlSalirMouseEntered

    private void jlProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlProductoMouseClicked
        panel.setVisible(false);
        ProductosView p = new ProductosView();
        p.setVisible(true);
        jdpMain.add(p);
        jdpMain.moveToFront(p);
    }//GEN-LAST:event_jlProductoMouseClicked

    private void jlProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlProductoMouseEntered
        jpProducto.setBackground(new Color(0, 51, 153));
        jlProducto.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_jlProductoMouseEntered

    private void jlProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlProductoMouseExited
        jpProducto.setBackground(new Color(0,0,153));
        jlProducto.setForeground(Color.white);
    }//GEN-LAST:event_jlProductoMouseExited

    private void jlClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlClienteMouseClicked
        panel.setVisible(false);
        ClientesView c = new ClientesView();
        c.setVisible(true);
        jdpMain.add(c);
        jdpMain.moveToFront(c);
    }//GEN-LAST:event_jlClienteMouseClicked

    private void jpClienteCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jpClienteCaretPositionChanged
        // ignoren
    }//GEN-LAST:event_jpClienteCaretPositionChanged

    private void jlClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlClienteMouseEntered
        jpCliente.setBackground(new Color(0, 51, 153));
        jlCliente.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_jlClienteMouseEntered

    private void jlClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlClienteMouseExited
        jpCliente.setBackground(new Color(0,0,153));
        jlCliente.setForeground(Color.white);
    }//GEN-LAST:event_jlClienteMouseExited

    private void jlVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlVentasMouseClicked
        panel.setVisible(false);
        VentasView vvw = new VentasView();
        vvw.setVisible(true);
        jdpMain.add(vvw);
        jdpMain.moveToFront(vvw);
    }//GEN-LAST:event_jlVentasMouseClicked

    private void jlVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlVentasMouseEntered
        jpVentas.setBackground(new Color(0, 51, 153));
        jlVentas.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_jlVentasMouseEntered

    private void jlVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlVentasMouseExited
        jpVentas.setBackground(new Color(0,0,153));
        jlVentas.setForeground(Color.white);
    }//GEN-LAST:event_jlVentasMouseExited

    private void jlDetalleVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlDetalleVentasMouseClicked
        
        panel.setVisible(false);
        DetalleVentaView detaVentas = new DetalleVentaView();
        detaVentas.setVisible(true);
        jdpMain.add(detaVentas);
        jdpMain.moveToFront(detaVentas);
    }//GEN-LAST:event_jlDetalleVentasMouseClicked

    private void jlDetalleVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlDetalleVentasMouseEntered
        jpDetalleVentas.setBackground(new Color(0, 51, 153));
        jlDetalleVentas.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_jlDetalleVentasMouseEntered

    private void jlDetalleVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlDetalleVentasMouseExited
        jpDetalleVentas.setBackground(new Color(0,0,153));
        jlDetalleVentas.setForeground(Color.white);
    }//GEN-LAST:event_jlDetalleVentasMouseExited

    private void jlDetalleVentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlDetalleVentasMousePressed
        jpDetalleVentas.setBackground(Color.white);
        jlDetalleVentas.setForeground(Color.black);
    }//GEN-LAST:event_jlDetalleVentasMousePressed

    private void jlProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlProductoMousePressed
        jpProducto.setBackground(Color.white);
        jlProducto.setForeground(Color.black);
    }//GEN-LAST:event_jlProductoMousePressed

    private void jlClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlClienteMousePressed
        jpCliente.setBackground(Color.white);
        jlCliente.setForeground(Color.black);
    }//GEN-LAST:event_jlClienteMousePressed

    private void jlVentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlVentasMousePressed
        jpVentas.setBackground(Color.white);
        jlVentas.setForeground(Color.black);
    }//GEN-LAST:event_jlVentasMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    public void mostrarMenu(){
        panel.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JDesktopPane jdpMain;
    private javax.swing.JLabel jlCliente;
    private javax.swing.JLabel jlDetalleVentas;
    private javax.swing.JLabel jlProducto;
    private javax.swing.JLabel jlSalir;
    private javax.swing.JLabel jlVentas;
    private javax.swing.JPanel jpCliente;
    private javax.swing.JPanel jpDetalleVentas;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JPanel jpProducto;
    private javax.swing.JPanel jpSalir;
    private javax.swing.JPanel jpVentas;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
