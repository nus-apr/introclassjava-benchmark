package introclassJava;

public class digits_295afd89_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_295afd89_000 mainClass = new digits_295afd89_000 ();
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
        IntObj modRes = new IntObj ();
        IntObj mod = new IntObj (10);
        output += (String.format ("\nEnter an integer > "));
        n.value = scanner.nextInt ();
        while (n.value != 0) {
            modRes.value = n.value % mod.value;
            n.value = n.value / mod.value;
            if (modRes.value != 0) {
                output += (String.format ("\n%d", modRes.value));
            } else {
                output += (String.format ("%d", n.value));
            }
        }
        output += (String.format ("\nThat's all, have a nice day!\n"));
        if (true)
            return;;
    }
}
