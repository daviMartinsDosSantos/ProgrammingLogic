import javax.swing.*;

public class HowManyDaysToLive {


    public static void main(String[] args) {

        int year, month, days, total;

        year = Integer.parseInt(JOptionPane.showInputDialog("Type it the year: "));
        days = Integer.parseInt(JOptionPane.showInputDialog("Type the Days: "));

        if (days > 30) {
            JOptionPane.showMessageDialog(null, "The month No is more larger that thirty Days!");
        }
        month = Integer.parseInt(JOptionPane.showInputDialog("Type it the month: "));

        total = 365 * year + 30 * month + days;

        JOptionPane.showMessageDialog(null, "The amount of Days is: " + total);
    }
}