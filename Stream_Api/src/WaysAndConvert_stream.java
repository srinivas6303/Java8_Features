import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaysAndConvert_stream {
    public static void main(String[] args) {

        //Array to Stream
        System.out.println("Array to Stream");
        int arr[]={1,2,3,4,6};
        System.out.println("Array:"+Arrays.toString(arr));
        Stream<Integer> integerStream=Arrays.stream(arr).boxed();
        integerStream.forEach(x->System.out.print(x+","));
        System.out.println();
        System.out.println("-------------------------");

        //List to Stream
        System.out.println("List to Stream");
        List<Integer> list=Arrays.asList(1,2,3,4,5);
        System.out.println("list:"+list);

        Stream<Integer> s=list.stream();
        System.out.print("stream:");
        s.forEach(n->System.out.print(n+","));
        System.out.println();
        System.out.println("-------------------------");



        //list ->stream -> list
        System.out.println("list ->stream -> list");
        List<Integer> l=Arrays.asList(1,2,3,4,5);
        System.out.println("list:"+l);

        List<Integer> newlist=l.stream().map(x->x+10).collect(Collectors.toList());
        System.out.println("newlist:"+newlist);
        System.out.println("-------------------------");


        //Individual stream (Stream.of)
        System.out.println("Individual stream (Stream.of)");
        Stream<Integer> stre=Stream.of(1,2,3,5,6);
        stre.forEach(n->System.out.print(n+","));
        System.out.println();
        System.out.println("-------------------------");

        //Individual stream (Stream.iterate)
        System.out.println("Individual stream (Stream.iterate)");
        Stream<Integer> st=Stream.iterate(1,n->n+1).limit(10);
        st.forEach(n->System.out.print(n+","));
        System.out.println();
        System.out.println("-------------------------");

        //Individual stream (Stream.generate)
        System.out.println("Individual stream (Stream.generate)");
        Stream<Integer> ss=Stream.generate(()->10).limit(5);
        ss.forEach(n->System.out.print(n+","));
        System.out.println();
        System.out.println("-------------------------");




    }
}
