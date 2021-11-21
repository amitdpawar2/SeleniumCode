public class OperatorProgram {

    int a=6,b=5,c;
    public void addition()
    {

        c=a+b;

        System.out.println("Addition of the number "+c);
        c=++a;
        System.out.println(c);
    }
    public static void main(String[] args) {
        OperatorProgram obj= new OperatorProgram();
        obj.addition();

    }
}
