import java.util.*;

public class StackNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(999);
        numbers.add(9);
        numbers.add(99);
        numbers.add(9999);
        numbers.add(99);
        numbers.add(999);

        System.out.println(numbers);

        Collections.sort(numbers);

        System.out.println(numbers);

        Set<Integer> dig = new TreeSet<>(Comparator.reverseOrder());
        dig.addAll(numbers);

        System.out.println(dig);
    }
}