
package com.mycompany.ej7_8_9javabasico.sorpresa;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

/*
Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
*/
public class Main {
    public static void main(String[] args) {
        
        HashMap<String, String> alumnos = new HashMap<>();
        alumnos.put("Id1", "Adrian");
        alumnos.put("Id2", "Pedro");
        alumnos.put("Id3", "Juan");
        alumnos.put("Id4", "Jose");
        System.out.println(alumnos);
        
        ArrayList<String> paises = new ArrayList<String>();
        paises.add("Argentina");
        paises.add("España");
        paises.add("Mexico");
        paises.add("Mexico");
        System.out.println("Contenido arraylist: " + paises);
        
        try{
            PrintStream estudiantes = new PrintStream("C:\\Proyectos\\estudiantes.txt");
            estudiantes.println("Listado de estudiantes. \n Estudiantes: " + alumnos + " \n Paises: " + paises);
            estudiantes.close();
                       
            System.out.println("Archivo estudiantes.txt guardado con exito");
            
        }catch (IOException e){
            System.out.println("Error al crear o copiar el archivo: " + e.getMessage());
        }
        
    }
    
    
}
