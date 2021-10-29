import java.util.Scanner;

public class ScanInput {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter the number");
        int a;
        a=obj.nextInt();
        System.out.println("You have entered this number: "+a);

        System.out.println("Please enter String: " );
       String b;


        obj.close();

    }
}
