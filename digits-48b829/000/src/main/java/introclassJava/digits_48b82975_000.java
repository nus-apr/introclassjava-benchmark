package introclassJava;

public class digits_48b82975_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_48b82975_000 mainClass = new digits_48b82975_000 ();
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
        output += (String.format ("Enter an integer > "));
        num.value = scanner.nextInt ();
        if (num.value < 0) {
            num.value = (Math.abs (num.value));
            while (num.value > 10) {
                output += (String.format ("%d\n", num.value % 10));
                num.value /= 10;
            }
            num.value = num.value - 2 * num.value;
            output += (String.format ("%d\n", num.value));
        } else {
            while (num.value != 0) {
                output += (String.format ("%d\n", num.value % 10));
                num.value /= 10;
            }
        }
        output += (String.format ("That's all, have a nice day!\n"));
        if (true)
            return;;
    }
}
