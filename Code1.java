//import java.lang.Math;
//
//
//class abc {
//    public static void main(String[] args) {
//
//        int x;
//        x = (int) (Math.random() * 100 + 1);
//
//        System.out.println("The random value is " + x);
//
//    }
//}

import java.sql.SQLOutput;
import java.util.Random ;
import java.util.Scanner ;

class code1 {

    public static void main(String[] args) {

        char c = 'Y';
        while (c != 'n') {
            switch (c) {

                case 'Y': {
                    Random ab = new Random();
                    int x = ab.nextInt(100);


                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the no. attempts you want");
                    int n = sc.nextInt();

                    int a;

                    for (int i = 0; i < n; i++) {
                        System.out.println("Guess the no.");
                        a = sc.nextInt();

                        if (a == x) {
                            System.out.println("The no. is right");
                            break;

                        } else if (a > x) {
                            System.out.println("NO The no. you guessed is bigger");
                        } else {
                            System.out.println("NO The no. you guessed is smaller");
                        }
                    }
                    System.out.println("The number is "+x);

                    System.out.println("Game over");

                    System.out.println("Play again Y/N");
                    c = sc.next().charAt(0);
                    break;
                }


                case 'N':
                    System.out.println("Bye");
                    c='n';
                    break;

                default:
                    System.out.println("Inavalid Input");

            }

        }
    }
}

