package serie;

import javax.swing.JOptionPane;

public class mayorSerie {

    public static void main(String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño del arreglo"));

        float[] notas = new float[num];

        for (int i = 0; i < notas.length; i++) {

            notas[i] = ((i + 1) * (i + 2) + 2) / 2;
            //(1/2)(i+1)(i+1)+((1/2)*(i+1))+1;
        }
        for (int i = 0; i < notas.length; i++) {

            JOptionPane.showMessageDialog(null, "El numero   es:  " + notas[i]);

        }

    }

}
