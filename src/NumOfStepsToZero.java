public class NumOfStepsToZero {
    public static void main(String[] args) {
        int x = 123;
        int ans = 0;
        while (x > 0) {
            if (x % 2 == 0) x = x / 2;
            else x -= 1;
            ans += 1;
        }
        System.out.println(ans);
    }
}
