
package com.mycompany.ej7_8_9javabasico.dividirporcero;


public class Main {
    /*
    Punto 7. Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
    */
    public static void main(String[] args) {
        
        try{
           divideporcero(25,0);
       } catch (Exception e){ 
           System.out.println("Demo de código"); // si hay error...
       }
        
    }
    public static int divideporcero(int num1, int num2) throws ArithmeticException{
        int resultado = 0;
        try{
            resultado = num1/num2;
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
            throw new ArithmeticException();
        }
        System.out.println("Demo de código " + resultado); // Si no hay error...
        return resultado;
    } 
    
}
