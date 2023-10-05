/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorymethod_ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Arzate
 */
public class FactoryMethod_Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
      FabricaDulce FD=null;
        int x,num;
        do{
       System.out.println("Seleccione una opcion para el menu 1)Chocolate 2)Chicle 3)Mazapan");
       num=leer.nextInt();
       switch(num){
           case 1:
               FD= new FabricaChocolate();
               break;
           case 2:
               FD= new FabricaChicle();
               break;
           case 3:
               FD=new FabricaMazapan();
               break;
           default:
               num=0;
               break;
       }
       //hacemos referencia a nuestra interfaz
       IDulce dulce= FD.ordenarDulce();
        } while(num!=0);
    }
}
