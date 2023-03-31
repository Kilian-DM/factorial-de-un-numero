package factorialnumeroobjeto;

import javax.swing.JOptionPane;

public class FactorialNumeroOBJETO {

    public static void main(String[] args) {

        long num, facto;
        String dato;
        dato = JOptionPane.showInputDialog(null, "Escriba un numero para hallar el factorial");
        num = Long.parseLong(dato);

        factorial factorialnumero = new factorial(num);
        facto = factorialnumero.calcular();

        JOptionPane.showMessageDialog(null, "El factorial de " + num + " Es " + facto);

    }
}
