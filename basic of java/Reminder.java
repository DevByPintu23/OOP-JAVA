import java.util.Scanner;
public class Reminder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a;
        System.out.print("enter the number : ");
        a = sc.nextInt();
        int b;
        System.out.print("entr the divisor: ");
        b = sc.nextInt();
        int remainder=a%b;
        System.out.println("the remainder of "+a+ " divided by "+b+ " is: "+remainder);

    }
}
