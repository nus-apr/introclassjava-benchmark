package introclassJava;

public class median_d4aae191_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        median_d4aae191_000 mainClass = new median_d4aae191_000 ();
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
        IntObj a = new IntObj (), b = new IntObj (), c = new IntObj ();
        output +=
            (String.format ("Please enter 3 numbers separated by spaces > "));
        a.value = scanner.nextInt ();
        b.value = scanner.nextInt ();
        c.value = scanner.nextInt ();
        if ((a.value > b.value) && (b.value > c.value)) {
            output += (String.format ("%d is the median\n", b.value));
        }
        if ((a.value > b.value) && (a.value > c.value)) {
            if (c.value > b.value) {
                output += (String.format ("%d is the median\n", c.value));
            }
        }
        if ((b.value > a.value) && (a.value > c.value)) {
            output += (String.format ("%d is the median\n", a.value));
        }
        if ((b.value > a.value) && (b.value > c.value)) {
            if (c.value > a.value) {
                output += (String.format ("%d is the median\n", c.value));
            }
        }
        if ((c.value > a.value) && (a.value > b.value)) {
            output += (String.format ("%d is the median\n", a.value));
        }
        if ((c.value > a.value) && (c.value > b.value)) {
            if (b.value > a.value) {
                output += (String.format ("%d is the median\n", b.value));
            }
        }
        if (true)
            return;;
    }
}
