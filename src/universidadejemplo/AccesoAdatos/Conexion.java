/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.AccesoAdatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PC1
 */
public class Conexion {

    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "universidadulp";
    private static final String USUARIO = "root";
    private static String PASSWORD = "";

    private static Connection connection;

    //Metodo Constructor
    private Conexion() {
    }

    public static Connection getConexion() {

        try {
            if (connection == null || connection.isClosed()) {

                Class.forName("org.mariadb.jdbc.Driver");
                //Setup the connection with the DB
                connection = DriverManager
                        .getConnection(URL + DB + "?useLegacyDatetimeCode=false&serverTimezone=UTC"
                                + "&user=" + USUARIO + "&password=" + PASSWORD);

            }
        } catch (ClassNotFoundException ex) {

            JOptionPane.showMessageDialog(null, "Error al cargar los Drivers " + ex.getMessage());

        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class
                    .getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al conectarse a la BD " + ex.getMessage());
        }
        return connection;
    }

}
