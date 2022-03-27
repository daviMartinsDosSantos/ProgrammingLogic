import javax.swing.*;

public class School {

    public static void main(String[] args) {

    String name, result;

    float n1,n2,n3,n4,average;

    name = JOptionPane.showInputDialog("type it the name");
    n1 = Float.parseFloat(JOptionPane.showInputDialog("type it a note 1"));
    n2 = Float.parseFloat(JOptionPane.showInputDialog("type it a note 2"));
    n3 = Float.parseFloat(JOptionPane.showInputDialog("type it a note 3"));
    n4 = Float.parseFloat(JOptionPane.showInputDialog("type it a note 4"));

        average = (n1 + n2 + n3 +n4)/4;

    if (average>=7) {
        result = "Student approved " + average;
    } else {
        result = "Student disapproved " + average;
    }
    JOptionPane.showMessageDialog(null, "Student: " + name +
                                                                  "\nNote De Mathematical: " + n1 +
                                                                   "\nNote De English: " + n2 +
                                                                    "\nNote De Science: " + n3 +
                                                                     "\nNote De Art: " + n4 +
                                                                      "\nResult: " + result);
    }
}
