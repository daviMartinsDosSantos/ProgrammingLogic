package challenge;

import javax.swing.*;
import java.util.Random;

public class TriplaDePitágoras {

    public static void main(String[] args) {
        Random rand = new Random();
        int n = 0;
        StringBuilder str = new StringBuilder();

        do {
            int a = 1 + rand.nextInt(99);
            int b = 1 + rand.nextInt(99);
            int c = 1 + rand.nextInt(99);

            if (a * a + b * b != c * c)
                continue;

            ++n;
            str.append("Tripla ")
                    .append(n)
                    .append(" = ")
                    .append(" a = ")
                    .append(a)
                    .append(", b = ")
                    .append(b)
                    .append(", c = ")
                    .append(c)
                    .append("\n");
        } while (n < 4);

        JOptionPane.showMessageDialog(null, str.toString());

    }
}
