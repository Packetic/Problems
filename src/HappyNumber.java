public class HappyNumber {
    public static void main(String[] args) {
        int x = 554234;
        while (!happy(x)) {
            x++;
        }
        System.out.println(x);
    }

    public static boolean happy(int x) {
        int sumLeft = (x / 100000 + x / 10000 % 10 + x / 1000 % 10);
        int sumRight = (x / 100 % 10 + x / 10 % 10 + x % 10);
        return sumLeft == sumRight;
    }
}
