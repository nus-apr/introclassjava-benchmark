package introclassJava;

public class digits_d43d3207_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_d43d3207_000 mainClass = new digits_d43d3207_000 ();
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
        IntObj input = new IntObj (), digits = new IntObj ();
        output += (String.format ("Enter an integer > "));
        input.value = scanner.nextInt ();
        while (input.value / 10 != 0) {
            digits.value = input.value % 10;
            output += (String.format ("\n%d", digits.value));
            input.value = input.value / 10;
        }
        output +=
            (String.format ("\n%d\nThat's all, have a nice day!", input.value));
        if (true)
            return;;
    }
}
