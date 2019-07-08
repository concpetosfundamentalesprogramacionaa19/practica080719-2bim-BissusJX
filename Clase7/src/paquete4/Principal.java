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
public class Principal {
    public static void main(String[]args) {
         int arreglo2 [] = {10, 20, 30, 1, 2, 3, 40, 4};
         int suma = Arreglo.obtenerTamanioArreglo(arreglo2, arreglo2.length);
         int suma1 = Arreglo.obtenerTamanioArreglo2(arreglo2, arreglo2.length);
                 System.out.printf("Por el"
                         + " metodo 1 es: %d\nPor el metodo 2 es: %d\n",suma,suma1);
            
    }
}
