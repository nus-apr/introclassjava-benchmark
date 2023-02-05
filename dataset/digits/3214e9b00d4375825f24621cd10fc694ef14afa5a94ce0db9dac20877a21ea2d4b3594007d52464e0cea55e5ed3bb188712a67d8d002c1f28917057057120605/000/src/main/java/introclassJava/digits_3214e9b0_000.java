package introclassJava;

public class digits_3214e9b0_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_3214e9b0_000 mainClass = new digits_3214e9b0_000 ();
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
        IntObj userint = new IntObj (), remainder = new IntObj ();
        output += (String.format ("Enter an integer > "));
        userint.value = scanner.nextInt ();
        output += (String.format ("\n"));
        while (userint.value != 0) {
            remainder.value = userint.value % 10;
            output += (String.format ("%d\n", remainder.value));
            userint.value = (userint.value - remainder.value) / 10;
        }
        output += (String.format ("That's all, have a nice day!\n"));
        if (true)
            return;;
    }
}
