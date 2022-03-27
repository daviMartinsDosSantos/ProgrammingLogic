import javax.swing.*;

public class Wage {

    public static void main(String[] args) {

    String name;
    int dependents, hours;
    float WageBrut, Wageliquid, it,inss;

    name = JOptionPane.showInputDialog("Type it the name");
    hours = Integer.parseInt(JOptionPane.showInputDialog("Type it the number in hours: "));
    dependents = Integer.parseInt(JOptionPane.showInputDialog("Type it the number in dependents: "));

    WageBrut = (12 * hours + 40 * dependents );
    it = WageBrut * 0.05f;
    inss = WageBrut * 0.085f;
    Wageliquid = WageBrut + it - inss;

    JOptionPane.showMessageDialog(null, "Nome: " + name +
                                  "\nHours worked: " + hours + "\nWage Brut: " + WageBrut + "\nWage Liquid: " +Wageliquid + "\nIncotame tax: " + it + "\nINSS: " + inss );

    }
}