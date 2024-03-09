import java.util.Scanner;

public class function3 {
    public static void calculatesum(int numb1,int numb2){
    int sum=numb1+numb2;
    System.out.println("sum is :"+sum);


    }
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int a=sc.nextInt();
        calculatesum(a,b);


    }
    
}
