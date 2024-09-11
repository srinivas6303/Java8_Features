import java.util.Arrays;
import java.util.List;

public class Intermediate_Operations {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,5,4,3,2);
        System.out.println("List : "+list);

        // filter()
        System.out.println("No greater than 2:(filter)");
        list.stream().filter(i -> i > 2).forEach(x -> System.out.println(x));

        //or
        //Stream<Integer> stream = list.stream().filter(i -> i > 2);
        //stream.forEach(x->System.out.println(x));


        //map()
        System.out.println("No added with 10:(map)");
        list.stream().map(x->x+10).forEach(x->System.out.println(x));

        //limit()
        System.out.println("only two no's:(limit)");
        list.stream().limit(2).forEach(x->System.out.println(x));

        //distinct()
        System.out.println("only unique elements:(distinct)");
        list.stream().distinct().forEach(x->System.out.println(x));


        //skip()
        System.out.println("skips two elements :(skip)");
        list.stream().skip(2).forEach(x->System.out.println(x));

        //sorted
        System.out.println("sorted stream :(sorted)");
        list.stream().sorted().forEach(x->System.out.println(x));



        // Intermediate operations on a single stream
        System.out.println("intermidate operation on a singe stream");
        list.stream()
                .filter(i -> i > 2)        // Filter: Keep numbers greater than 2
                .map(i -> i * 10)          // Map: Multiply remaining numbers by 10
                .skip(1)                   // Skip: Skip the first element
                .distinct()                // Distinct: Remove duplicates
                .sorted()                  // unique elements in sorted order
                .limit(3)                 // Limit: Keep only the first 3 elements
        .forEach(x->System.out.println(x));


    }
}
