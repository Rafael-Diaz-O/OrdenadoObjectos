package ordenadodedatos;

import java.util.Arrays;
import java.util.Collections;


public class OrdenadoDeDatos {
    
    public static int[] ordenarNumeros(int[] vector,String tipoOrden){
        
        int[] resultado = vector.clone(); 
                
        if("ascendente".equalsIgnoreCase(tipoOrden)){
        Arrays.sort(resultado);
        return resultado;
        }else if ("descendente".equalsIgnoreCase(tipoOrden)) {
            // Crear un nuevo array invertido
            Arrays.sort(resultado);
            int[] vectorInvertido = new int[resultado.length];
            for (int i = 0; i < resultado.length; i++) {
                //posicion del vector resultado
                vectorInvertido[i] = resultado[resultado.length - 1 - i];
            }
            return vectorInvertido;
        }else{
            System.out.println("Tipo de orden no valido, devolviendo vector original");
            return vector;
        }
        
         
        
    }
    
    public static String[] ordenarStrings(String[] vector, String tipoOrden){
        
        String[] resultado = vector.clone();
        if("ascendente".equalsIgnoreCase(tipoOrden)){
        Arrays.sort(resultado);
        return resultado;
        }
        // Si se solicita orden descendente, invertir el array
        else if("descendente".equalsIgnoreCase(tipoOrden)) {
            // Crear un nuevo array invertido
            Arrays.sort(resultado);
            
            String[] vectorInvertido = new String[resultado.length];
            for (int i = 0; i < resultado.length; i++) {
                vectorInvertido[i] = resultado[resultado.length - 1 - i];
            }
            return vectorInvertido;
            
        }else{
            System.out.println("Tipo de orden no valido, devolviendo vector original");
            return vector;
        }
    } 
        
    

    public static void main(String[] args) {
      // Prueba con números
        System.out.println("=== PRUEBA CON NUMEROS ===");
        int[] numeros = {5, 2, 8, 1, 9, 3};
        
        System.out.println("Vector original: " + Arrays.toString(numeros));
        
        int[] ascendente = ordenarNumeros(numeros, "ascendente");
        System.out.println("Orden ascendente: " + Arrays.toString(ascendente));
        
        int[] descendente = ordenarNumeros(numeros, "descendente");
        System.out.println("Orden descendente: " + Arrays.toString(descendente));
        
        // Prueba con Strings
        System.out.println("\n=== PRUEBA CON STRINGS ===");
        String[] palabras = {"zapato", "árbol", "casa", "banana", "manzana"};
        
        System.out.println("Vector original: " + Arrays.toString(palabras));
        
        String[] ascendenteStr = ordenarStrings(palabras, "ascendente");
        System.out.println("Orden ascendente: " + Arrays.toString(ascendenteStr));
        
        String[] descendenteStr = ordenarStrings(palabras, "descendente");
        System.out.println("Orden descendente: " + Arrays.toString(descendenteStr));
        
        // Prueba con caso por defecto (si no se especifica "descendente")
        System.out.println("\n=== PRUEBA CASO POR DEFECTO ===");
        int[] numeros2 = {10, 4, 7, 1, 15};
        System.out.println("Vector original: " + Arrays.toString(numeros2));
        
        int[] porDefecto = ordenarNumeros(numeros2, "cualquier cosa");
        System.out.println("Orden por defecto (ascendente): " + Arrays.toString(porDefecto));
    
    }
        
        
    }
    

