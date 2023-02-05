package introclassJava;

public class digits_88394fc0_004 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_88394fc0_004 mainClass = new digits_88394fc0_004 ();
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
        IntObj n = new IntObj ();
        IntObj digits = new IntObj ();
        output += (String.format ("\nEnter an integer > "));
        n.value = scanner.nextInt ();
        output += (String.format ("\n"));
        digits.value = 1;
        if (n.value == 0) {
            output += (String.format ("0\n"));
        }
        while (n.value > 0) {
            digits.value = n.value % 10;
            output += (String.format ("%d\n", digits.value));
            n.value = (n.value - digits.value) / 10;
        }
        output += (String.format ("That's all, have a nice day!\n"));
        if (true)
            return;;
    }
}
