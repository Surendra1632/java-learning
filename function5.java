import java.util.Scanner;

public class function5 {
    public static void swap(int a,int b){
        //swap
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        //int a=5;
        //int b=10;
        swap(a,b);

    }
    
}
