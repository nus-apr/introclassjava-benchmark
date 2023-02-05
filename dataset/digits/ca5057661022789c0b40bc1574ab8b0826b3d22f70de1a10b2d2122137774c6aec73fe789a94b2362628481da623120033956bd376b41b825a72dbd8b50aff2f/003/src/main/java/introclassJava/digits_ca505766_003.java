package introclassJava;

public class digits_ca505766_003 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_ca505766_003 mainClass = new digits_ca505766_003 ();
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
        IntObj in = new IntObj ();
        output += (String.format ("Enter an integer > "));
        in.value = scanner.nextInt ();
        if (in.value < 0) {
            in.value = in.value * (-1);
        }
        while (in.value / 10 != 0) {
            output += (String.format ("%d\n", in.value % 10));
            in.value = in.value / 10;
        }
        output += (String.format ("%d\n", in.value));
        output += (String.format ("That's all, have a nice day!"));
        if (true)
            return;;
    }
}
