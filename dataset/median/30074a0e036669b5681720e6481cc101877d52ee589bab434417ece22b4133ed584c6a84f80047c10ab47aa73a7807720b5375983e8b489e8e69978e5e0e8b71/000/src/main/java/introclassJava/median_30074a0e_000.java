package introclassJava;

public class median_30074a0e_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        median_30074a0e_000 mainClass = new median_30074a0e_000 ();
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
        IntObj a = new IntObj ();
        IntObj b = new IntObj ();
        IntObj c = new IntObj ();
        output +=
            (String.format ("Please enter 3 numbers seperated by spaces > "));
        a.value = scanner.nextInt ();
        b.value = scanner.nextInt ();
        c.value = scanner.nextInt ();
        if ((a.value < b.value && b.value < c.value)
                || (b.value < a.value && c.value < b.value)) {
            output += (String.format ("%d is the median\n", b.value));
        }
        if ((b.value < a.value && a.value < c.value)
                || (a.value < b.value && c.value < a.value)) {
            output += (String.format ("%d is the median\n", a.value));
        }
        if ((a.value < c.value && c.value < b.value)
                || (b.value < c.value && c.value < a.value)) {
            output += (String.format ("%d is the median\n", c.value));
        }
        if (true)
            return;;
    }
}
