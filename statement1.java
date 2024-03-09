import java.util.Scanner;

public class statement1 {
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("adult:drive,they can vote\n");
        }
        else{
            System.out.println("not adult:not drive,they xcan not vote\n");
        }
    }
    
}
