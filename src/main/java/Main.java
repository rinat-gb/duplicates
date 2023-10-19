import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static List<Integer> findDuplicates(List<Integer> list) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        return list
                .stream()
                .filter(el -> !uniqueNumbers.add(el))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 6);
        System.out.println(findDuplicates(list));
    }
}
