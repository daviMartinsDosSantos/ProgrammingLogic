public class Expression {

    public static void main(String[] args) {

     double s = 0,num,den;

     for (int i = 0; i < 50; i++){

         num = 2 * i + 1;
         den = i + 1;
         s += (num/den);

     }

     System.out.println(s);

    }
}
