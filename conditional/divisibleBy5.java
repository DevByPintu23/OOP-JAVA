import java.util.Scanner;
public class divisibleBy5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.print("enter the number:");
        n = sc.nextInt();
        if(n%5==0){
            System.out.println("the number divisible by 5");
        }else{
            System.out.println("it is not divisible by 5");
        }
    }
}
