import java.util.Scanner;
class cost{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter quantity");
    int quantity = sc.nextInt();
    int totalCost=quantity*100;
    if(quantity>1000){
        int discount=(totalCost/100)*10;
        int discountPrice=totalCost-discount;
     System.out.println("discount price"+discountPrice) ;
    }
    else{
      System.out.println("No discount");
    }
  }
}