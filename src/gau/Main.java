package gau;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        System.out.println("ვერსია1");

        Scanner num = new Scanner(System.in);
        System.out.println();
        int a = num.nextInt();
        System.out.println("*");
        int b = num.nextInt();
        int c = a * b;
        System.out.println(c);

    }
}
