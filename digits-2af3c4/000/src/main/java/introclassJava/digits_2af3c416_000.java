package introclassJava;

public class digits_2af3c416_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_2af3c416_000 mainClass = new digits_2af3c416_000 ();
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
        output += (String.format ("Enter an integer > "));
        num.value = scanner.nextInt ();
        output += (String.format ("\n"));
        while (num.value > 0) {
            digit.value = num.value % 10;
            output += (String.format ("%d\n", digit.value));
            num.value = num.value / 10;
        }
        output += (String.format ("That's all, have a nice day!\n"));
        if (true)
            return;;
    }
}
