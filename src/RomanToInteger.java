import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = 0;
        while (s.contains("IV")) {
            ans += 4;
            s = s.replaceFirst("IV", " ");
        }
        while (s.contains("IX")) {
            ans += 9;
            s = s.replaceFirst("IX", " ");
        }
        while (s.contains("XL")) {
            ans += 40;
            s = s.replaceFirst("XL", " ");
        }
        while (s.contains("XC")) {
            ans += 90;
            s = s.replaceFirst("XC", " ");
        }
        while (s.contains("CD")) {
            ans += 400;
            s = s.replaceFirst("CD", " ");
        }
        while (s.contains("CM")) {
            ans += 900;
            s = s.replaceFirst("CM", " ");
        }
        while (s.contains("M")) {
            ans += 1000;
            s = s.replaceFirst("M", " ");
        }
        while (s.contains("D")) {
            ans += 500;
            s = s.replaceFirst("D", " ");
        }
        while (s.contains("C")) {
            ans += 100;
            s = s.replaceFirst("C", " ");
        }
        while (s.contains("L")) {
            ans += 50;
            s = s.replaceFirst("L", " ");
        }
        while (s.contains("X")) {
            ans += 10;
            s = s.replaceFirst("X", " ");
        }
        while (s.contains("V")) {
            ans += 5;
            s = s.replaceFirst("V", " ");
        }
        while (s.contains("I")) {
            ans += 1;
            s = s.replaceFirst("I", " ");
        }
        System.out.println(ans);
    }
}