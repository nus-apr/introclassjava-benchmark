package introclassJava;

public class smallest_c9d718f3_003 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        smallest_c9d718f3_003 mainClass = new smallest_c9d718f3_003 ();
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
        DoubleObj num1 = new DoubleObj (), num2 = new DoubleObj (), num3 =
            new DoubleObj (), num4 = new DoubleObj ();
        output +=
            (String.format ("Please enter 4 numbers separated by spaces > "));
        num1.value = scanner.nextDouble ();
        num2.value = scanner.nextDouble ();
        num3.value = scanner.nextDouble ();
        num4.value = scanner.nextDouble ();
        if (num1.value < num2.value && num1.value < num3.value
                && num1.value < num4.value) {
            output += (String.format ("%.0f is the smallest\n", num1.value));
        }
        if (num2.value < num1.value && num2.value < num3.value
                && num2.value < num4.value) {
            output += (String.format ("%.0f is the smallest\n", num2.value));
        }
        if (num3.value < num1.value && num3.value < num2.value
                && num3.value < num4.value) {
            output += (String.format ("%.0f is the smallest\n", num3.value));
        }
        if (num4.value < num1.value && num4.value < num2.value
                && num4.value < num3.value) {
            output += (String.format ("%.0f is the smallest\n", num4.value));
        }
        if (true)
            return;;
    }
}
