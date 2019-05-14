import java.util.Scanner;
import java.io.*;
public class Average{
    public static void main(String[] args)
    {
        int number,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students");
        number=sc.nextInt();
        int a[]=new int[number];
        for(i=0;i<number;i++)
        {
            System.out.println("Enter the marks of student ");
            a[i]=sc.nextInt();
        }
        average(a,number);
        minimum(a,number);
        maximum(a,number);
    }
    public static void average(int a[],int number)
    {
        int i=0,sum=0;
        float average;
        for(i=0;i<number;i++)
        {
            sum+=a[i];
        }
        average=sum/number;
        System.out.println("The average of students is"+average);
    }
    public static void minimum(int a[],int number)
    {
        int i=0,sum=0,temp;
        int min=a[i];
        for(i=1;i<number;i++)
        {
            if(min>a[i])
            {
                temp=min;
                min=a[i];
                a[i]=temp;

            }
        }

        System.out.println("The minimum of the grades is"+min);
    }
    public static void maximum(int a[],int number)
    {
        int i=0,sum=0,temp;
        int max=a[i];
        for(i=1;i<number;i++)
        {
            if(max<a[i])
            {
                temp=max;
                max=a[i];
                a[i]=temp;

            }
        }

        System.out.println("The maximum of the grades is"+max);
    }
}