package introclassJava;

public class smallest_95362737_009 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        smallest_95362737_009 mainClass = new smallest_95362737_009 ();
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
            new IntObj ();
        output +=
            (String.format ("Please enter 4 numbers seperated by spaces > "));
        a.value = scanner.nextInt ();
        b.value = scanner.nextInt ();
        c.value = scanner.nextInt ();
        d.value = scanner.nextInt ();
        if (a.value > b.value) {
            if (b.value > c.value) {
                if (c.value > d.value) {
                    output += (String.format ("%d is the smallest\n", d.value));
                } else {
                    output += (String.format ("%d is the smallest\n", c.value));
                }
            } else if (b.value > d.value) {
                output += (String.format ("%d is the smallest\n", d.value));
            } else {
                output += (String.format ("%d is the smallesst\n", b.value));
            }
        } else if (a.value > c.value) {
            if (c.value > d.value) {
                output += (String.format ("%d is the smallest\n", d.value));
            } else {
                output += (String.format ("%d is the smallest\n", c.value));
            }
        } else if (a.value > d.value) {
            output += (String.format ("%d is the smallest\n", d.value));
        } else {
            output += (String.format ("%d is the smallest\n", a.value));
        }
        if (true)
            return;;
    }
}
