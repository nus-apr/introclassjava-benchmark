package introclassJava;

public class smallest_93f87bf2_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        smallest_93f87bf2_000 mainClass = new smallest_93f87bf2_000 ();
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
        IntObj first = new IntObj (), second = new IntObj (), third =
            new IntObj (), fourth = new IntObj ();
        output +=
            (String.format ("Please enter 4 numbers separated by spaces > "));
        first.value = scanner.nextInt ();
        second.value = scanner.nextInt ();
        third.value = scanner.nextInt ();
        fourth.value = scanner.nextInt ();
        if (first.value < second.value && first.value < third.value
                && first.value < fourth.value) {
            output += (String.format ("%d is the smallest \n ", first.value));
        } else if (second.value < first.value && second.value < third.value
                   && second.value < fourth.value) {
            output += (String.format ("%d is the smallest \n ", second.value));
        } else if (third.value < first.value && third.value < second.value
                   && third.value < fourth.value) {
            output += (String.format ("%d is the smallest \n ", third.value));
        } else if (fourth.value < first.value && fourth.value < second.value
                   && fourth.value < third.value) {
            output += (String.format ("%d is the smallest \n ", fourth.value));
        }
        if (true)
            return;;
    }
}
