/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20;

import java.awt.HeadlessException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;

/**
 *
 * @author ddizoya
 */
public class Colegio {

    public int cont = 5500;
    public Map<String, Alumno> listadealumnos = new TreeMap<>();

    public static int menu() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("******MENU*****\n"
                + "1 - Dar de alta un alumno.\n"
                + "2 - Dar de baja un alumno.\n"
                + "3 - Buscar un alumno.\n"
                + "4 - Visualizar.\n"
                + "5 - Salir. \n"));
        return opcion;
    }

    public void visualizarAlumno() {
        Iterator it = listadealumnos.keySet().iterator();
        while (it.hasNext()) {
            String clave = (String) it.next();
            String nombre = listadealumnos.get(clave).getNombre();
            float nota = listadealumnos.get(clave).getNota();
            JOptionPane.showMessageDialog(null, " Nota: " + nota + " Nombre del alumno: " + nombre + " Clave: " + clave);
        }
    }

    public void anhadirAlumno() {
        Alumno al;
        //Esto está fatal.
        String nombre = JOptionPane.showInputDialog(null, "Introduce su nombre.");
        float nota = Float.parseFloat(JOptionPane.showInputDialog("Introduce su nota."));
        al = new Alumno(nombre, nota);
        String aux = Integer.toString(cont);
        listadealumnos.put(aux, al);
        cont++;
        System.out.println("Elemento agregado.");
    }

    public void buscarAlumno() {
        String res = JOptionPane.showInputDialog(null, "Introduce la clave del alumno que desea buscar.");
        if (listadealumnos.containsKey(res) == true) {
            JOptionPane.showMessageDialog(null, " Nombre: " + listadealumnos.get(res).getNombre() + " Nota: " + listadealumnos.get(res).getNota());
        } else {
            JOptionPane.showMessageDialog(null, "No se ha encontrado al alumno.");
        }
    }

    public void eliminarAlumno() {
        String clave = JOptionPane.showInputDialog("Introduce la clave del alumno a eliminar: ");
        if (listadealumnos.containsKey(clave) == true) {
            listadealumnos.remove(clave);
        } else {
            JOptionPane.showMessageDialog(null, "No existe ese alumno.");
        }

    }
}
