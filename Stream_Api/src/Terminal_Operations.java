import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Terminal_Operations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 3, 2, 5, 4);

        // forEach
        System.out.println("To print each element in stream (forEach):");
        list.stream().forEach(i -> System.out.println(i));

        // count()
        System.out.println("Total element count (count):");
        long count = list.stream().count();
        System.out.println(count);

        // min()
        System.out.println("Minimum element in stream (min):");
        Optional<Integer> min = list.stream().min(Comparator.naturalOrder());
        if (min.isPresent()) {
            System.out.println(min.get());
        } else {
            System.out.println("Stream is empty, no minimum element found.");
        }

        // max()
        System.out.println("Maximum element in stream (max):");
        Optional<Integer> max = list.stream().max(Comparator.naturalOrder());
        if (max.isPresent()) {
            System.out.println("Maximum element: " + max.get());
        } else {
            System.out.println("Stream is empty, no maximum element found.");
        }

        // collect()
        System.out.println("Collect elements to a List (collect):");
        List<Integer> collectedList = list.stream().collect(Collectors.toList());
        if (collectedList.size() > 0) {
            System.out.println(collectedList);
        } else {
            System.out.println("No elements collected.");
        }

        // reduce()
        System.out.println("Sum of elements (reduce):");
        int sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        // anyMatch()
        System.out.println("Any element greater than 4? (anyMatch):");
        boolean anyMatch = list.stream().anyMatch(i -> i > 4);
        if (anyMatch) {
            System.out.println("Yes, there is at least one element greater than 4.");
        } else {
            System.out.println("No element is greater than 4.");
        }

        // allMatch()
        System.out.println("All elements greater than 1? (allMatch):");
        boolean allMatch = list.stream().allMatch(i -> i > 1);
        if (allMatch) {
            System.out.println("Yes, all elements are greater than 1.");
        } else {
            System.out.println("Not all elements are greater than 1.");
        }

        // noneMatch()
        System.out.println("No element greater than 10? (noneMatch):");
        boolean noneMatch = list.stream().noneMatch(i -> i > 10);
        if (noneMatch) {
            System.out.println("Yes, no element is greater than 10.");
        } else {
            System.out.println("There is at least one element greater than 10.");
        }

        // findFirst()
        System.out.println("First element in stream (findFirst):");
        Optional<Integer> firstElement = list.stream().findFirst();
        if (firstElement.isPresent()) {
            System.out.println(firstElement.get());
        } else {
            System.out.println("Stream is empty.");
        }

        // findAny()
        System.out.println("Any element in stream (findAny):");
        Optional<Integer> anyElement = list.stream().findAny();
        if (anyElement.isPresent()) {
            System.out.println(anyElement.get());
        } else {
            System.out.println("Stream is empty.");
        }
    }
}
