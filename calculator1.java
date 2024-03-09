import java.util.Scanner;
public class calculator1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char oprator=sc.next().charAt(0);
        switch(oprator){
            case '+':System.out.println(a+b);
                  break;
            case '-':System.out.println(a-b);
                break;
            case'*' :System.out.println(a*b);
                    break;
            case'/' :System.out.println(a%b);
                 break;
        }
    }
    
}
