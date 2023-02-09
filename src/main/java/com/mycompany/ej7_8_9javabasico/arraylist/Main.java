
package com.mycompany.ej7_8_9javabasico.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;

/*
5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.

6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
*/
public class Main {
    
    public static void main(String[] args) {
    
    // Punto 5
    ArrayList<String> lista = new ArrayList<String>();
        lista.add("Texto A");
        lista.add("Texto B");
        lista.add("Texto C");
        lista.add("Texto D");
        
    LinkedList<String> listaLinked = new LinkedList<String>(lista);
        
        for(String nombre : lista){
            System.out.println("Recorriendo el ArrayList. Valor: " + nombre);
        }
        
        for (int i = 0; i < listaLinked.size(); i++){
            System.out.println("Recorriendo la LinkedList. Valor: " + listaLinked.get(i));
        }
        
    // Punto 6 
    ArrayList<Integer> elementos = new ArrayList<Integer>();
    //Rellena ArrayList con numeros del 1 al 10
    for(int i = 0; i < 10; i++){
             elementos.add(i, i+1);
    }
    System.out.println("Relleno ArrayList: " + elementos);
    
    //Elimina numeros pares
    for(int i = 0; i < elementos.size(); i++){
        if(elementos.get(i) % 2 == 0)
            elementos.remove(i);
    }
    System.out.println("ArrayList sin numeros pares: " + elementos);
    
    //En menos pasos...
    ArrayList<Integer> elementos2 = new ArrayList<Integer>();
    int contador = 0;
    
    while(contador < 10){
        contador++;
            if (contador % 2 == 0){
               continue; 
            }
            elementos2.add(contador);
        }
    System.out.println("ArrayList impares en menos pasos: " + elementos2);
  }    
    
    
        
}
