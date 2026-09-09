import java.util.Scanner;
public class areaPerimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the lengh:");
        int  l = sc.nextInt();
       
        System.out.print("enter the breth:");
        int b = sc.nextInt();
        int area = l*b;
        int perimeter = 2*(l+b);
        if(area<perimeter){
            System.out.println("perimeter the is the greater than the aream");
        }else{
            System.out.println("area the is the greater than the perimeter");
        }

    }
}
