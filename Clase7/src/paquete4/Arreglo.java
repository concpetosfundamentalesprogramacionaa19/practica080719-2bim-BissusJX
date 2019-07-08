/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author Salas
 */
public class Arreglo {
    public static int obtenerTamanioArreglo(int arreglo2[], int tamanio) {
        if (tamanio == 1) {
            return arreglo2[0];
        } else {
            return arreglo2[tamanio - 1] + obtenerTamanioArreglo(arreglo2, tamanio - 1 ); 
        }
         
    }

/*Realizar una prueba del método obtenerTamanioArreglo con los valores
{10, 20, 30, 1, 2, 3, 40, 4}; además crear un método con un ciclo repetitivo que permita obtener el mismo
resultado del método recursivo
*/
    public static int obtenerTamanioArreglo2(int arreglo2[], int tamanio){
       int suma = 0;
       for(int i = 0 ; i < tamanio ; i++ ){
           suma = suma + arreglo2[i];
       }
       return suma;
    }      
}
