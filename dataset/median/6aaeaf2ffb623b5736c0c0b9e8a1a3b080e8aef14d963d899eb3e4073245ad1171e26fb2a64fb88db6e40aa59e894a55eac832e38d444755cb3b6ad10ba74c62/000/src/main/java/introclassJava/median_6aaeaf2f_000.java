package introclassJava;

public class median_6aaeaf2f_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        median_6aaeaf2f_000 mainClass = new median_6aaeaf2f_000 ();
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
        IntObj a = new IntObj (), b = new IntObj (), c = new IntObj (), median =
            new IntObj ();
        output +=
            (String.format ("Please enter 3 numbers separated by spaces > "));
        a.value = scanner.nextInt ();
        b.value = scanner.nextInt ();
        c.value = scanner.nextInt ();
        if (((a.value > b.value) && (a.value < c.value))
                || ((a.value < b.value) && (a.value > c.value))) {
            median.value = a.value;
        } else if (((b.value > a.value) && (c.value > b.value))
                   || ((b.value < a.value) && (b.value > c.value))) {
            median.value = b.value;
        } else {
            median.value = c.value;
        }
        output += (String.format ("%d is the median\n", median.value));
        if (true)
            return;;
    }
}
