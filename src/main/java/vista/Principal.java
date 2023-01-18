/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author Alex
 */
public class Principal {
    
    public static void main(String[] args) {
        var ventana = new VentanaPedido();
        var ventana1 = new VentanaProducto();
        var ventana2 = new VentanaProveedor();
        
        ventana.setVisible(true);
        ventana1.setVisible(true);
        ventana2.setVisible(true);
    }
}
