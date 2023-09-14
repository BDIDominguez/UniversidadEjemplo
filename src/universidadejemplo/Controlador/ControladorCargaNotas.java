package universidadejemplo.Controlador;

/**
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.AccesoAdatos.AlumnoData;
import universidadejemplo.AccesoAdatos.InscripcionData;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Materia;
import universidadejemplo.Vistas.CargaNotas;
import universidadejemplo.Vistas.MenuPrincipal;

  //@author louisinette
 
    public class ControladorCargaNotas implements ActionListener{
    public final AlumnoData alumdata;
    public InscripcionData inscdata;
    public final CargaNotas vistacarganotas;
    public MenuPrincipal menu;
    DefaultTableModel modelo = new DefaultTableModel();
    
        
        public ControladorConsultaAlumnoMateria(AlumnoData alumdata, InscripcionData inscdata, CargaNotas vistacarganotas, MenuPrincipal menu) {
        this.alumdata = alumdata;
        this.inscdata = inscdata;
        this.menu = menu;
        this.vistacarganotas = vistacarganotas;
        
        vistacarganotas.jComboBListAlumCargaNotas.addActionListener(this);
        vistacarganotas.jButtonSalirCargaNotas.addActionListener(this);
        vistacarganotas.jButtonGuardar.addActionListener(this);
//agregan un oyente de accion a los componentes de la interfaz de usuario
//se refiere a la instancia actual de la clase ControladorConsultaAlumnoMateria. 
// this se refiere a la instancia actual de la clase que actua como oyente de
// los eventos generados por los componentes jcbMateria etc y ejecuta en esta clase
// el metodo actionPerformed de la interfaz ActionListener que implementa
    }

public void inicia(){
        menu.jFondo.removeAll();
 /eliminando todos los componentes que estaban dentro del contenedor jFondo de la clase menu
//para limpiar cualquier contenido previo antes de agregar la nueva vista
        menu.jFondo.repaint();
        menu.jFondo.add(vistacarganotas); // Agrega la vista actual (vistacarganotas) al contenedor jFondo de la clase menu
        vistacarganotas.setVisible(true); //hace visible se mostrará en la pantalla.
        menu.jFondo.moveToFront(vistacarganotas);// Coloca la vista actual en la parte delantera del contenedor jFondo u otro componentes
        vistacarganotas.requestFocus(); //le da el foco al formulario la vista estará lista para recibir eventos de entrada
        cargarCombo(); //metodo cargar datos en un JComboBox u otro componente de selección en la vista
        modelarTabla(); configurar y mostrar una tabla en la vista,  para mostrar datos relacionados con las notas
        vistacarganotas.jTableCargaNotas.setEnabled(false);
//Deshabilita la tabla en la vista (jTabla). Esto significa que el usuario no podrá interactuar directamente con la tabla 
//hasta que se habilite nuevamente.
        
}

    
@Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == vistacarganotas.jComboBListAlumCargaNotas) {
    // Código para manejar el evento del JComboBox
        // puedo  acceder al elemento seleccionado con vistacarganotas.jComboBListAlumCargaNotas.getSelectedItem()
     
     } else if (e.getSource() == vistacarganotas.jButtonSalirCargaNotas) {
        // Código para manejar el evento del botón "Salir"
    
    }else if (e.getSource() == vistacarganotas.jButtonGuardar) {
        // Código para manejar el evento del botón "Guardar" en una celda de la tabla????
    }
    
}

public void modeloTabla() {
        modelo.addColumn("Id Materia");
        modelo.addColumn("Nombre");
        modelo.addColumn("Nota");
        vista.jTabla.setModel(modelo);
    }

 public void cargarCombo(){
        List<Alumno> alumnos = new ArrayList<Alumno>();
        alumnos = alumdata.listarAlumnos();
        vistacarganotas.jComboBListAlumCargaNotas.removeAllItems();
        for (Alumno alumno : alumnos) {
            if (alumno.isActivo()) {
                String alumnodelcombo = alumno.getDni() + " - " + alumno.getApellido() + ", "+ alumno.getNombre() + " - " + alumno.getIdAlumno();
                vistacarganotas.jComboBListAlumCargaNotas.addItem(alumnodelcombo);
      //probar  sino vistacarganotas.jComboBListAlumCargaNotas.addItem(alumno.getNombreCompleto());
            }   
        }
     }
 }
*/
