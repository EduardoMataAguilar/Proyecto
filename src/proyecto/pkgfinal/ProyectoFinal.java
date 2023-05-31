/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkgfinal;

import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class ProyectoFinal {
public static Scanner DK = new Scanner(System.in);
public static int a,b,c,c1,c2,c3,d,e,f,g,h,k,l;
public static double d1,d2,d3,d4,e1,e2,e3,f1,f2;

public static int MenuPrincipal(){
System.out.println("1**Aritmetico");
System.out.println("2**Conversiones");
System.out.println("3**Salir");
a=DK.nextInt();
return a;
}
public static int MenuAritmetico(){
System.out.println("1**Suma");
System.out.println("2**Resta");
System.out.println("3**Multiplicacion");
System.out.println("4**divicion");
System.out.println("5**Regresar");
b=DK.nextInt();
return b;
}
public static int MenuConversiones(){
System.out.println("1**Longitud");
System.out.println("2**Masa");
System.out.println("3**Temperaturas");
System.out.println("4**Regresar");
c=DK.nextInt();
return c;
}
public static int MenuLongitudes(){
System.out.println("1**Kilimetros");
System.out.println("2**Centimetros");
System.out.println("3**Millas");
System.out.println("4**Pies");
System.out.println("5**Pulgadas");
System.out.println("6**Regresar");
c1=DK.nextInt();
return c1;
}
public static int MenuMasas(){
System.out.println("1**Libras");
System.out.println("2**Kilogramos");
System.out.println("3**Onzas");
System.out.println("4**gramos");
System.out.println("5**Regresar");
c2=DK.nextInt();
return c2;
}
public static int MenuTemperaturas(){
System.out.println("1**Celcius");
System.out.println("2**Fahrenheit");
System.out.println("3**Kelvin");
System.out.println("4**Regresar");
c3=DK.nextInt();
return c3;
}
public static int Suma(){
System.out.println("--------------------------------\n"
                                    + "");
                            System.out.println("Capture cuantos numeros va a usar para sumar");
                            g=DK.nextInt();
                            int [] numeros;
                            numeros = new int[g];
                            for (int i = 0; i < g; i++) {
                            System.out.println("Capture el numero");
                            numeros[i] = DK.nextInt();
                            l=l+numeros[i];
                            }
                            System.out.println();
                            for (int i = 0; i < g; i++) {
                            System.out.println("Dato "+i+" ="+numeros[i]);       
                            }
                            System.out.println("\n"
                                    + "Que datos del arreglo desea sumar dado el numero de dato indocado anteriormente\n"
                                    + "Ejemplo: dato 1 (+) dato 2");
                            h=DK.nextInt();
                            k=DK.nextInt();
                            System.out.println("La suma de los datos es: "+(numeros[h]+numeros[k]));
                            System.out.println("Suma total del arreglo: "+l);
                            System.out.println("--------------------------------\n"
                                    + "");
    return 0;
}
public static int Resta(){
System.out.println("--------------------------------\n"
                                    + "");
                            System.out.println("Capture cuantos numeros va a usar para Restar");
                            g=DK.nextInt();
                            int [] numerosR;
                            numerosR = new int[g];
                            for (int i = 0; i < g; i++) {
                            System.out.println("Capture el numero");
                            numerosR[i] = DK.nextInt();   
                            }
                            System.out.println();
                            for (int i = 0; i < g; i++) {
                            System.out.println("Dato "+i+" ="+numerosR[i]);       
                            }
                            System.out.println("\n"
                                    + "Que datos del arreglo desea Restar dado el numero de dato indocado anteriormente\n"
                                    + "Ejemplo: dato 1 (-) dato 2");
                            h=DK.nextInt();        
                            k=DK.nextInt();
                            System.out.println("La Resta de los datos es: "+(numerosR[h]-numerosR[k]));
                            System.out.println("--------------------------------\n"
                                    + "");
return 0;
}
public static int Multiplicacion(){
System.out.println("--------------------------------\n"
                                    + "");
                            System.out.println("Capture cuantos numeros va a usar para Multiplicar");
                            g=DK.nextInt();
                            int [] numerosM;
                            numerosM = new int[g];
                            for (int i = 0; i < g; i++) {
                            System.out.println("Capture el numero");
                            numerosM[i] = DK.nextInt();   
                            }
                            System.out.println();
                            for (int i = 0; i < g; i++) {
                            System.out.println("Dato "+i+" ="+numerosM[i]);       
                            }
                            System.out.println("\n"
                                    + "Que datos del arreglo desea Multiplicar dado el numero de dato indocado anteriormente\n"
                                    + "Ejemplo: dato 1 (*) dato 2");
                            h=DK.nextInt();       
                            k=DK.nextInt();
                            System.out.println("La Multiplicacion de los datos es: "+(numerosM[h]*numerosM[k]));
                            System.out.println("--------------------------------\n"
                                    + "");
return 0;
}
public static int Divicion(){
System.out.println("--------------------------------\n"
                                    + "");
                            System.out.println("Capture cuantos numeros va a usar para Dividir");
                            g=DK.nextInt();
                            int [] numerosD;
                            numerosD = new int[g];
                            for (int i = 0; i < g; i++) {
                            System.out.println("Capture el numero");
                            numerosD[i] = DK.nextInt();   
                            }
                            System.out.println();
                            for (int i = 0; i < g; i++) {
                            System.out.println("Dato "+i+" ="+numerosD[i]);       
                            }
                            System.out.println("\n"
                                    + "Que datos del arreglo desea Dividir dado el numero de dato indocado anteriormente\n"
                                    + "Ejemplo: dato 1 (/) dato 2");
                            h=DK.nextInt();       
                            k=DK.nextInt();
                            if(numerosD[k]==0){
                            System.out.println("No se puede dividir entre cero");
                            }else{
                            System.out.println("La Divicion de los datos es: "+(numerosD[h]/numerosD[k]));
                            System.out.println("--------------------------------\n"
                                    + "");    
                            }
return 0;
}
public static int Kilometros(){
System.out.println("Capture los kilometros a converir");
                                            d=DK.nextInt();
                                            d1=d * 100000;//Centrimetros
                                            d2=d * 0.621371;//Millas
                                            d3=d * 3280.84;//Pies
                                            d4=d * 39370.1;//Pulgadas
                                             System.out.println("---------------------------------");
                                            System.out.println("Centimetros = "+d1+"\n"
                                                    + "Millas = "+d2+"\n"
                                                    + "Pies = "+d3+"\n"
                                                    + " Pulgadas = " +d4+"\n"
                                                    + "");
                                             System.out.println("---------------------------------");
return 0;
}
public static int Centimetros(){
System.out.println("Capture los centimetros a converir");
                                            d=DK.nextInt();
                                            d1=d * 0.00001;//Kilometros
                                            d2=d * 0.0000062137;//Millas
                                            d3=d * 0.0328084;//Pies
                                            d4=d * 0.393701;//Pulgadas
                                             System.out.println("---------------------------------");
                                            System.out.println("Kilometros = "+d1+"\n"
                                                    + "Millas = "+d2+"\n"
                                                    + "Pies = "+d3+"\n"
                                                    + " Pulgadas = " +d4+"\n"
                                                    + "");
                                             System.out.println("---------------------------------");
return 0;
}
public static int Millas(){
System.out.println("Capture las Millas a converir");
                                            d=DK.nextInt();
                                            d1=d * 160934.4;//Centrimetros
                                            d2=d * 1.60934;//Kilometros
                                            d3=d * 5280;//Pies
                                            d4=d * 63360;//Pulgadas
                                             System.out.println("---------------------------------");
                                            System.out.println("Centimetros = "+d1+"\n"
                                                    + "Kilometros = "+d2+"\n"
                                                    + "Pies = "+d3+"\n"
                                                    + " Pulgadas = " +d4+"\n"
                                                    + "");
                                             System.out.println("---------------------------------");
return 0;
}
public static int Pies(){
System.out.println("Capture los pies a converir");
                                            d=DK.nextInt();
                                            d1=d * 30.48;//Centrime
                                            d2=d * 0.000189394;//Millas
                                            d3=d * 0.0003048;//Kilometros
                                            d4=d *  12;//Pulgadas
                                             System.out.println("---------------------------------");
                                            System.out.println("Centimetros = "+d1+"\n"
                                                    + "Millas = "+d2+"\n"
                                                    + "Kilometros = "+d3+"\n"
                                                    + " Pulgadas = " +d4+"\n"
                                                    + "");
                                             System.out.println("---------------------------------");
return 0;
}
public static int Pulgadas(){
System.out.println("Capture las pulgadas a converir");
                                            d=DK.nextInt();
                                            d1=d * 2.54;//Centrimetros
                                            d2=d * 0.0000157828;//Millas
                                            d3=d * 0.0833333;//Pies
                                            d4=d * 0.0000254;//Kilometros
                                             System.out.println("---------------------------------");
                                            System.out.println("Centimetros = "+d1+"\n"
                                                    + "Millas = "+d2+"\n"
                                                    + "Pies = "+d3+"\n"
                                                    + " Kilometros = " +d4+"\n"
                                                    + "");
                                             System.out.println("---------------------------------");
return 0;
}
public static int Libras(){
System.out.println("Capture las libras a converir");
                                            e=DK.nextInt();
                                            e1=e * 0.4536;//Kilogramos
                                            e2=e * 16;//Onzas
                                            e3=e * 453.6;//Gramos
                                             System.out.println("---------------------------------");
                                            System.out.println("Kilogramos = "+e1+"\n"
                                                    + "Onzas = "+e2+"\n"
                                                    + "Gramos = "+e3+"\n"
                                                    + "");
                                             System.out.println("---------------------------------");
return 0;
}
public static int Kilogramos(){
System.out.println("Capture los Kilogramos a converir");
                                            e=DK.nextInt();
                                            e1=e * 2.2046;//Libras
                                            e2=e * 35.274;//Onzas
                                            e3=e * 1000;//Gramos
                                             System.out.println("---------------------------------");
                                            System.out.println("Kilogramos = "+e1+"\n"
                                                    + "Onzas = "+e2+"\n"
                                                    + "Gramos = "+e3+"\n"
                                                    + "");
                                             System.out.println("---------------------------------");
return 0;
}
public static int Onzas(){
System.out.println("Capture las Onzas a converir");
                                            e=DK.nextInt();
                                            e1=e * 0.02835;//Kilogramos
                                            e2=e * 0.0625;//Libras
                                            e3=e * 28.35;//Gramos
                                             System.out.println("---------------------------------");
                                            System.out.println("Kilogramos = "+e1+"\n"
                                                    + "Onzas = "+e2+"\n"
                                                    + "Gramos = "+e3+"\n"
                                                    + "");
                                             System.out.println("---------------------------------");
return 0;
}
public static int Gramos(){
System.out.println("Capture las Gramos a converir");
                                            e=DK.nextInt();
                                            e1=e * 0.001;//Kilogramos
                                            e2=e * 0.03527;//Onzas
                                            e3=e * 0.0022046;//libras
                                             System.out.println("---------------------------------");
                                            System.out.println("Kilogramos = "+e1+"\n"
                                                    + "Onzas = "+e2+"\n"
                                                    + "libras = "+e3+"\n"
                                                    + "");
                                             System.out.println("---------------------------------");
return 0;
}
public static int Celcius(){
System.out.println("Capture las Celcius a converir");
                                            f=DK.nextInt();
                                            f1=(f * 9/5) + 32;//Fahrenheit
                                            f2=f +273.15;//Kelvin
                                             System.out.println("---------------------------------");
                                            System.out.println("Fahrenheit = "+f1+"\n"
                                                    + "Kelvin = "+f2+"\n"
                                                    + "");
                                             System.out.println("---------------------------------");
return 0;
}
public static int Fahrenheit(){
System.out.println("Capture las Celcius a converir");
                                            f=DK.nextInt();
                                            f1=f * 100000;//Fahrenheit
                                            f2=f * 0.621371;//Kelvin
                                             System.out.println("---------------------------------");
                                            System.out.println("Fahrenheit = "+f1+"\n"
                                                    + "Kelvin = "+f2+"\n"
                                                    + "");
                                             System.out.println("---------------------------------");
return 0;
}
public static int Kelvin(){
System.out.println("Capture las Celcius a converir");
                                            f=DK.nextInt();
                                            f1=f * 100000;//Fahrenheit
                                            f2=f * 0.621371;//Kelvin
                                             System.out.println("---------------------------------");
                                            System.out.println("Fahrenheit = "+f1+"\n"
                                                    + "Kelvin = "+f2+"\n"
                                                    + "");
                                             System.out.println("---------------------------------");
return 0;
}
public static void main(String[] args) {
do{
MenuPrincipal();
switch(a){
        case 1:
                do{
                MenuAritmetico();
                switch(b){
                        case 1: //suma
                            Suma();  
                        break;
                        case 2: //Resta
                            Resta();
                        break;
                        case 3: //Multiplicacion
                            Multiplicacion();
                        break;
                        case 4: //Divicion
                            Divicion();
                        break;
                        case 5:
                            System.out.println("Regresando.......\n"
                                    + "");
                        break;
                        default:
                            System.out.println("Dato equivocado!!!");
                        break;
                        }
                }while(b!=5);
        break;
        case 2:
                do{
                MenuConversiones();
                switch(c){
                        case 1:
                             do{
                             MenuLongitudes();
                             switch(c1){
                                       case 1:
                                          Kilometros(); 
                                       break;
                                       case 2:
                                          Centimetros();  
                                       break;
                                       case 3:
                                          Millas();  
                                       break;
                                       case 4:
                                            Pies();
                                       break;
                                       case 5:
                                            Pulgadas();
                                       break;
                                       case 6:
                                             System.out.println("Regresando.......\n"
                                                    + "");
                                       break;
                                       default:
                                             System.out.println("Dato equivocado!!!!");
                                       break;
                                       }
                             }while(c1!=6);
                        break;
                        case 2:
                            do{
                            MenuMasas();
                            switch(c2){
                                      case 1:
                                            Libras();
                                      break;
                                      case 2:
                                            Kilogramos();
                                      break;
                                      case 3:
                                            Onzas();
                                      break;
                                      case 4:
                                            Gramos();
                                      break;
                                       case 5:
                                            System.out.println("Regresando.....");
                                      break;
                                      default:
                                             System.out.println("Dato equivocado!!!!");
                                       break;
                            }
                            }while(c2!=5);
                        break;   
                        case 3:
                            do{
                            MenuTemperaturas();    
                            switch(c3){
                                      case 1:
                                            Celcius();
                                      break;
                                      case 2:
                                            Fahrenheit();
                                      break;
                                      case 3:
                                            Kelvin();
                                      break;
                                      case 4:
                                            System.out.println("Regresando.....");
                                      break;
                                      default:
                                           System.out.println("Dato equivocado!!!!");
                                      break;    
                                      
                            }
                            }while(c3!=4);
                        break;
                         }
                }while(c!=4);
        break;
        }
        

}while(a!=3);

}

}
