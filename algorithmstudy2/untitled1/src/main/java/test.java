import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println("numbers: " + numbers.toString());

        numbers.removeIf(n -> (n % 3 == 0));
        System.out.println("numbers(after remove): " + numbers.toString());

    }
}
