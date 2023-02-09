
package com.mycompany.ej7_8_9javabasico.reverse;
/*
Dada la función: public static String reverse(String texto) { }
Escribe el código que devuelva una cadena al revés. Por ejemplo, 
la cadena "hola mundo", debe retornar "odnum aloh".
*/
public class Main {
       
    public static void main(String[] args) {
        
        String textoInvertido = "hola mundo";
        reverse(textoInvertido);
    }
    public static String reverse(String texto) { 
        for (int i = texto.length()-1; i >= 0 ;i--){
            System.out.print(texto.charAt(i));
        }
        return texto;
    }
}