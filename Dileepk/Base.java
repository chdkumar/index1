import java.util.Scanner;

class Base
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age: ");
        int age=sc.nextInt();

        if (age>=18&&age<100)
        {
            System.out.println("you are eligible for the vote");
        }
        else if(age<18)
        {
            System.out.println("you are not eligible for the voting wait for the age of 18");

        }
        else
        {
            System.out.println("the person is dead or alive");
        }
    }
}