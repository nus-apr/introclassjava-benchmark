package introclassJava;

public class digits_bfad6d21_005 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_bfad6d21_005 mainClass = new digits_bfad6d21_005 ();
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
        IntObj num = new IntObj (), digit = new IntObj ();
        output += (String.format ("\nEnter an integer > "));
        num.value = scanner.nextInt ();
        digit.value = num.value % 10;
        num.value = (int) (num.value);
        while (num.value != 0) {
            if ((digit.value < 0) && ((num.value / 10) != 0)) {
                digit.value = digit.value * -1;
            }
            output += (String.format ("%d\n", digit.value));
            num.value = num.value / 10;
            digit.value = num.value % 10;
        }
        output += (String.format ("That's all, have a nice day!\n"));
        if (true)
            return;;
    }
}
