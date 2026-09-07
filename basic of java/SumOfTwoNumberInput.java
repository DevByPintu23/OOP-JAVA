import java.util.Scanner;
public class SumOfTwoNumberInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.print("enter the number of a :");
        a =sc.nextInt();
        int b;
        System.out.print("enter the numbe of b: ");
        b = sc.nextInt();
        int sum=a+b;
        System.out.println("the total sum of a and b is = "+sum);
    }
}
