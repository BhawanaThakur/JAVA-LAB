import java.util.*;

public class S4P7 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 4));

        System.out.println("Original List: " + list);

        Collections.sort(list);
        System.out.println("Ascending Order: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Order: " + list);
    }
}