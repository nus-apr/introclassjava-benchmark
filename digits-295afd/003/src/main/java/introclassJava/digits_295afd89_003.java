package introclassJava;

public class digits_295afd89_003 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_295afd89_003 mainClass = new digits_295afd89_003 ();
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
        IntObj rem = new IntObj ();
        output += (String.format ("\nEnter an integer > "));
        n.value = scanner.nextInt ();
        while (n.value >= 10) {
            rem.value = n.value % 10;
            n.value = n.value / 10;
            output += (String.format ("\n%d", rem.value));
        }
        rem.value = n.value % 10;
        output += (String.format ("\n%d", rem.value));
        output += (String.format ("\nThat's all, have a nice day!"));
        if (true)
            return;;
    }
}
