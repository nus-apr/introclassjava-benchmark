package introclassJava;

public class smallest_90a14c1a_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        smallest_90a14c1a_000 mainClass = new smallest_90a14c1a_000 ();
        String output;
        if (args.length > 0) {
            mainClass.scanner = new java.util.Scanner (args[0]);
        } else {
            mainClass.scanner = new java.util.Scanner (System.in);
        }
        mainClass.exec ();
        System.out.println (mainClass.output);
    }

    public void exec () throws Exception {
        IntObj one = new IntObj (), two = new IntObj (), three =
            new IntObj (), four = new IntObj ();
        output +=
            (String.format ("Please enter 4 numbers separated by spaces > "));
        one.value = scanner.nextInt ();
        two.value = scanner.nextInt ();
        three.value = scanner.nextInt ();
        four.value = scanner.nextInt ();
        if ((one.value < two.value) && (two.value < three.value)
                && (three.value < four.value)) {
            output += (String.format ("%d is the smallest\n", one.value));
        }
        if ((two.value < one.value) && (one.value < three.value)
                && (three.value < four.value)) {
            output += (String.format ("%d is the smallest\n", two.value));
        }
        if ((three.value < one.value) && (one.value < two.value)
                && (two.value < four.value)) {
            output += (String.format ("%d is the smallest\n", three.value));
        }
        if ((four.value < one.value) && (one.value < two.value)
                && (two.value < three.value)) {
            output += (String.format ("%d is the smallest\n", four.value));
        }
        if (true)
            return;;
    }
}
