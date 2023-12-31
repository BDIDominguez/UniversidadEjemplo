/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.Vistas;

import javax.swing.ImageIcon;

/**
 *
 * @author PC1
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        //System.out.println("");
        setIconImage(new ImageIcon(getClass().getResource("/&Images/logo-universidad-de-la-punta.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFondo = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAlumno = new javax.swing.JMenu();
        jmiFormularioAlumno = new javax.swing.JMenuItem();
        jmMateria = new javax.swing.JMenu();
        jmiFormularioMaterias = new javax.swing.JMenuItem();
        jmAdministracion = new javax.swing.JMenu();
        jmiManejoInscripciones = new javax.swing.JMenuItem();
        jmiManipulacionNotas = new javax.swing.JMenuItem();
        jmConsultas = new javax.swing.JMenu();
        jmiAlumnosPorMateria = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jFondoLayout = new javax.swing.GroupLayout(jFondo);
        jFondo.setLayout(jFondoLayout);
        jFondoLayout.setHorizontalGroup(
            jFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1057, Short.MAX_VALUE)
        );
        jFondoLayout.setVerticalGroup(
            jFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );

        jmAlumno.setText("Alumno");

        jmiFormularioAlumno.setText("Formulario de Alumno");
        jmAlumno.add(jmiFormularioAlumno);

        jMenuBar1.add(jmAlumno);

        jmMateria.setText("Materia");

        jmiFormularioMaterias.setText("Formulario de Materias");
        jmMateria.add(jmiFormularioMaterias);

        jMenuBar1.add(jmMateria);

        jmAdministracion.setText("Administración");

        jmiManejoInscripciones.setText("Manejo de Inscripciones");
        jmAdministracion.add(jmiManejoInscripciones);

        jmiManipulacionNotas.setText("Manipulacion de notas");
        jmAdministracion.add(jmiManipulacionNotas);

        jMenuBar1.add(jmAdministracion);

        jmConsultas.setText("Consultas");

        jmiAlumnosPorMateria.setText("Alumnos por Materia");
        jmConsultas.add(jmiAlumnosPorMateria);

        jMenuBar1.add(jmConsultas);

        jMenu3.setText("                      ");
        jMenu3.setContentAreaFilled(false);
        jMenu3.setEnabled(false);
        jMenuBar1.add(jMenu3);

        jmSalir.setText("Salir");
        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFondo)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFondo, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane jFondo;
    private javax.swing.JMenu jMenu3;
    public javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenu jmAdministracion;
    public javax.swing.JMenu jmAlumno;
    public javax.swing.JMenu jmConsultas;
    public javax.swing.JMenu jmMateria;
    public javax.swing.JMenu jmSalir;
    public javax.swing.JMenuItem jmiAlumnosPorMateria;
    public javax.swing.JMenuItem jmiFormularioAlumno;
    public javax.swing.JMenuItem jmiFormularioMaterias;
    public javax.swing.JMenuItem jmiManejoInscripciones;
    public javax.swing.JMenuItem jmiManipulacionNotas;
    // End of variables declaration//GEN-END:variables
}
