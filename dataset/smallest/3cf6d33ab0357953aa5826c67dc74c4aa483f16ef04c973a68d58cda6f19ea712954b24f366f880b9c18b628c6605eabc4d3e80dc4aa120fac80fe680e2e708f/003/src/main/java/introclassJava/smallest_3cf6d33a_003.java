package introclassJava;

public class smallest_3cf6d33a_003 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        smallest_3cf6d33a_003 mainClass = new smallest_3cf6d33a_003 ();
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
        DoubleObj a = new DoubleObj (), b = new DoubleObj (), c =
            new DoubleObj (), d = new DoubleObj ();
        output +=
            (String.format ("Please enter 4 numbers separated by spaces > "));
        a.value = scanner.nextDouble ();
        b.value = scanner.nextDouble ();
        c.value = scanner.nextDouble ();
        d.value = scanner.nextDouble ();
        if (a.value < b.value && a.value < c.value && a.value < d.value) {
            output += (String.format ("%.0f is the smallest\n", a.value));
        } else if (b.value < a.value && b.value < c.value && b.value < d.value) {
            output += (String.format ("%.0f is the smallest\n", b.value));
        } else if (c.value < a.value && c.value < b.value && c.value < d.value) {
            output += (String.format ("%.0f is the smallest\n", c.value));
        } else if (d.value < a.value && d.value < b.value && d.value < c.value) {
            output += (String.format ("%.0f is the smallest\n", d.value));
        }
        if (true)
            return;;
    }
}
