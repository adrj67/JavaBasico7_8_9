
package com.mycompany.ej7_8_9javabasico.fileinfileout;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Main {
    /*
    Punto 8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
    */
    public static void main(String[] args) {
        
        try{
            PrintStream fichero = new PrintStream("C:\\Proyectos\\original.txt");
            fichero.println("Saludos desde Argentina!! \n Felicitaciones a todo el equipo de OpenBootcamp por el excelente curso de Java Basico!!");
            fichero.close();
            
            fileinfileout("C:\\Proyectos\\original.txt", "C:\\Proyectos\\destino.txt");
            System.out.println("Archivo creado y copiado con exito");
            
        }catch (IOException e){
            System.out.println("Error al crear o copiar el archivo: " + e.getMessage());
        }
    }
    public static void fileinfileout(String fileIn, String fileOut){
    try{    
            InputStream original = new FileInputStream(fileIn);
            byte[] datos = original.readAllBytes();
            original.close();
             
            PrintStream destino = new PrintStream (fileOut);
            destino.write(datos);
            destino.close();
             
        } catch (IOException e){
            System.out.println("Error en funcion 'fileinfileout': " + e.getMessage());
        }
    }
}
