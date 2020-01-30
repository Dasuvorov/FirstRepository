public class fib {
    public static void main(String[] args) {
        long n0 = 1;
        long n1 = 1;
        long n2 = 0;
        for (long i = 0; i < 11; i++) {
            if (i == 0) {
                System.out.print(0 + " ");
            }else if (i == 1){
                System.out.print(1 + " ");
            }

            else {
                n2 = n0 + n1;
                n0 = n1;
                n1 = n2;
                System.out.print(n2+ " ");
            }
        }

    }
}
