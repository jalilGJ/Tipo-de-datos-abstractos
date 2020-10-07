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
public class TDA_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo area = new Circulo();//se instancia el objeto
        System.out.println("calcular el area de un circulo.");//mensaje 
        area.setRadio(23.45);//se ingresa el valor del radio com el metodo set
        area.cal_area_circulo();//calcula el valor del area
        System.out.println(area.getArea());//imprime el valor del area get
    }
}
