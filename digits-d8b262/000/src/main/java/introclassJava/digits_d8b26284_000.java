package introclassJava;

public class digits_d8b26284_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_d8b26284_000 mainClass = new digits_d8b26284_000 ();
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
        IntObj num = new IntObj ();
        output += (String.format ("\nEnter an integer > "));
        num.value = scanner.nextInt ();
        do {
            output += (String.format ("\n%d", num.value % 10));
            num.value /= 10;
        } while (num.value > 0);
        output += (String.format ("\nThat's all, have a nice day!\n"));
        if (true)
            return;;
    }
}
