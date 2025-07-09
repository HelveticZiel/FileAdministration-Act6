
package Funciones;

import java.util.Arrays;

/**
 *
 * @author axel.l
 */
public class FuncionesClase02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("- Paso por valor -");
        /*(1)Paso de parámetros: Primitivos (se pasa *por valor* aka se crea una copia en la función que no modifica el original*/
        /*Igual si pasas un int por return, ese nuevo valor se devuelve al main si, pero el original no cambio dentro del propio main*/
        int numero = 5;
        incremento(numero);
        System.out.println("En el main: " + numero);
        
        
        /**(2)Paso por referencia: Tipos de Objetos (ej.Arrays y Strings
            Al pasar un objeto por parámetro, lo que se está pasando realmente es una copia de la dirección del objeto al que apunta la estructura,
            no el objeto en sí.
            La variable del main y el parámetro apuntan ---> al mismo objeto en memoria
             Cualquier modificación a su estado interno será visible fuera de la función.
         */
        
        
        System.out.println("- Paso por referencia -");

        
        int [] numbers = {1,2,3};
        
        modificar(numbers);
        System.out.println(Arrays.toString(numbers));
        
        
        
     /* (3) En Strings: son inmutables (en Java), por tanto cualquier "modificación" por referencia realmente creará un nuevo objeto en memoria.
         Por tanto, la única forma de guardar un valor en el main a partir de una modificación por parámetro de String, es reasignando ese nuevo
        valor en el main (en una nueva variable por ejemplo.
       La estructura (la variable) apuntará al nuevo objeto y el anterior ya no estará (Gargabe Collector)

     * Si lo hiciésemos a través de void, se "modificaría" dentro del método pero en el main se conservaría el valor original.
     */
        
      System.out.println("- Paso por referencia en Strings -");

        
     
        String mensaje = "esto es un 色々";
        
        String placeholder = textChange(mensaje);
        
        System.out.println("Texto modificado: " + placeholder);
     
     
     

    }
    
    /*(1)*/
    public static void incremento (int numero){
        numero++;
        System.out.println("En la funcion: " + numero);
    }
    
    /*(2)*/
    
    public static void modificar (int [] numeros){
        
        numeros[0] = 100;
        
    }
    
    
    /*(3)*/
    
    public static String textChange (String texto){
        
        texto = texto.toUpperCase();
        
        return texto;
        
    }
    
    
    
}
