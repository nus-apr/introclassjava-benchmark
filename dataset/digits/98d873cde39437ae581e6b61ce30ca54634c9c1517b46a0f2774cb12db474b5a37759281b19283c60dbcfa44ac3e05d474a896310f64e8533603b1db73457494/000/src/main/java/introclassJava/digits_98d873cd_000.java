package introclassJava;

public class digits_98d873cd_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_98d873cd_000 mainClass = new digits_98d873cd_000 ();
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
        IntObj digit = new IntObj (), n = new IntObj ();
        output += (String.format ("\nEnter and integer > "));
        digit.value = scanner.nextInt ();
        while (digit.value != 0) {
            n.value = digit.value % 10;
            digit.value = (digit.value - n.value) / 10;
            output += (String.format ("\n%d", n.value));
        }
        output += (String.format ("\nThat's all, have a nice day!\n"));
        if (true)
            return;;
    }
}
