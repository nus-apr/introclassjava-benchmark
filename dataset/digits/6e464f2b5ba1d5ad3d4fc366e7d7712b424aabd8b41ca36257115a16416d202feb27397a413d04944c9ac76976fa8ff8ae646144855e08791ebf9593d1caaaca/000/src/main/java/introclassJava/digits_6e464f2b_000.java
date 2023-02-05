package introclassJava;

public class digits_6e464f2b_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_6e464f2b_000 mainClass = new digits_6e464f2b_000 ();
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
        IntObj n = new IntObj (), i = new IntObj (), j = new IntObj ();
        output += (String.format ("\nEnter an integer > "));
        n.value = scanner.nextInt ();
        output += (String.format ("\n"));
        i.value = n.value;
        while (i.value < 0) {
            j.value = i.value % -10;
            output += (String.format ("%d\n", -j.value));
            i.value = i.value / 10;
            if (i.value > -10) {
                j.value = i.value % -10;
                output += (String.format ("%d\n", j.value));
                break;
            }
        }
        while (i.value > 0) {
            j.value = i.value % 10;
            output += (String.format ("%d\n", j.value));
            i.value = i.value / 10;
        }
        output += (String.format ("That's all, have a nice day!\n"));
        if (true)
            return;;
    }
}
