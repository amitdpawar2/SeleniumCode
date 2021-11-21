public class MethodOverload {
    public static void main(String[] args) {
        MethodOverload obj = new MethodOverload();
        obj.addition(10, 20  );
        obj.addition(11f,23);
    }

    void addition(int a, int b) {
        System.out.println(a + b);
    }

    void addition(float c, int d) {
        System.out.println(c + d);
    }
}
