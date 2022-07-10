import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 15;
        List<String> li = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String s = "";
            if (i % 3 == 0 && i % 5 != 0) s = "Fizz";
            if (i % 3 != 0 && i % 5 == 0) s = "Buzz";
            if (i % 3 == 0 && i % 5 == 0) s = "FizzBuzz";
            if (i % 3 != 0 && i % 5 != 0) s = String.valueOf(i);
            li.add(s);
        }
        System.out.println(li);
    }
}
