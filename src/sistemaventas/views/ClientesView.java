/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaventas.views;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import sistemaventas.accesoDatos.ClienteData;
import sistemaventas.entidades.Cliente;

/**
 *
 * @author calo_
 */
public class ClientesView extends javax.swing.JInternalFrame {

    ClienteData cd = new ClienteData();
    int resp;

    /**
     * Creates new form ClientesView
     */
    public ClientesView() {
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

        jTextField2 = new javax.swing.JTextField();
        jSpinField1 = new com.toedter.components.JSpinField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtDomicilio = new javax.swing.JTextField();
        jtTelefono = new javax.swing.JTextField();
        jtBotonGuardar = new javax.swing.JButton();
        jtBotonEliminar = new javax.swing.JButton();
        jtBotonModificar = new javax.swing.JButton();
        jtBotonBuscar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jTextField2.setText("jTextField1");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Clientes");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Apellido");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Domicilio");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Telefono");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Id");

        jtId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIdActionPerformed(evt);
            }
        });

        jtApellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtApellidoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtApellidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtApellidoKeyTyped(evt);
            }
        });

        jtNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
        });

        jtDomicilio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDomicilioKeyTyped(evt);
            }
        });

        jtTelefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtTelefonoKeyTyped(evt);
            }
        });

        jtBotonGuardar.setText("Guardar");
        jtBotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBotonGuardarActionPerformed(evt);
            }
        });

        jtBotonEliminar.setText("Eliminar");
        jtBotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBotonEliminarActionPerformed(evt);
            }
        });

        jtBotonModificar.setText("Modificar");
        jtBotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBotonModificarActionPerformed(evt);
            }
        });

        jtBotonBuscar.setText("Buscar");
        jtBotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBotonBuscarActionPerformed(evt);
            }
        });

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jtBotonGuardar)
                        .addGap(54, 54, 54)
                        .addComponent(jtBotonModificar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(jtBotonBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtBotonEliminar)
                        .addGap(36, 36, 36)
                        .addComponent(jButton4)))
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtBotonBuscar))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtBotonGuardar)
                    .addComponent(jtBotonEliminar)
                    .addComponent(jtBotonModificar)
                    .addComponent(jButton4))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdActionPerformed

    private void jtBotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtBotonBuscarActionPerformed
        // TODO add your handling code here:
        try {
            if (!jtId.getText().isEmpty()) {
                Cliente cliente = new Cliente();
                cliente = cd.buscarClientePorId(Integer.parseInt(jtId.getText()));
                if (cliente.getNombre() != null) {
                    jtId.setText(cliente.getIdCliente() + "");
                    jtApellido.setText(cliente.getApellido());
                    jtNombre.setText(cliente.getNombre());
                    jtDomicilio.setText(cliente.getDireccion());
                    jtTelefono.setText(cliente.getTelefono());
                }

            } else {
                JOptionPane.showMessageDialog(this, "Ingrese un numero al campo ID", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }

        } catch (NullPointerException e) {

        } catch (java.lang.NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El campo ID debe ser un numero");
        }

    }//GEN-LAST:event_jtBotonBuscarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Principal mainFrame = (Principal) SwingUtilities.getWindowAncestor(this);
        if (mainFrame != null) {
            // Llama al método en MainFrame
            mainFrame.mostrarMenu();
        }
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jtBotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtBotonGuardarActionPerformed
        // TODO add your handling code here:

        try {
            if (jtId.getText().isEmpty()) {
                if (!jtApellido.getText().isEmpty() && !jtNombre.getText().isEmpty() && !jtDomicilio.getText().isEmpty() && !jtTelefono.getText().isEmpty()) {
                    String apellido = jtApellido.getText();
                    String nombre = jtNombre.getText();
                    String domicilio = jtDomicilio.getText();
                    String telefono = jtTelefono.getText();
                    Cliente cliente = new Cliente();
                    cliente.setApellido(apellido);
                    cliente.setNombre(nombre);
                    cliente.setDireccion(domicilio);
                    cliente.setTelefono(telefono);

                    cd.guardarCliente(cliente);
                } else if (jtId.getText() == null) {
                    JOptionPane.showMessageDialog(this, "El id se genera automaticamente", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    jtId.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Quedan campos vacios, llene todos excepto el Id", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(this, "El campo ID debe estar vacio");
            }

        } catch (java.lang.RuntimeException e) {
            JOptionPane.showMessageDialog(this, "??", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jtBotonGuardarActionPerformed

    private void jtBotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtBotonModificarActionPerformed
        // TODO add your handling code here:

        try {

            if (!jtId.getText().isEmpty() && !jtApellido.getText().isEmpty() && !jtNombre.getText().isEmpty() && !jtDomicilio.getText().isEmpty() && !jtTelefono.getText().isEmpty()) {
                int id = Integer.parseInt(jtId.getText());
                String apellido = jtApellido.getText();
                String nombre = jtNombre.getText();
                String domicilio = jtDomicilio.getText();
                String telefono = jtTelefono.getText();
                Cliente cliente = new Cliente();
                cliente.setIdCliente(id);
                cliente.setApellido(apellido);
                cliente.setNombre(nombre);
                cliente.setDireccion(domicilio);
                cliente.setTelefono(telefono);

                cd.modificarCliente(cliente);
            } else if (jtId.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese un ID para modificar un cliente", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                jtId.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Quedan campos vacios, llene todos excepto el Id", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }

        } catch (java.lang.RuntimeException e) {
            JOptionPane.showMessageDialog(this, "??", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jtBotonModificarActionPerformed

    private void jtBotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtBotonEliminarActionPerformed
        // TODO add your handling code here:
        if (!jtId.getText().isEmpty()) {
            resp = JOptionPane.showConfirmDialog(this, "¿Estas seguro que deseas eliminar a este usuario?", "",
                    JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (resp == 0) {

                Cliente cliente = new Cliente();
                cliente = cd.buscarClientePorId(Integer.parseInt(jtId.getText()));
                if (cliente.getNombre() != null) {
                    cd.eliminarInfoCliente(cliente);
                    JOptionPane.showMessageDialog(this, "Se ha eliminado el cliente exitosamente");
                }

            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese un ID para eliminar un cliente");
        }

    }//GEN-LAST:event_jtBotonEliminarActionPerformed

    private void jtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoKeyTyped
        // TODO add your handling code here:
//        char c = evt.getKeyChar();
//        if((c<'A' || c>'Z') && (c<'a' || c>'z') && (c!='ñ' || c!='Ñ')){
//            evt.consume();
//        }
        int num = evt.getKeyChar();
        if (num>=33 && num<=64 || num>=91 && num<=96 
                || num>=123 && num<=208 || num>=210 && num<=240 
                || num>=242 && num<=255) {
            evt.consume();
        }
    }//GEN-LAST:event_jtApellidoKeyTyped

    private void jtApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jtApellidoKeyReleased

    private void jtApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jtApellidoKeyPressed

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
        // TODO add your handling code here:
        int num = evt.getKeyChar();
        if (num>=33 && num<=64 || num>=91 && num<=96 
                || num>=123 && num<=208 || num>=210 && num<=240 
                || num>=242 && num<=255) {
            evt.consume();
        }
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jtDomicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDomicilioKeyTyped
        // TODO add your handling code here:
        int num = evt.getKeyChar();
        if (num>=33 && num<=47 || num>=58 && num<=64 || num>=91 && num<=96 
                || num>=123 && num<=208 || num>=210 && num<=240 
                || num>=242 && num<=255) {
            evt.consume();
        }
    }//GEN-LAST:event_jtDomicilioKeyTyped

    private void jtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTelefonoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(c<'0' || c>'9'){
            evt.consume();
        }
    }//GEN-LAST:event_jtTelefonoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private com.toedter.components.JSpinField jSpinField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JButton jtBotonBuscar;
    private javax.swing.JButton jtBotonEliminar;
    private javax.swing.JButton jtBotonGuardar;
    private javax.swing.JButton jtBotonModificar;
    private javax.swing.JTextField jtDomicilio;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTelefono;
    // End of variables declaration//GEN-END:variables
}
