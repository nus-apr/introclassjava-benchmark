package introclassJava;

public class smallest_90834803_005 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        smallest_90834803_005 mainClass = new smallest_90834803_005 ();
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
            new IntObj (), sm = new IntObj ();
        output +=
            (String.format ("Please enter 4 numbers separated by spaces > "));
        a.value = scanner.nextInt ();
        b.value = scanner.nextInt ();
        c.value = scanner.nextInt ();
        d.value = scanner.nextInt ();
        if (a.value < b.value && a.value < c.value && a.value < d.value) {
            output += (String.format ("%d is the smallest\n", a.value));
        } else if (b.value < a.value && b.value < c.value && b.value < d.value) {
            output += (String.format ("%d is the smallest\n", b.value));
        } else if (c.value < a.value && c.value < b.value && c.value < d.value) {
            output += (String.format ("%d is the smallest\n", c.value));
        } else if (d.value < a.value && d.value < b.value && d.value < c.value) {
            output += (String.format ("%d is the smallest\n", d.value));
        } else {
            output += (String.format ("They have to be different numbers"));
        }
        if (true)
            return;;
    }
}
