package introclassJava;

public class digits_a0e3fdae_003 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_a0e3fdae_003 mainClass = new digits_a0e3fdae_003 ();
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
        IntObj integer = new IntObj ();
        IntObj mod = new IntObj ();
        output += (String.format ("\n"));
        output += (String.format ("Enter an integer > "));
        integer.value = scanner.nextInt ();
        output += (String.format ("\n"));
        while (integer.value != 0) {
            mod.value = integer.value % 10;
            output += (String.format ("%d\n", mod.value));
            integer.value /= 10;
        }
        output += (String.format ("That's all, have a nice day!\n"));
        if (true)
            return;;
    }
}
