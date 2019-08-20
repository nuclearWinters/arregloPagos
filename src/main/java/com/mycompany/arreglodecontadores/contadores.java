/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arreglodecontadores;

import java.util.Scanner;

/**
 *
 * @author Armando
 */
public class contadores {
    public static void main(String[] args) {
        System.out.println("Introduce el numero de empleados: ");
        Scanner numeroEmpleados = new Scanner(System.in);
        int largoDelArreglo = numeroEmpleados.nextInt();
        int arregloDePagas[] = {0,0,0,0,0,0,0,0,0};
        String arregloDeRangos[] = {"200-299","300-399","400-499","500-599","600-699","700-799","800-899","900-999","+1000"};
        for (int inicio = 0;inicio<largoDelArreglo;inicio++) {
            System.out.println("Introduce la venta semanal en enteros: ");
            Scanner venta = new Scanner(System.in);
            int salarioMasVenta = (int) (venta.nextInt() * 0.09) + 200;
            if (salarioMasVenta < 299) {
                arregloDePagas[0]++;
            } else if (salarioMasVenta < 399 && salarioMasVenta > 300) {
                arregloDePagas[1]++;
            } else if (salarioMasVenta < 499 && salarioMasVenta > 400) {
                arregloDePagas[2]++;
            } else if (salarioMasVenta < 599 && salarioMasVenta > 500) {
                arregloDePagas[3]++;
            } else if (salarioMasVenta < 699 && salarioMasVenta > 600) {
                arregloDePagas[4]++;
            } else if (salarioMasVenta < 799 && salarioMasVenta > 700) {
                arregloDePagas[5]++;
            } else if (salarioMasVenta < 899 && salarioMasVenta > 800) {
                arregloDePagas[6]++;
            } else if (salarioMasVenta < 999 && salarioMasVenta > 900) {
                arregloDePagas[7]++;
            } else if (salarioMasVenta > 1000) {
                arregloDePagas[8]++;
            }
        }
        System.out.println("Rango de Paga\t\tCantidad de Empleados");
        for (int inicio = 0;inicio<=arregloDePagas.length-1;inicio++) {
            System.out.println(arregloDeRangos[inicio] + "\t\t\t" + arregloDePagas[inicio]);
        }
    }
}
