
package com.mycompany.ej7_8_9javabasico.arrays;
/*
1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición 
y el valor de cada elemento en ambas dimensiones.
*/
public class Main {
    public static void main(String[] args) {
        
        // Punto: 1
        System.out.println("=======Punto 1=========");
        String paises[] = {
            "Argentina",
            "Francia",
            "Croacia",
            "Marruecos"
        };
        
        for (String i : paises){
            System.out.println(i);
        }
        
        // Punto: 2
        System.out.println("=======Punto 2=========");
        int arrayBi[][] = new int [3][3];
        
        arrayBi[0][0] = 10; 
        arrayBi[0][1] = 20; 
        arrayBi[0][2] = 30; 
        arrayBi[1][0] = 400;
        arrayBi[1][1] = 500;
        arrayBi[1][2] = 600;
        arrayBi[2][0] = 7000;
        arrayBi[2][1] = 8000;
        arrayBi[2][2] = 9000;
        
        for (int i = 0; i < arrayBi.length;i++){// aqui recorro las filas
            
            for (int j=0; j < arrayBi[i].length; j++){ // aqui recorro columnas
                System.out.println("Posicion fila: " + i + ", columna: " + j + 
                   " El valor es: " + arrayBi [i][j]);
            }
        }
        
    }  
}
