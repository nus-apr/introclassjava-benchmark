package introclassJava;

public class digits_07045530_002 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_07045530_002 mainClass = new digits_07045530_002 ();
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
        IntObj n = new IntObj (), r = new IntObj (), nn = new IntObj ();
        output += (String.format ("\nEnter an integer > "));
        n.value = scanner.nextInt ();
        while (n.value != 0) {
            if (n.value < 0) {
                n.value = -n.value;
                while (n.value != 0) {
                    r.value = n.value % 10;
                    nn.value = n.value / 10;
                    if (n.value < 10) {
                        output += (String.format ("\n-%d", r.value));
                    } else if (n.value >= 10) {
                        output += (String.format ("\n%d", r.value));
                    }
                    n.value = nn.value;
                }
            } else {
                r.value = n.value % 10;
                nn.value = n.value / 10;
                n.value = nn.value;
                output += (String.format ("\n%d", r.value));
            }
        }
        output += (String.format ("\nThat's all, have a nice day!\n"));
        if (true)
            return;;
    }
}
