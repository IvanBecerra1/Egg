/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ENTIDADES;

import javax.swing.JOptionPane;

/**
 *
 * @author ivan
 * 
 *  Programa Nespresso. Desarrolle una clase Cafetera con los atributos
    capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
    cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
    menos, los siguientes métodos:
    • Constructor predeterminado o vacío
    • Constructor con la capacidad máxima y la cantidad actual
    • Métodos getters y setters.
    • Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
    máxima.
    • Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
    tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
    cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
    método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
    cuanto quedó la taza.
    • Método vaciarCafetera(): pone la cantidad de café actual en cero.
    • Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
    recibe y se añade a la cafetera la cantidad de café indicada.
* 
 */
public class Cafeteria {
    public int capacidadMaxima = 1000;
    public int cantidadActual = 0;
    
    public Cafeteria() { }
    
    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
        JOptionPane.showMessageDialog(null, "Cafetera Llena!");
    }
    public void vaciarCafetera() {
        JOptionPane.showMessageDialog(null, "Cafetera Vacia!");
        cantidadActual = 0;
    }
    public void servirTaza() {
        int sizeTaza = 0;
        do {
            sizeTaza = Integer.parseInt(JOptionPane.showInputDialog((sizeTaza > capacidadMaxima ? "Error: La capacidad Ingresada supera a la cafetera.\nDigite uno nuevamente\n\n" : "")
            + "Digite la Capacidad de la Taza:\n\n 250 ml = 1 Taza"));
            
            JOptionPane.showMessageDialog(null, "Preparando el cafe...");
            
        } while (sizeTaza > capacidadMaxima);
        
        
        JOptionPane.showMessageDialog(null,"Cafe listo...\n\n"
                + (cantidadActual >= sizeTaza ? "Tu cafe quedo completo" : "Tu cafe quedo incompleto")
                + (cantidadActual >= sizeTaza ? "" : ("\nTu taza sobro: " 
                + ((cantidadActual - sizeTaza) < 0 ? ((cantidadActual - sizeTaza) * (-1)) : (cantidadActual - sizeTaza) ) + "ml Para llenar")));
        
        cantidadActual -= (sizeTaza >= cantidadActual ? 0 : sizeTaza);
    }
    
    public void agregarCafe() {
        cantidadActual = Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad de cafe:\n\n250 ml = 1 taza" + "\nCapacidad Maxima: " + capacidadMaxima + "ml")); 
    }
    
    public int getCantidadActual() {
        return cantidadActual;
    }
}
