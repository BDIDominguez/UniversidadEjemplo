/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.Vistas;

/**
 *
 * @author PC1
 */
public class GestionAlumnos extends javax.swing.JInternalFrame {

    /**
     * Creates new form GestionAlumnos
     */
    public GestionAlumnos() {
        initComponents();
        setTitle("Alumnos");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlAlumno = new javax.swing.JLabel();
        jlDocumento = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jlFechaDeNacimiento = new javax.swing.JLabel();
        jtxDocumento = new javax.swing.JTextField();
        jtxApellido = new javax.swing.JTextField();
        jtxNombre = new javax.swing.JTextField();
        jrbEstado = new javax.swing.JRadioButton();
        jbtNuevo = new javax.swing.JButton();
        jbtEliminar = new javax.swing.JButton();
        jbtGuardar = new javax.swing.JButton();
        jbtSalir = new javax.swing.JButton();
        jbtBuscar = new javax.swing.JButton();
        jdcFechadeNacimiento = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(0, 153, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jlAlumno.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jlAlumno.setText("Alumno");

        jlDocumento.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jlDocumento.setText("Documento:");

        jlApellido.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jlApellido.setText("Apellido:");
        jlApellido.setToolTipText("");

        jlNombre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jlNombre.setText("Nombre:");

        jlEstado.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jlEstado.setText("Estado:");

        jlFechaDeNacimiento.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jlFechaDeNacimiento.setText("Fecha de Nacimiento:");
        jlFechaDeNacimiento.setToolTipText("");

        jtxDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxDocumentoActionPerformed(evt);
            }
        });

        jbtNuevo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtNuevo.setText("Nuevo");

        jbtEliminar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtEliminar.setText("Eliminar");

        jbtGuardar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtGuardar.setText("Guardar");

        jbtSalir.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtSalir.setText("Salir");
        jbtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalirActionPerformed(evt);
            }
        });

        jbtBuscar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtBuscar.setText("Buscar");
        jbtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlFechaDeNacimiento)
                                .addGap(18, 18, 18)
                                .addComponent(jdcFechadeNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jlDocumento)
                                .addGap(18, 18, 18)
                                .addComponent(jtxDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jlAlumno)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlEstado)
                                        .addGap(18, 18, 18)
                                        .addComponent(jrbEstado))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jbtNuevo)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbtEliminar)))
                                .addGap(18, 18, 18)
                                .addComponent(jbtGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(jbtSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlApellido)
                                .addGap(18, 18, 18)
                                .addComponent(jtxApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlAlumno)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDocumento)
                    .addComponent(jtxDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtBuscar))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellido)
                    .addComponent(jtxApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(jtxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbEstado)
                    .addComponent(jlEstado))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlFechaDeNacimiento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtEliminar)
                            .addComponent(jbtGuardar)
                            .addComponent(jbtSalir)
                            .addComponent(jbtNuevo))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jdcFechadeNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxDocumentoActionPerformed

    private void jbtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtSalirActionPerformed

    private void jbtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jbtBuscar;
    public javax.swing.JButton jbtEliminar;
    public javax.swing.JButton jbtGuardar;
    public javax.swing.JButton jbtNuevo;
    public javax.swing.JButton jbtSalir;
    public com.toedter.calendar.JDateChooser jdcFechadeNacimiento;
    private javax.swing.JLabel jlAlumno;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlDocumento;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlFechaDeNacimiento;
    private javax.swing.JLabel jlNombre;
    public javax.swing.JRadioButton jrbEstado;
    public javax.swing.JTextField jtxApellido;
    public javax.swing.JTextField jtxDocumento;
    public javax.swing.JTextField jtxNombre;
    // End of variables declaration//GEN-END:variables
}
