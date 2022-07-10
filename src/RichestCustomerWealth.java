import java.util.Arrays;
import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,5}, {7,3}, {3,5}};
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int x = Arrays.stream(accounts[i]).sum();
            max = Integer.max(max, x);
        }
        System.out.println(max);
    }
}
