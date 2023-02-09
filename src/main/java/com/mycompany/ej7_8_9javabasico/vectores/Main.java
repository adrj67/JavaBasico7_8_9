
package com.mycompany.ej7_8_9javabasico.vectores;

import java.util.Vector;

/*
3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. 
Elimina el 2o y 3er elemento y muestra el resultado final.
4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
 */
public class Main {
    public static void main(String[] args) {
        
        // Punto 3
        Vector<String> vector = new Vector(5,2);
        System.out.println("Tamaño del vector: " + vector.size() + " Capacidad del vector: " + vector.capacity());
        //Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. 
        vector.add("uno");
        vector.add("dos");
        vector.add("tres");
        vector.add("cuatro");
        vector.add("cinco");
        System.out.println("Los datos agregados al vector son: " + vector);
       
        // Elimina el 2o y 3er elemento y muestra el resultado final.
        vector.remove(1);
        vector.remove(1);
        System.out.println("Los datos que quedaron del vector son: " + vector);
        
        // Punto 4
        //Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
        System.out.println("=======Punto 4=======");
        System.out.println("La capacidad por defecto del vector es de 10, cuando alcanza esa cantidad crea \n otro vector duplicando su capacidad a 20, y copia los datos del primero en el nuevo vector,\n asi sucesivamente (10, 20, 40, 80, 160, 320,..), hasta que almacene los 1000 elementos.\n Esto duplica el uso de memoria en cada 're-size', que ralentiza el programa.");
        
        
    }
    
}
