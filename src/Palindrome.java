import java.io.*;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        number=sc.nextInt();
        String result=checkPalindrome(number);
        System.out.println(result);

    }
    public static String checkPalindrome(int number)
    {
        int digit=number,rem=0,number1=0;
        while(number>0)
        {
            rem=number%10;
            number1=number1*10+rem;
            number/=10;
        }
        if(digit==number1)
        {
            return "palindrome";
        }
        else
        {
            return "not a palindrome";
        }
    }
}