import java.io.*;
import java.util.*;
public class Power {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        isPower(number);
    }
    public static boolean isPower(int number)
    {
        int digit=number;
        while(number>4)
        {
            number=number/4;
        }

        if(number==4)
        {
            System.out.println(digit+"is power of 4");
            return true;

        }
        else
        {
            System.out.println(digit+"is  not power of 4");
            return false;
        }
    }
}
