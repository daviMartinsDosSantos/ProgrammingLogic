import javax.swing.*;

public class ValueCompare {

    public static void main(String[] args) {

        int Value = Integer.parseInt(JOptionPane.showInputDialog("Type it one number: "));
        int SecondValue = Integer.parseInt(JOptionPane.showInputDialog("Type it one number: "));

        if (SecondValue >= Value) {
            JOptionPane.showMessageDialog(null, "The number two is more larger that number one.");
        } else {
            JOptionPane.showMessageDialog(null, "The number one is more larger that number one.");
        }
    }
}
