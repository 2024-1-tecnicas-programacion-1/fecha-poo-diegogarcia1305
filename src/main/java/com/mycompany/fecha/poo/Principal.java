package com.mycompany.fecha.poo;
import java.util.Scanner;
public class Principal {
    // TODO: Aquí va el código de la clase Principal
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Introduce el dia");
int dia = sc.nextInt();
System.out.println("Intoduce el mes");
int mes = sc.nextInt();
System.out.println("Intoduce el año");    
int ano = sc.nextInt();

Fecha fecha = new Fecha(dia, mes, ano);

if (fecha.ValidarFecha()){
    System.out.println("Fecha válida");
    System.out.println("Fecha larga:"+ fecha.fechaLarga());
    }
else {
    System.out.println("Fecha ");
}
}

}




