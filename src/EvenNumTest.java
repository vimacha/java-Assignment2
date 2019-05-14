import java.util.Scanner;

public class EvenNumTest {
    public  boolean isEven(int number){
        if(number%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        EvenNumTest e=new EvenNumTest();
        System.out.println("Enter any number");
        int num=sc.nextInt();
        System.out.println(e.isEven(num));
    }
}