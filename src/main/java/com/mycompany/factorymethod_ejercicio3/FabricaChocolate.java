/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod_ejercicio3;

/**
 *
 * @author Arzate
 */
public class FabricaChocolate extends FabricaDulce{

    @Override
    public IDulce crearDulce() {
    return new Chocolate();
    }

    
}
