import java.util.Scanner;
public class function2 {
    public static void helloworld(){//in class create a multiple function
    System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }
    public static void calculatesum(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum is :"+sum);//return function

    }
     public static void main(String args []){
        calculatesum();
        helloworld();//calling function

    }
    
}
