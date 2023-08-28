import java.util.*;
public class code2
{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter no. of subjects");
        n=sc.nextInt();
        int sum=0;
        int[] arr= new int[n];



        for(int i=0; i<n;i++)
        {
            System.out.println("Enter the marks on subject "+(i+1));
            arr[i] = sc.nextInt();
            sum=sum+arr[i];
        }

        double avg= sum/n;

        System.out.println("The sum is "+sum);
        System.out.println("The average is "+avg);

        if (avg>90)
            System.out.println("The grade achived is O");

        else if(avg<90 && avg>80)
            System.out.println("The grade achived is A");

        else if(avg<80 && avg>70)
            System.out.println("The grade achived is A");

        else if(avg<70 && avg>60)
            System.out.println("The grade achived is A");

        else
            System.out.println("you failed");


    }
}
