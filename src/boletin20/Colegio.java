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
public class Colegio  {

    public Map<String, Alumno> listadealumnos = new TreeMap<>();
    public Iterator it = listadealumnos.keySet().iterator();

    public void visualizarAlumno(Map<Integer, Alumno> listadealumnos) {
        while (it.hasNext()) {
            String clave = (String)it.next();
            String nombre = listadealumnos.get(clave).getNombre();
            float nota = listadealumnos.get(clave).getNota();
            JOptionPane.showMessageDialog(null, "Nota: " +nota  + "Nombre del alumno: " + nombre);
        }
    }

    public void anhadirAlumno() throws NumberFormatException, HeadlessException {
        Alumno al;
        int cont = 5500;
        //Esto está fatal.
        String nombre = JOptionPane.showInputDialog(null, "Introduce su nombre.");
        float nota = Float.parseFloat(JOptionPane.showInputDialog("Introduce su nota."));
        al = new Alumno(nombre, nota);
        String aux = String.t
        listadealumnos.put((String)cont, al);
        cont++;
        
        System.out.println("Elemento agregado.");
    }

    public void buscarAlumno(Map<String, Alumno> listadealumos) throws HeadlessException, NumberFormatException {
        String res = JOptionPane.showInputDialog(null, "Introduce la clave del alumno que desea buscar.");
        if (listadealumnos.containsKey(res) == true)
            
        JOptionPane.showMessageDialog(null, "Nombre: " + listadealumnos.get(res).getNombre()+"Nota: "+ listadealumnos.get(res).getNota());
        else
        

        if (a != null) {
            System.out.println("El elemento de clave: " + k + " contiene: " + a);
        } else {
            System.out.println("No se encuentra el elemento");
        }
    }

    public void eliminarAlumno(Map<String, Alumno> listadealumnos) {
        String clave = JOptionPane.showInputDialog("Introduce la clave del alumno a eliminar: ");
        if (listadealumnos.containsKey(clave) == true) {
            listadealumnos.remove(clave);
        } else 
            JOptionPane.showMessageDialog(null,"No existe ese alumno.");
        
    }
}
