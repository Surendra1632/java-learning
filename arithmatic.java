import java.util.Scanner;
public class arithmatic {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System .in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        System.out.println("add="+(A+B));
        System.out.println("sub="+(A-B));
        System.out.println("mul="+(A*B));
        System.out.println("divide="+(A/B));
        System.out.println("floor="+(A%B));
    }
    
}
