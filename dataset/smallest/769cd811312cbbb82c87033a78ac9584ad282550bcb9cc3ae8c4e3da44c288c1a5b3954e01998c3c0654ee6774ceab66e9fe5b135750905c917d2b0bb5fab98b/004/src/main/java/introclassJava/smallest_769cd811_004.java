package introclassJava;

public class smallest_769cd811_004 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        smallest_769cd811_004 mainClass = new smallest_769cd811_004 ();
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
        IntObj a = new IntObj (), b = new IntObj (), c = new IntObj (), d =
            new IntObj (), x = new IntObj ();
        output +=
            (String.format ("Please enter 4 numbers separated by spaces > "));
        a.value = scanner.nextInt ();
        b.value = scanner.nextInt ();
        c.value = scanner.nextInt ();
        d.value = scanner.nextInt ();
        if (a.value >= b.value) {
            x.value = b.value;
        } else {
            x.value = a.value;
        }
        if (b.value >= c.value) {
            x.value = c.value;
        }
        if (c.value >= d.value) {
            x.value = d.value;
        }
        output += (String.format ("%d is the smallest\n", a.value));
        if (true)
            return;;
    }
}
