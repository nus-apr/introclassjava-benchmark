package introclassJava;

public class median_90834803_010 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        median_90834803_010 mainClass = new median_90834803_010 ();
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
        if ((b.value >= a.value && a.value >= c.value)
                || (c.value <= a.value && a.value <= b.value)) {
            output += (String.format ("%d is the median\n", a.value));
        } else if ((a.value >= b.value && b.value >= c.value)
                   || (a.value <= b.value && b.value <= c.value)) {
            output += (String.format ("%d is the median\n", b.value));
        } else if ((a.value >= c.value && c.value >= b.value)
                   || (a.value <= c.value && c.value <= b.value)) {
            output += (String.format ("%d is the median\n", c.value));
        } else {
            if (true)
                return;;
        }
        if (true)
            return;;
    }
}
