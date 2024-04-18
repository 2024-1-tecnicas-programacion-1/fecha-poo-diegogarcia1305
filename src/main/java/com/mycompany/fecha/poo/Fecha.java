package com.mycompany.fecha.poo;

public class Fecha {
 // TODO: Aquí va el código de la clase fechas
private int dia;
private int mes; 
private int ano;

public Fecha (int dia,int mes, int ano){
this.dia = dia;
this.mes = mes;
this.ano = ano;
}
public String FechaCorta(){
return dia + "/" + mes + "/" + ano;
    }
public boolean ValidarFecha(){
if (dia < 1 || dia > 31) {
return false;
    }
if (mes < 1 || mes > 12) {
return false;
    }
if (ano < 1) {
return false;
    }
  // meses con 30
if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
    if (dia > 30) {
    return false;}
}
 //febrero y bis
if (mes == 2) {
   if (esBisiesto(ano)) {
      if (dia > 29) {
      return false;
                    }
        } else {
            if (dia > 28) {
            return false;
            }
        }
    }
    return true;
}

private boolean esBisiesto(int ano) {
    if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
        return true;
    } else {
        return false;
    }
   }  
public String mesLetra() {
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        return meses[mes - 1];
    }
public String fechaLarga() {
    return dia + " de " + mesLetra() + " de " + ano;
    }
}





    

