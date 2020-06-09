package pkg05.poo;

import javax.swing.JOptionPane;

public class perroMain {

    public static void main(String[] args) {

        perro mensaje = new perro();

        mensaje.colorperr(JOptionPane.showInputDialog("digite color perro "));
        mensaje.anosperr(Integer.parseInt(JOptionPane.showInputDialog("digite Años Perro")));
        mensaje.emfer(JOptionPane.showInputDialog("ha estado  el perro emfermo"));
        mensaje.coloreyes(JOptionPane.showInputDialog("Digite color  ojos"));

        JOptionPane.showMessageDialog(null, mensaje.imprimir());

    }

}
