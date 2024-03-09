import java.util.Scanner;

public class add{
    public static void main(String[] args){
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter your First Number");
     int a= sc.nextInt();
     System.out.println("Enter the value of b ");
     int b= sc.nextInt();
     int c=a/b;
     System.out.println("A divided by b");
     System.out.println(c);
    }
}