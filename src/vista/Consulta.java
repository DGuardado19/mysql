/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JFrame;

/**
 *
 * @author LN710Q
 */
public class Consulta extends JFrame {
    
public final void formulario (){
    codigo =new JTextField();
    marca = new JComboBox();
    stock =new JTextField();
    si= new JRadioButton("si", true),
    no= new JRadioButton("no");
    resultador =new JTable();
    buscar= new JButton ("Buscar");
    insertar =new JButton ("Insertar");
    eliminar = new JButton("Eliminar");
    actualizar =new JButton("Actualizar");
    limpíar = new JButton("Limpiar");
    table =new JButton("Limpiar");
    marca.addItem("FRAM");
    marca.addItem("WIX");
    marca.addItem("Luber Finer");
    marca.addItem("OSK");
    existencia=newButtonGroup();
    existencia.add(si);
    existencia.adda(no);
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
