package introclassJava;

public class digits_90a14c1a_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_90a14c1a_000 mainClass = new digits_90a14c1a_000 ();
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
        IntObj value = new IntObj (), digit = new IntObj ();
        output += (String.format ("\nEnter an integer > "));
        value.value = scanner.nextInt ();
        output += (String.format ("\n"));
        if (value.value >= 0) {
            while (value.value != 0) {
                digit.value = value.value % 10;
                value.value = value.value / 10;
                output += (String.format ("%d\n", digit.value));
            }
        }
        if (value.value < 0) {
            while (value.value < -10) {
                digit.value = Math.abs (value.value % 10);
                value.value = value.value / 10;
                output += (String.format ("%d\n", digit.value));
            }
            digit.value = value.value % 10;
            output += (String.format ("%d\n", digit.value));
        }
        output += (String.format ("That's all, have a nice day!\n"));
        if (true)
            return;;
    }
}
