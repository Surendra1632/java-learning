import java.util.Scanner;
public class function4 {
    public static int calculatesum(int num1,int num2){//parameter or formal parameter
        int sum = num1+num2;
       return sum;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int a=sc.nextInt();
        int sum= calculatesum(a,b);//arguments
        System.out.println("sum is :"+sum); 

    }
    
}
