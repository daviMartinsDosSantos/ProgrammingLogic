import javax.swing.JOptionPane;
public class MonthsOfTheYear {


    public static void main(String[] args){

    int value = Integer.parseInt(JOptionPane.showInputDialog("Type it a number from 1 to 12"));

    if (value==1)
        JOptionPane.showMessageDialog(null, "January");
    else if(value==2)
        JOptionPane.showMessageDialog(null, "February");
    else if(value==3)
        JOptionPane.showMessageDialog(null, "March");
    else if(value==4)
        JOptionPane.showMessageDialog(null, "April");
   else if(value==5)
        JOptionPane.showMessageDialog(null, "May");
    else if(value==6)
        JOptionPane.showMessageDialog(null, "June");
    else if(value==7)
        JOptionPane.showMessageDialog(null, "July");
    else if(value==8)
       JOptionPane.showMessageDialog(null, "August");
    else if(value==9)
        JOptionPane.showMessageDialog(null, "September");
    else if(value==10)
       JOptionPane.showMessageDialog(null, "October");
    else if(value==11)
        JOptionPane.showMessageDialog(null, "November");
    else if(value==12)
        JOptionPane.showMessageDialog(null, "December");
    else
        JOptionPane.showMessageDialog(null, "Value Invalid");
    }
}
