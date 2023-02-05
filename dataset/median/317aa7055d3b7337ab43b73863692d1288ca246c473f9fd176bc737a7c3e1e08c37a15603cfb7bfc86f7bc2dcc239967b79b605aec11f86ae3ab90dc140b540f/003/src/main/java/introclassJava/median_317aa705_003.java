package introclassJava;

public class median_317aa705_003 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        median_317aa705_003 mainClass = new median_317aa705_003 ();
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
        if ((b.value > a.value && b.value < c.value)
                || (b.value < a.value && b.value > c.value)) {
            output += (String.format ("%d is the median", b.value));
        }
        if ((c.value > a.value && c.value < b.value)
                || (c.value < a.value && c.value > b.value)) {
            output += (String.format ("%d is the median", c.value));
        }
        if ((a.value > b.value && a.value < c.value)
                || (a.value < b.value && a.value > c.value)) {
            output += (String.format ("%d is the median", a.value));
        }
        if (true)
            return;;
    }
}
