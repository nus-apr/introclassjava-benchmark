package introclassJava;

public class smallest_769cd811_002 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        smallest_769cd811_002 mainClass = new smallest_769cd811_002 ();
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
        IntObj x = new IntObj (), y = new IntObj (), z = new IntObj (), t =
            new IntObj (), a = new IntObj ();
        output +=
            (String.format ("Please enter 4 numbers separated by spaces > "));
        x.value = scanner.nextInt ();
        y.value = scanner.nextInt ();
        z.value = scanner.nextInt ();
        t.value = scanner.nextInt ();
        if (x.value >= y.value) {
            a.value = y.value;
        } else {
            a.value = x.value;
        }
        if (y.value >= z.value) {
            a.value = z.value;
        }
        if (z.value >= t.value) {
            a.value = t.value;
        }
        output += (String.format ("%d is the smallest \n", a.value));
        if (true)
            return;;
    }
}
