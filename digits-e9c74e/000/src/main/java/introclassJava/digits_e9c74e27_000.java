package introclassJava;

public class digits_e9c74e27_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_e9c74e27_000 mainClass = new digits_e9c74e27_000 ();
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
        if (num.value < 0) {
            while (num.value != 0) {
                digit.value = num.value % 10;
                if (num.value > (-10)) {
                    output += (String.format ("\n%d", digit.value));
                } else {
                    output += (String.format ("\n%d", -digit.value));
                }
                num.value = num.value / 10;
            }
        } else {
            while (num.value != 0) {
                digit.value = num.value % 10;
                output += (String.format ("\n%d", digit.value));
                num.value = num.value / 10;
            }
        }
        output += (String.format ("\nThat's all, have a nice day!\n"));
        if (true)
            return;;
    }
}
