import java.util.Scanner;
public class threeDigitNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the marks:");
        int  n = sc.nextInt();
        if(n>=100 && n<=999){
            System.out.println("it is tree digit number");
        }else{
            System.out.println("it is not three digit number");
        }
       
        

    }
}
