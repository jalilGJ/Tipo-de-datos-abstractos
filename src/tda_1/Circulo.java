/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tda_1;

/**
 *
 * @author hp
 */
public class Circulo {//clase base

    double area;//atributos o variables a utilizar 
    double radio;//atributos o variables a utilizar 

    public void setRadio(double radio) {//metdo para ingresar el valor del radio desde el codigo en el main
        this.radio = radio;//se le da un valor al radio
    }

    public double cal_area_circulo() {//metodo para calcular el area del circulo

        area = Math.PI * Math.pow(radio, 2);//formula para calcular el area
        return area;//se retorna el valor obtenido

    }

    public double getArea() {//metodo get para mostrar el valor del area 
        return area;
    }
    
}
