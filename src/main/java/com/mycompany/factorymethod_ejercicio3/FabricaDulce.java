/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod_ejercicio3;

/**
 *
 * @author Arzate
 */
public abstract class FabricaDulce {
    //creamos un tipo de dato de nuestra interfas IDULCE llamado crearDulce
    public abstract IDulce crearDulce();
    //ahora creamos una funcion tipo IDulce donde hacemos la INSTANCIA DE LA INTERFAZ , le damos el nombre dulce y creamos el dulce 
    public IDulce ordenarDulce(){
     IDulce dulce = crearDulce();
     //accedemos a los metodos que tiene la interfaz,en este caso es empaquetar
     dulce.empaquetar();
     return dulce;
    }
}
