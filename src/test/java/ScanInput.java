import java.util.Scanner;

public class ScanInput {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter the number");
        int a;
        String str1;
        a=obj.nextInt();
        System.out.println("You have entered this number: "+a);

        System.out.println("Please enter String: " );


        System.out.println("enter any string");
        str1= obj.next();
        obj.close();

    }
}
