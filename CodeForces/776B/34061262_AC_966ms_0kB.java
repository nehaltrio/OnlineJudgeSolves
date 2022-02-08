import java.util.Scanner;

    public class Main
    {

        static final  int n = 100002;

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();

            if(x<3) {
                System.out.println(1);
            }
            else {
                System.out.println(2);
            }

            boolean[] primes = sieveOfEratosthenes();

            if (x ==1){
                System.out.println(1);
            }else if (x == 2) {
                System.out.println(1 + " " + 1);
            }else {
                for (int i = 2; i <= x + 1; i++) {
                    int flag;
                    if (primes[i]) {
                        flag = 2;
                    } else {
                        flag = 1;
                    }
                    System.out.printf("%d ", flag);
                }
            }
        }

        public static boolean[] sieveOfEratosthenes() {

            boolean[] primes = new boolean[n + 1];

            for (int i = 0; i <= n; i++) {
                primes[i] = true;
            }

            primes[0] = false;
            primes[1] = false;

            for (int i = 0; i * i <= n; i++) {
                if (primes[i]) {
                    for (int j = 2; i * j <= n; j++) {
                        primes[i * j] = false;
                    }
                }

            }

            return primes;

        }

    }