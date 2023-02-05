package introclassJava;

public class digits_0cea42f9_002 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_0cea42f9_002 mainClass = new digits_0cea42f9_002 ();
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
        LongObj n = new LongObj ();
        output += (String.format ("Enter an integer > "));
        n.value = scanner.nextLong ();
        while (n.value != 0) {
            output += (String.format ("\n%d", n.value % 10));
            n.value /= 10;
        }
        output += (String.format ("\nThat's all, have a nice day!\n"));
        if (true)
            return;;
    }
}
