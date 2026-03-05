import java.util.*;

public class S4P9 {

    public static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {

        List<Integer> common = new ArrayList<>(list1);
        common.retainAll(list2);

        return common;
    }

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);

        System.out.println(findCommonElements(list1, list2));
    }
}