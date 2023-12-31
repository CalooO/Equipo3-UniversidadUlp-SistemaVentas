/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaventas.views;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
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
        setearIcono(jLabel7, "src/Imagenes/logo fravemax azul.png");
        panel2.setBackground(new Color(255, 255, 255));
        modelo();
        tamañoColumna();
        listarClientes();

        borrado();
    }

    private DefaultTableModel tabla = new DefaultTableModel() {

        public boolean isCellEditable(int f, int c) {

            return false;
        }
    };

    private void modelo() {
        tabla.addColumn("ID");
        tabla.addColumn("Apellido");
        tabla.addColumn("Nombre");
        tabla.addColumn("Domicilio");
        tabla.addColumn("Telefono");

        jtTable.setModel(tabla);

    }
    private void tamañoColumna() {
        TableColumnModel columnModel = jtTable.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(22);
        columnModel.getColumn(1).setPreferredWidth(80);
        columnModel.getColumn(2).setPreferredWidth(80);
        columnModel.getColumn(3).setPreferredWidth(100);
        columnModel.getColumn(4).setPreferredWidth(50);

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
        panel2 = new java.awt.Panel();
        jtBotonGuardar = new javax.swing.JButton();
        jtBotonModificar = new javax.swing.JButton();
        jtBotonEliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtDomicilio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        jtBotonBuscar = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jpSalir = new javax.swing.JPanel();
        jlSalir = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jTextField2.setText("jTextField1");

        panel2.setForeground(new java.awt.Color(255, 255, 255));
        panel2.setPreferredSize(new java.awt.Dimension(700, 520));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtBotonGuardar.setText("Guardar");
        jtBotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBotonGuardarActionPerformed(evt);
            }
        });
        panel2.add(jtBotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 448, 83, -1));

        jtBotonModificar.setText("Modificar");
        jtBotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBotonModificarActionPerformed(evt);
            }
        });
        panel2.add(jtBotonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 448, -1, -1));

        jtBotonEliminar.setText("Eliminar");
        jtBotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBotonEliminarActionPerformed(evt);
            }
        });
        panel2.add(jtBotonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 448, 83, -1));

        jLabel5.setText("Telefono");
        panel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 319, -1, -1));

        jtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtTelefonoKeyTyped(evt);
            }
        });
        panel2.add(jtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 315, 152, -1));

        jLabel4.setText("Domicilio");
        panel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 277, -1, -1));

        jtDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDomicilioKeyTyped(evt);
            }
        });
        panel2.add(jtDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 273, 152, -1));

        jLabel3.setText("Nombre");
        panel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 235, -1, -1));

        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
        });
        panel2.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 231, 152, -1));

        jLabel2.setText("Apellido");
        panel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 193, -1, -1));

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
        panel2.add(jtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 189, 152, -1));

        jLabel6.setText("Id");
        panel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 147, -1, -1));

        jtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIdActionPerformed(evt);
            }
        });
        jtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtIdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtIdKeyTyped(evt);
            }
        });
        panel2.add(jtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 147, 62, -1));

        jtBotonBuscar.setText("Buscar");
        jtBotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBotonBuscarActionPerformed(evt);
            }
        });
        panel2.add(jtBotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 139, -1, -1));

        panel1.setBackground(new java.awt.Color(0, 0, 153));
        panel1.setPreferredSize(new java.awt.Dimension(700, 100));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CLIENTES");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 103, 27));

        jLabel7.setPreferredSize(new java.awt.Dimension(100, 100));
        panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 114, -1));

        jpSalir.setBackground(new java.awt.Color(0, 51, 153));

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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlSalirMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jpSalirLayout = new javax.swing.GroupLayout(jpSalir);
        jpSalir.setLayout(jpSalirLayout);
        jpSalirLayout.setHorizontalGroup(
            jpSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpSalirLayout.setVerticalGroup(
            jpSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel1.add(jpSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, -1, -1));

        panel2.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jtTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jtTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtTable);

        panel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 117, 400, 363));

        jButton1.setText("Borrar datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 386, 133, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        if (num >= 33 && num <= 64 || num >= 91 && num <= 96
                || num >= 123 && num <= 208 || num >= 210 && num <= 240
                || num >= 242 && num <= 255) {
            evt.consume();
        }
    }//GEN-LAST:event_jtApellidoKeyTyped

    private void jtApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoKeyReleased
        // TODO add your handling code here:
        if (!jtApellido.getText().isEmpty()) {
            jtTable.clearSelection();
            listarClientes();
        }

    }//GEN-LAST:event_jtApellidoKeyReleased

    private void jtApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jtApellidoKeyPressed

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
        // TODO add your handling code here:
        int num = evt.getKeyChar();
        if (num >= 33 && num <= 64 || num >= 91 && num <= 96
                || num >= 123 && num <= 208 || num >= 210 && num <= 240
                || num >= 242 && num <= 255) {
            evt.consume();
        }
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jtDomicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDomicilioKeyTyped
        // TODO add your handling code here:
        int num = evt.getKeyChar();
        if (num >= 33 && num <= 47 || num >= 58 && num <= 64 || num >= 91 && num <= 96
                || num >= 123 && num <= 208 || num >= 210 && num <= 240
                || num >= 242 && num <= 255) {
            evt.consume();
        }
    }//GEN-LAST:event_jtDomicilioKeyTyped

    private void jtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTelefonoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_jtTelefonoKeyTyped

    private void jtTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTableMouseClicked
        // TODO add your handling code here:
        if (jtTable.getSelectedRow() != -1) {
            int fila = jtTable.getSelectedRow();
            jtId.setText(jtTable.getValueAt(fila, 0) + "");
            jtApellido.setText(jtTable.getValueAt(fila, 1) + "");
            jtNombre.setText(jtTable.getValueAt(fila, 2) + "");
            jtDomicilio.setText(jtTable.getValueAt(fila, 3) + "");
            jtTelefono.setText(jtTable.getValueAt(fila, 4) + "");

            //listarProductos();
        }
    }//GEN-LAST:event_jtTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        jtId.setText("");
        jtApellido.setText("");
        jtNombre.setText("");
        jtDomicilio.setText("");
        jtTelefono.setText("");
        jtTable.clearSelection();
        listarClientes();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jlSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSalirMouseClicked

        Principal mainFrame = (Principal) SwingUtilities.getWindowAncestor(this);
        if (mainFrame != null) {
            // Llama al método en MainFrame
            mainFrame.mostrarMenu();
        }

        this.dispose();
    }//GEN-LAST:event_jlSalirMouseClicked

    private void jlSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSalirMouseEntered

        jpSalir.setBackground(new Color(204, 0, 0));
        jlSalir.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_jlSalirMouseEntered

    private void jlSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSalirMouseExited

        jpSalir.setBackground(new Color(0, 51, 153));
        jlSalir.setForeground(Color.white);
    }//GEN-LAST:event_jlSalirMouseExited

    private void jlSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSalirMousePressed
        jpSalir.setBackground(new Color(255, 51, 51));
        jlSalir.setForeground(Color.black);
    }//GEN-LAST:event_jlSalirMousePressed

    private void jtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_jtIdKeyTyped

    private void jtIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdKeyReleased
        // TODO add your handling code here:
        if (!jtId.getText().isEmpty()) {
            jtTable.clearSelection();
            listarClientes();
        }
    }//GEN-LAST:event_jtIdKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.components.JSpinField jSpinField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel jlSalir;
    private javax.swing.JPanel jpSalir;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JButton jtBotonBuscar;
    private javax.swing.JButton jtBotonEliminar;
    private javax.swing.JButton jtBotonGuardar;
    private javax.swing.JButton jtBotonModificar;
    private javax.swing.JTextField jtDomicilio;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTable jtTable;
    private javax.swing.JTextField jtTelefono;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    // End of variables declaration//GEN-END:variables

    public void listarClientes() {
        ClienteData cd = new ClienteData();
        if (jtTable.getSelectedRow() == -1) {
            if (!jtId.getText().equalsIgnoreCase("") || !jtApellido.getText().isEmpty()) {
                tabla.setRowCount(0);
                for (Cliente cliente : cd.listarClientePorApellidoYId(jtId.getText(), jtApellido.getText())) {
                    tabla.addRow(new Object[]{cliente.getIdCliente(), cliente.getApellido(),
                        cliente.getNombre(), cliente.getDireccion(), cliente.getTelefono()});
                }
            } else {
                tabla.setRowCount(0);
                for (Cliente cliente : cd.listarCliente()) {
                    tabla.addRow(new Object[]{cliente.getIdCliente(), cliente.getApellido(), cliente.getNombre(), cliente.getDireccion(), cliente.getTelefono()});
                    }
            }
        }
    }

    public void borrado() {
        jtId.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                listarClientes();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }

        });

        jtApellido.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                listarClientes();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }

        });

    }

    private void setearIcono(JLabel jLabelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
        jLabelName.setIcon(icon);
        this.repaint();
    }

}
