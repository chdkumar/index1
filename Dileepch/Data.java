import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        int i,age,rollno;
        String name,addr;
        Scanner s=new Scanner(System.in);
        System.out.println("enter number of students: ");
        int n=s.nextInt();
        for(i=0;i<n;i++)
        {
            Scanner sc=new Scanner(System.in);
             
            System.out.println("enter student name: ");
            name =sc.nextLine();
            
            System.out.println("Enter the student Address: ");
		    addr =sc.nextLine();


            System.out.println("enter student age: ");
            age=sc.nextInt();

          

            System.out.println("enter the Rollno: ");
            rollno =sc.nextInt();

            System.out.println("name: "+name);
            System.out.println("age: "+age);
            System.out.println("Address: "+addr);
            System.out.println("Rollno "+rollno);
        }
        

        
    }
    
}
