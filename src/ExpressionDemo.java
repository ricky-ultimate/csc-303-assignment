public class ExpressionDemo {
    public static void main(String[] args) {
        int x = 10;
        int y;

        // i. Y = x++;
        y = x++;
        System.out.println("i. Y = x++: y = " + y + ", x = " + x);

        // ii. Y = ++x;
        y = ++x;
        System.out.println("ii. Y = ++x: y = " + y + ", x = " + x);

        // iii. Y += x;
        y = 20; // Reset y to 20
        y += x;
        System.out.println("iii. Y += x: y = " + y + ", x = " + x);
    }
}