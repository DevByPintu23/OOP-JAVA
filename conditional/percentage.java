import java.util.Scanner;
public class percentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the marks:");
        int  n = sc.nextInt();
        if(n>90 && n<=100) System.out.println("excellent");
        else if(n>80 && n<=90) System.out.println("very good");
        else if(n>70 && n<=80) System.out.println("good");
        else if(n>60 && n<=70) System.out.println("can do better");
        else{
            System.out.println("fail");
        }
       
        

    }
}
