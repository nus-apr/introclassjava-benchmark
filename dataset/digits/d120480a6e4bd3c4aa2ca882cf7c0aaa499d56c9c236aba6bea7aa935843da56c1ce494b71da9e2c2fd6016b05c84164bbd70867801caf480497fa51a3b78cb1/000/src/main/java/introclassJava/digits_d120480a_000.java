package introclassJava;

public class digits_d120480a_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_d120480a_000 mainClass = new digits_d120480a_000 ();
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
        IntObj n = new IntObj (), digit = new IntObj ();
        output += (String.format ("Enter an integer > "));
        n.value = scanner.nextInt ();
        while (n.value != 0) {
            digit.value = n.value % 10;
            n.value = n.value / 10;
            if ((digit.value < 0) && (n.value == 0)) {
                output += (String.format ("%d\n", digit.value));
            } else {
                output += (String.format ("%d\n", Math.abs (digit.value)));
            }
        }
        if (true)
            return;;
    }
}
