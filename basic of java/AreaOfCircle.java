import java.util.Scanner;
public class AreaOfCircle {
         public static void main(String[] args) {
        /*double pi=3.1415;// math
        double radius=5;//chem
        
        double A=pi*radius*radius;
        System.out.println("the area of the circle is ="+A);
       */

    

    Scanner sc=new Scanner(System.in);
    System.out.print("enter radius :");
    int radius;
    radius = sc.nextInt();
    double pi=3.14;
    double area=pi*radius*radius;
    System.out.println(area);
}
}