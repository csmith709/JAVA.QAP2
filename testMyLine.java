package QAP2;
import java.util.Scanner;

public class testMyLine {
    public static void main(String[] args) {
        //allow for user input
        Scanner scanner = new Scanner(System.in);

        //Get user input
        System.out.println("Enter the coordinates for the first line: ");
        System.out.println("Enter x1: ");
        int x1 = scanner.nextInt();
        System.out.println("Enter y1: ");
        int y1 = scanner.nextInt();
        System.out.println("Enter x2: ");
        int x2 = scanner.nextInt();
        System.out.println("Enter y2: ");
        int y2 = scanner.nextInt();

        //get lengths and gradient for the new line
        myLine line1 = new myLine(x1, y1, x2, y2);
        System.out.println("Length: " + line1.getLength());
        System.out.println("Gradient: " + Math.toDegrees(line1.getGradient()));

        //end prompt
        scanner.close();
    }
}
