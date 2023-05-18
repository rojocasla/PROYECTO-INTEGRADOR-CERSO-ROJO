
package cersoproyecto;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;



public class formAlumnos extends javax.swing.JFrame {
    
    Alumnos a = new Alumnos();
    
    String[] columnNames = {"Matricula", "Nombre", "DNI", "Apellido", "Direccion", "Correo", "Telefono", "Año", "Curso", "Especialidad"};
    
    List<Alumnos> lista = new  ArrayList<>();
    int row;
    
    DefaultTableModel modelo;
  
    
    
    public formAlumnos() {
        initComponents();
        
        modelo = new DefaultTableModel(columnNames, row);
        
        tabla.setModel(modelo);
  
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labMatricula = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        labNombre = new javax.swing.JLabel();
        labDni = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnBuscarMatricula = new javax.swing.JButton();
        btnBuscarNombre = new javax.swing.JButton();
        btnBuscarDNI = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAño = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCurso = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEspecialidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labMatricula.setText("Matricula:");

        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });

        labNombre.setText("Nombre:");

        labDni.setText("DNI:");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        btnBuscarMatricula.setText("Buscar");
        btnBuscarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMatriculaActionPerformed(evt);
            }
        });

        btnBuscarNombre.setText("Buscar");
        btnBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarNombreActionPerformed(evt);
            }
        });

        btnBuscarDNI.setText("Buscar");
        btnBuscarDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDNIActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel1.setText("Apellido:");

        jLabel2.setText("Direccion:");

        jLabel3.setText("Correo:");

        jLabel4.setText("Telefono:");

        jLabel5.setText("Año:");

        jLabel6.setText("Curso:");

        jLabel7.setText("Especialidad:");

        jLabel8.setText("Alumno: Rojo, Alejandro");

        jLabel9.setText("Curso: 6º 3º");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 935, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellido)
                                    .addComponent(txtDireccion)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labNombre)
                                    .addComponent(labDni)
                                    .addComponent(labMatricula))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMatricula)
                                    .addComponent(txtDni)
                                    .addComponent(txtNombre)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono)
                            .addComponent(txtAño)
                            .addComponent(txtCurso)
                            .addComponent(txtEspecialidad))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarMatricula)
                            .addComponent(btnBuscarNombre)
                            .addComponent(btnBuscarDNI)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel9)))
                .addGap(13, 13, 13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labMatricula)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarMatricula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labDni)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscarDNI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnBorrar)
                    .addComponent(btnActualizar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        
    }//GEN-LAST:event_txtMatriculaActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        Alumnos a = new Alumnos();
        
        a.setMatricula(txtMatricula.getText());
        a.setNombre(txtNombre.getText());
        a.setDni(txtDni.getText());
        a.setApellido(txtApellido.getText());
        a.setDireccion(txtDireccion.getText());
        a.setCorreo(txtCorreo.getText());
        a.setTelefono(txtTelefono.getText());
        a.setAño(txtAño.getText());
        a.setCurso(txtCurso.getText());
        a.setEspecialidad(txtEspecialidad.getText());
        

        
        
        lista.add(a);

        modelo.setRowCount(0);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
            Object[] objFila = {lista.get(i).getMatricula(), lista.get(i).getNombre(), lista.get(i).getDni(), lista.get(i).getApellido(), lista.get(i).getDireccion(), lista.get(i).getCorreo(), lista.get(i).getTelefono(), lista.get(i).getAño(), lista.get(i).getCurso(), lista.get(i).getEspecialidad()};
            modelo.addRow(objFila);
            
            txtMatricula.setText("");
            txtDni.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtDireccion.setText("");
            txtCorreo.setText("");
            txtTelefono.setText("");
            txtAño.setText("");
            txtCurso.setText("");
            txtEspecialidad.setText("");
        }


    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnBuscarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMatriculaActionPerformed
        modelo.setRowCount(0);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
            Object[] objFila = {lista.get(i).getMatricula(), lista.get(i).getNombre(), lista.get(i).getDni(), lista.get(i).getApellido(), lista.get(i).getDireccion(), lista.get(i).getCorreo(), lista.get(i).getTelefono(), lista.get(i).getAño(), lista.get(i).getCurso(), lista.get(i).getEspecialidad()};
            
            if(lista.get(i).getMatricula().startsWith(txtMatricula.getText())){
                    modelo.addRow(objFila);
            }
        }

    }//GEN-LAST:event_btnBuscarMatriculaActionPerformed

    private void btnBuscarDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDNIActionPerformed
        modelo.setRowCount(0);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
            Object[] objFila = {lista.get(i).getMatricula(), lista.get(i).getNombre(), lista.get(i).getDni(), lista.get(i).getApellido(), lista.get(i).getDireccion(), lista.get(i).getCorreo(), lista.get(i).getTelefono(), lista.get(i).getAño(), lista.get(i).getCurso(), lista.get(i).getEspecialidad()};
            
            if(lista.get(i).getDni().startsWith(txtApellido.getText())){
                    modelo.addRow(objFila);
            }
        }

    }//GEN-LAST:event_btnBuscarDNIActionPerformed

    private void btnBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarNombreActionPerformed
        modelo.setRowCount(0);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
            Object[] objFila = {lista.get(i).getMatricula(), lista.get(i).getNombre(), lista.get(i).getDni(), lista.get(i).getApellido(), lista.get(i).getDireccion(), lista.get(i).getCorreo(), lista.get(i).getTelefono(), lista.get(i).getAño(), lista.get(i).getCurso(), lista.get(i).getEspecialidad()};
            
            if(lista.get(i).getNombre().startsWith(txtNombre.getText())){
                    modelo.addRow(objFila);
            }
        }

    }//GEN-LAST:event_btnBuscarNombreActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        modelo.removeRow(row);
        lista.remove(row);
        
        modelo.setRowCount(0);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
            Object[] objFila = {lista.get(i).getMatricula(), lista.get(i).getNombre(), lista.get(i).getDni(), lista.get(i).getApellido(), lista.get(i).getDireccion(), lista.get(i).getCorreo(), lista.get(i).getTelefono(), lista.get(i).getAño(), lista.get(i).getCurso(), lista.get(i).getEspecialidad()};
            modelo.addRow(objFila);
        }
        
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        row = tabla.getSelectedRow();
        
        
        txtMatricula.setText(modelo.getValueAt(row, 0).toString());
        txtNombre.setText(String.valueOf(modelo.getValueAt(row, 1)));
        txtDni.setText(modelo.getValueAt(row, 2).toString());
        txtApellido.setText(modelo.getValueAt(row, 3).toString());
        txtDireccion.setText(modelo.getValueAt(row, 4).toString());
        txtCorreo.setText(modelo.getValueAt(row, 5).toString());
        txtTelefono.setText(modelo.getValueAt(row, 6).toString());
        txtAño.setText(modelo.getValueAt(row, 7).toString());
        txtCurso.setText(modelo.getValueAt(row, 8).toString());
        txtEspecialidad.setText(modelo.getValueAt(row, 9).toString());
        
        
        
    }//GEN-LAST:event_tablaMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        lista.get(row).setNombre(txtNombre.getText());
        lista.get(row).setDni(txtDni.getText());
        lista.get(row).setMatricula(txtMatricula.getText());
        lista.get(row).setApellido(txtApellido.getText());
        lista.get(row).setAño(txtAño.getText());
        lista.get(row).setCorreo(txtCorreo.getText());
        lista.get(row).setCurso(txtCurso.getText());
        lista.get(row).setDireccion(txtDireccion.getText());
        lista.get(row).setEspecialidad(txtEspecialidad.getText());
        lista.get(row).setTelefono(txtTelefono.getText());
        
        modelo.setRowCount(0);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
            Object[] objFila = {lista.get(i).getMatricula(), lista.get(i).getNombre(), lista.get(i).getDni(), lista.get(i).getApellido(), lista.get(i).getDireccion(), lista.get(i).getCorreo(), lista.get(i).getTelefono(), lista.get(i).getAño(), lista.get(i).getCurso(), lista.get(i).getEspecialidad()};
            modelo.addRow(objFila);
        }
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    
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
            java.util.logging.Logger.getLogger(formAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new formAlumnos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscarDNI;
    private javax.swing.JButton btnBuscarMatricula;
    private javax.swing.JButton btnBuscarNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labDni;
    private javax.swing.JLabel labMatricula;
    private javax.swing.JLabel labNombre;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
