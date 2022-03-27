import javax.swing.*;
import java.util.Random;

public class Numbers {

    public static void main(String[] args) {
    Random rand = new Random();
    int value = 0,attempt = 0;
    int x = rand.nextInt(99);

    while(value != x+1) {
          value = Integer.parseInt((JOptionPane.showInputDialog("Type it the value")));

          if (value < x + 1){
              JOptionPane.showMessageDialog(null,"The value is more larger, try again.");
              attempt++;
          }else if (value > x + 1){
              JOptionPane.showMessageDialog(null,"The value is smaller, try again");
              attempt++;
          }else{
              JOptionPane.showMessageDialog(null,"Congratulations, you're right " + attempt + " attempts");
          }
    }
















    }
}
