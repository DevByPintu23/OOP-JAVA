import java.util.Scanner;
public class divisibleBy3and5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the marks:");
        int  n = sc.nextInt();
       if(n%15==0) System.out.println("it is divisible by 3 and 5");
       else System.out.println("it is not divisible by 3 and 5");
       
        

    }
}
