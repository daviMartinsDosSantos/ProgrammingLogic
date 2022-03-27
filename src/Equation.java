import javax.swing.*;

public class Equation {

    public static void main(String[] args) {

        Double a, b, c, delta, x1, x2;

        a = Double.parseDouble(JOptionPane.showInputDialog("Digit the value in a"));
        if (a != 0) {

            b = Double.parseDouble(JOptionPane.showInputDialog("Digit the value the b"));
            c = Double.parseDouble(JOptionPane.showInputDialog("Digit the value the c"));

            delta = b * b - 4 * a * c;
            if (delta >= 0) {
                x1 = (- b + Math.sqrt(delta))/2*a;
                x2 = (- b - Math.sqrt(delta))/2*a;


                if (delta == 0) {
                    JOptionPane.showMessageDialog(null, "Exist two roosts reals and equals" +
                                                  "\nDelta = " + delta +
                                                  "\nx1 = " + String.format("%.2f", x1) +
                                                  "\nx2 = " + String.format("%.2f", x2) );
                } else {
                    JOptionPane.showMessageDialog(null, "There are two roots reals and many different" +
                                                 "\nDelta = " + delta +
                                                 "\nx1 = " +  String.format("%.2f", x1) +
                                                 "\nx2 = " +  String.format("%.2f", x2) );

                }

            } else {
                JOptionPane.showMessageDialog(null, "No exist roosts reals");
            }

        } else {
            JOptionPane.showMessageDialog(null, "The value in the a no is 0");
        }

    }

}
