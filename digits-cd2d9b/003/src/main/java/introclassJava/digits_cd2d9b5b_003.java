package introclassJava;

public class digits_cd2d9b5b_003 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_cd2d9b5b_003 mainClass = new digits_cd2d9b5b_003 ();
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
        output += (String.format ("\nEnter an integer > "));
        n.value = scanner.nextInt ();
        digit.value = 0;
        while (n.value != 0) {
            digit.value = n.value % 10;
            output += (String.format ("\n%d", digit.value));
            n.value = (n.value - digit.value) / 10;
        }
        output += (String.format ("\nThat's all, have a nice day!"));
        if (true)
            return;;
    }
}
