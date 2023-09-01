
import java.util.Scanner;

public class code3 {

    double bal= 69_000.0;
    public int pin=0000;

    void withdrawl(int amt)
    {
                if(amt<bal)
                {
                    System.out.println("The amout has been deducted");
                    bal=bal-amt;
                    System.out.println("The remanining balance is "+bal);
                }
                else
                {
                    System.out.println("Insufficient balance");

                }
    }
    void Check() {
        System.out.println("the balance is " + bal);
    }

    void deposit(int amt)
    {
        bal=bal+amt;
        System.out.println("balance updated "+bal);
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        code3 ab= new code3();
        System.out.println("Enter the pin");
        int p=sc.nextInt();
        if(p==ab.pin)
        {
            System.out.println("Choose from the option");
            System.out.println("1 Withdraw \n 2 Deposit \n 3 Check Balance");
            int c=sc.nextInt();

            switch (c)
            {
                case 1:
                    System.out.println("Enter the amount ");
                    int amt=sc.nextInt();
                    ab.withdrawl(amt);
                    break;

                case 2:
                    System.out.println("Enter the amount ");
                    int dep=sc.nextInt();
                    ab.deposit(dep);
                    break;

                case 3:
                    ab.Check();
                    break;

                default:
                    System.out.println("Invalid input");
            }
        }

        else
        {
            System.out.println("Incorrect pin");
        }
    }






}


