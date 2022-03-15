
package actividad_6;

import ENTIDADES.Cafeteria;
import javax.swing.JOptionPane;

public class ACTIVIDAD_6 {
    public static void main(String[] args) {
        Cafeteria coffe = new Cafeteria();
        
        int i = 0, j;
        do {
            j = Integer.parseInt(JOptionPane.showInputDialog("Cafeteria Virtual\nCantidad actual: " + coffe.getCantidadActual() + "\n\n"
                    + "\n1. Llenar Cafetera al Maximo"
                    + "\n2. Vaciar Cafetera"
                    + "\n\n3. Servir Taza"
                    + "\n4. Agregar cafe"
                    + "\n\n5. Salir/Terminar"));
            
            switch (j) {
                case 1: coffe.llenarCafetera(); break;
                case 2: coffe.vaciarCafetera(); break;
                case 3: {
                    
                    if (coffe.getCantidadActual() == 0) 
                        JOptionPane.showMessageDialog(null, "La cafetera esta vacia");
                    else 
                        coffe.servirTaza();
                    
                    break;
                } 
                case 4: coffe.agregarCafe(); break;
                default: {
                    j = (j == 5 ? (i = 5) : j);
                    break;
                }
            }
        } while (i != 5);
        
    }
    
}
