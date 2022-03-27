package challenge;

import javax.swing.*;

public class Challenge {

    public static void main(String[] args) {

        int value1 = Integer.parseInt(JOptionPane.showInputDialog("Type it the value one: "));
        int value2 = Integer.parseInt(JOptionPane.showInputDialog("Type it the value two: "));
        int value3 = Integer.parseInt(JOptionPane.showInputDialog("Type it the value tree: "));

        String message = "";
        if (value1 == value2 && value2 == value3) {
            message =  "equals numbers";
        } else {
            if (value1 > value2) {
                if (value1 > value3) {
                    message =  "The number one is the larger number";
                } else if (value1 == value3) {
                    message =  "The number tree and number one is equals";
                }
            } else {
                if (value2 == value1 && value2 > value3) {
                    message =  "The number two and number one is equals numbers and more larger that number tree";
                } else if (value2 == value3 && value3 > value1) {
                    message =  "The number two and number tree is equals numbers and more larger that number one";


                } else if (value2>value3) {
                    message = "The number two is the more larger number";
                }else{
                    message = "The number tree is the more larger number";
                }
            }
        }
        JOptionPane.showMessageDialog(null, message);
    }
}