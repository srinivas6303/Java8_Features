//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* lambda expression =  feature for Java 8 and above
         * 						also known as an anonymous method
         * 						a shorter way to write anonymous classes with only one method
         *
         *						need to use a functional interface or use a pre-defined functional interface
         *						they contain only one abstract method
         *						ex. ActionListener, Runnable, (user-defined)
         *
         *						A Lambda expression can be used in any place where a functional interface is required
         *						How to use a lambda expression:
         *						(arguments) -> {statement/s}
         */
        String name="srinu";
        char symbol='!';

        myinterface in = (x,y) ->
        {
            System.out.println("hello"+" "+x+y);
        };

        in.messege(name,symbol);
    }
}