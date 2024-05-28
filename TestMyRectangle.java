package QAP2;

import java.util.Scanner;

public class TestMyRectangle {
    public static void main(String[] args) {
        //user inputs
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates for the top left corner of the rectangle: ");
        System.out.println("Enter x1: ");
        int x1 = scanner.nextInt();
        System.out.println("Enter y1: ");
        int y1 = scanner.nextInt();

        System.out.println("Enter coordinates for the bottom right corner of the rectangle: ");
        System.out.println("Enter x2: ");
        int x2 = scanner.nextInt();
        System.out.println("Enter y2: ");
        int y2 = scanner.nextInt();

        //new rectangle
        MyRectangle rect1 = new MyRectangle(x1, y1, x2, y2);
        System.out.println(rect1);

        scanner.close();
    }


}
