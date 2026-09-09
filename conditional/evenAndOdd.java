import java.util.Scanner;
public class evenAndOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int x = sc.nextInt();
        if(x%2==0){
            System.out.println("it is the even number");
        }else{
            System.out.println("it is odd number");
        }
    }
}
