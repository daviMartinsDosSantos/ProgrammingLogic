public class Expression2 {

    public static void main(String[] args){

        double s = 0, num, den;

        for (int i = 0; i < 10; i++){

            num = ((i%2) == 0 ? i + 1: - (i + 1));
            den = num * num;
            s += (num/den);
        }

        System.out.println(s);

    }
}
