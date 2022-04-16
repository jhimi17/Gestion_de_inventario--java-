package Source;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
 import java.util.Calendar;
 import java.util.Calendar;
//import javax.swing.JTextField;

public class AddRowJTable extends javax.swing.JFrame {

    DefaultTableModel dtm;  // PARA LOS MEODOS DE AGREGAR Y MODIFICAR
    Object[] o = new Object[11];
    int filaSeleccionada = -1;

    public AddRowJTable() {
        initComponents();
        setTitle("COOPERATIVA HUALLAGA CORP");
        setLocationRelativeTo(null);
        dtm = (DefaultTableModel) tUsuario.getModel();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tUsuario = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CBXestado = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtFEntrega = new javax.swing.JTextField();
        txtResponsable = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtFFabricacion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtGarantia = new javax.swing.JTextField();
        jdtEntrega = new com.toedter.calendar.JDateChooser();
        BTpasar = new javax.swing.JButton();
        jdtFabricacion = new com.toedter.calendar.JDateChooser();
        btnGenerar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 204));
        setResizable(false);

        tUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "CODIGO", "MODELO", "MARCA", "PRECIO", "ESTADO", "OFICINA DESTINO", "F. ENTREGA", "F. FABRICACION", "GARANTIA", "RESPONSABLE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tUsuario);

        btnAdd.setText("Añadir");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel1.setText("NOMBRE:");

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel2.setText("CODIGO:");

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jLabel3.setText("MODELO:");

        txtModelo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        btnEdit.setText("Modificar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel4.setText("OFICINA DESTINO:");

        jLabel5.setText("MARCA:");

        jLabel6.setText("PRECIO:");

        txtDestino.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDestinoActionPerformed(evt);
            }
        });

        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        txtMarca.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        jLabel7.setText("ESTADO DEL PRODUCTO:");

        CBXestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BUENO", "MALO", "REGULAR", "POR REPARAR", "INSERVIBLE" }));
        CBXestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBXestadoActionPerformed(evt);
            }
        });

        jLabel8.setText("FECHA DE ENTRAGA:");

        txtFEntrega.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtFEntrega.setEnabled(false);
        txtFEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFEntregaActionPerformed(evt);
            }
        });

        txtResponsable.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResponsableActionPerformed(evt);
            }
        });

        jLabel9.setText("RESPONSABLE:");

        jLabel10.setText("FECHA DE FABRICACION:");

        txtFFabricacion.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtFFabricacion.setEnabled(false);
        txtFFabricacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFFabricacionActionPerformed(evt);
            }
        });

        jLabel11.setText("GARANTIA:");

        txtGarantia.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        BTpasar.setText("Guardar  fechas");
        BTpasar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTpasarActionPerformed(evt);
            }
        });

        btnGenerar.setText("GUARDAR EN TXT");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                        .addComponent(txtModelo)
                                        .addComponent(txtNombre)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtGarantia, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFFabricacion, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(CBXestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jdtEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jdtFabricacion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTpasar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(261, 261, 261)
                                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdd))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel7)
                        .addComponent(CBXestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEdit)
                        .addComponent(jLabel6)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(jdtEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelete)
                        .addComponent(jLabel4)
                        .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addComponent(jdtFabricacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BTpasar))
                .addGap(11, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFFabricacion, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnGenerar)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        o[0] = txtNombre.getText();        // PARA AÑADIR EN LA TABLA
        o[1] = txtCodigo.getText();
        o[2] = txtModelo.getText(); 
        o[3] = txtMarca.getText ();
        o[4] = txtPrecio.getText ();
        o[5] = CBXestado.getSelectedItem();
        o[6] = txtDestino.getText ();
        o[7] = txtFEntrega.getText ();
        o[8] = txtFFabricacion.getText ();
        o[9] = txtGarantia.getText ();
        o[10] = txtResponsable.getText ();
        
        dtm.addRow(o);   // lo que hace es crear la fila
        for (int i = 0; i < o.length; i++) {
            o[i] = "";             // para limpiar el vector
        }
        limpiar();
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        txtCodigo.grabFocus();
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        txtModelo.grabFocus();
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (filaSeleccionada != -1) {
            tUsuario.setValueAt(txtNombre.getText(), filaSeleccionada, 0);   // para el boton modificar
            tUsuario.setValueAt(txtCodigo.getText(), filaSeleccionada, 1);
            tUsuario.setValueAt(txtModelo.getText(), filaSeleccionada, 2);
             tUsuario.setValueAt(txtMarca.getText(),filaSeleccionada, 3);
            tUsuario.setValueAt(txtPrecio.getText(),filaSeleccionada, 4);
           // CBXestado.setSelectItem(tUsuario.getValueAt(filaSeleccionada, 5).toString());
            tUsuario.setValueAt(txtDestino.getText(),filaSeleccionada, 6);
            tUsuario.setValueAt(txtFEntrega.getText(),filaSeleccionada, 7);
            tUsuario.setValueAt(txtFFabricacion.getText(),filaSeleccionada, 8);
            tUsuario.setValueAt(txtGarantia.getText(),filaSeleccionada, 9);
            tUsuario.setValueAt(txtResponsable.getText(),filaSeleccionada, 10);
            
            limpiar();
            filaSeleccionada = -1;
        } else {
            JOptionPane.showMessageDialog(null, "No has cargado datos");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        filaSeleccionada = tUsuario.getSelectedRow();
        if (filaSeleccionada != -1) {
            limpiar();
            txtNombre.setText(tUsuario.getValueAt(filaSeleccionada, 0).toString()); // para buscar los datos
            txtCodigo.setText(tUsuario.getValueAt(filaSeleccionada, 1).toString());
            txtModelo.setText(tUsuario.getValueAt(filaSeleccionada, 2).toString());
            txtMarca.setText(tUsuario.getValueAt(filaSeleccionada, 3).toString());
            txtPrecio.setText(tUsuario.getValueAt(filaSeleccionada, 4).toString());
           // CBXestado.setSelectItem(tUsuario.getValueAt(filaSeleccionada, 5).toString());
            txtDestino.setText(tUsuario.getValueAt(filaSeleccionada, 6).toString());
            txtFEntrega.setText(tUsuario.getValueAt(filaSeleccionada, 7).toString());
            txtFFabricacion.setText(tUsuario.getValueAt(filaSeleccionada, 8).toString());
            txtGarantia.setText(tUsuario.getValueAt(filaSeleccionada, 9).toString());
            txtResponsable.setText(tUsuario.getValueAt(filaSeleccionada, 10).toString());
         
            
        } else {
            JOptionPane.showMessageDialog(null, "No has seleccinado una fila");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (tUsuario.getSelectedRow() != -1) {
            dtm.removeRow(tUsuario.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(null, "No has seleccionado un registro");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDestinoActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void CBXestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBXestadoActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_CBXestadoActionPerformed

    private void txtFEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFEntregaActionPerformed
        // TODO add your handling code here:
      txtFEntrega.setVisible(false);
        
    }//GEN-LAST:event_txtFEntregaActionPerformed

    private void txtResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResponsableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResponsableActionPerformed

    private void txtFFabricacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFFabricacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFFabricacionActionPerformed

    private void BTpasarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTpasarActionPerformed
      
        // PARA PASAR LAS FECHAS AL TEXT FIELD 
        
        // PASAR FECHA DE ENTREGA
        String diaEntrega = Integer.toString(jdtEntrega.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mesEntrega = Integer.toString(jdtEntrega.getCalendar().get(Calendar.MONTH) + 1);
        String yearEntrega = Integer.toString(jdtEntrega.getCalendar().get(Calendar.YEAR));
        String fechaEntrega = (diaEntrega + " / " + mesEntrega+ " / " + yearEntrega );
         txtFEntrega.setText(fechaEntrega);
         
         // PASAR FECHA DE FABRICACION
        String diaFabricacion = Integer.toString(jdtFabricacion.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mesFabricacion = Integer.toString(jdtFabricacion.getCalendar().get(Calendar.MONTH) + 1);
        String yearFabricacion = Integer.toString(jdtFabricacion.getCalendar().get(Calendar.YEAR));
        String fechaFabricacion = (diaFabricacion + " / " + mesFabricacion+ " / " + yearFabricacion );
         txtFFabricacion.setText(fechaFabricacion);
         
         
        
    }//GEN-LAST:event_BTpasarActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        GenerarTXT(evt);
    }//GEN-LAST:event_btnGenerarActionPerformed
    ////////////////////////////*******************************************************
   // FUNCION PARA GREAR TXT
    private void GenerarTXT(ActionEvent e) {

		try {
			BufferedWriter Mitxt = new BufferedWriter(new FileWriter("Boleta.txt"));

			Mitxt.write("\t\t\tREGISTRO DE PROSUCTOS");
			Mitxt.newLine();
			Mitxt.newLine();
			Mitxt.write("Datos del Producto");
			Mitxt.newLine();
			Mitxt.newLine();
			
			Mitxt.write("NOMBRE\t\tCODIGO\t\tMODELO\t\tMARCA \t\tPRESIO\t\tESTADO\t\tOFICINA DESTINO\t\tF.ENTREGA\t\tF.FABRICACION\t\tGARANTIA\t\tRESPONSABLE");
			Mitxt.newLine();

			// guardando tablilla...
			for (int i = 0; i < tUsuario.getRowCount(); i++) {

				Mitxt.write(tUsuario.getValueAt(i, 0).toString() + "\t\t");
				Mitxt.write(tUsuario.getValueAt(i, 1).toString() + "\t\t");
				Mitxt.write(tUsuario.getValueAt(i, 2).toString() + "\t\t");
				Mitxt.write(tUsuario.getValueAt(i, 3).toString() + "\t\t");
				Mitxt.write(tUsuario.getValueAt(i, 4).toString() + "\t\t");
                                Mitxt.write(tUsuario.getValueAt(i, 5).toString() + "\t\t");
                                Mitxt.write(tUsuario.getValueAt(i, 6).toString() + "\t\t");
                                Mitxt.write(tUsuario.getValueAt(i, 7).toString() + "\t\t");
                                Mitxt.write(tUsuario.getValueAt(i, 8).toString() + "\t\t");
                                Mitxt.write(tUsuario.getValueAt(i, 9).toString() + "\t\t");
                                Mitxt.write(tUsuario.getValueAt(i, 10).toString() + "\t\t");
                                
				Mitxt.newLine();

			}
			Mitxt.newLine(); 
			
			Mitxt.close();

			// mensaje mostrado tras haber guardado
			switch (JOptionPane.showConfirmDialog(null, "Desea mostrar .txt?", "Guardado!",
					JOptionPane.OK_CANCEL_OPTION)) {

				case 0:
					// función para mostrar datos
					abrirarchivo("Boleta.txt"); // se muestra el nombre del archivo con el cual será creado y se
												// guardará dentro de esta misma carpeta (no cambien esto prros 
												//atentamente Iber -_- )						
					break;
				case 2:
					dispose();
					break;
			}

		} catch (Exception x) {
			JOptionPane.showMessageDialog(null, "Error");
		}

	}
   
   public void abrirarchivo(String archivo) {

		try {

			File objetofile = new File(archivo);
			Desktop.getDesktop().open(objetofile);

		} catch (IOException ex) {

			System.out.println(ex);

		}

	}
   
    
    
    /////////////////*********************************************************************
    
    public void limpiar() {     //PARA LIMPIAR AUTOMATICO DESPUES DE AGREGAR
        txtNombre.setText("");
        txtCodigo.setText("");
        txtModelo.setText("");
        txtDestino.setText("");
        txtMarca.setText("");
        txtPrecio.setText("");
        txtFEntrega.setText("");
        txtFFabricacion.setText("");
        txtGarantia.setText("");
        txtResponsable.setText("");
        
        
        txtNombre.grabFocus();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddRowJTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRowJTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRowJTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRowJTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddRowJTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTpasar;
    private javax.swing.JComboBox<String> CBXestado;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnSearch;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdtEntrega;
    private com.toedter.calendar.JDateChooser jdtFabricacion;
    private javax.swing.JTable tUsuario;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtFEntrega;
    private javax.swing.JTextField txtFFabricacion;
    private javax.swing.JTextField txtGarantia;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtResponsable;
    // End of variables declaration//GEN-END:variables
}
