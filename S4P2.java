import java.util.*;

public class S4P2 {
    public static void main(String[] args) {

        List<Integer> number = new ArrayList<Integer>();

        number.add(1);
        number.add(2);
        number.add(3);
        number.add(2);
        number.add(4);
        number.add(2);
        number.add(5);

        int target = 2;

        number.removeIf(n -> n == target);

        System.out.println(number);
    }
}