package introclassJava;

public class checksum_36d8008b_003 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        checksum_36d8008b_003 mainClass = new checksum_36d8008b_003 ();
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
        IntObj sum = new IntObj ();
        CharObj next = new CharObj ();
        sum.value = 0;
        output +=
            (String.format
             ("Enter an abitrarily long string, ending with carriage return > "));
        while (next.value != '\n') {
            try {
                next.value = scanner.findInLine (".").charAt (0);
            } catch (java.lang.NullPointerException e) {
                next.value = '\n';
            };
            sum.value = sum.value + next.value;
        }
        sum.value = sum.value % 64 + 22;
        output += (String.format ("Check sum is %c\n", sum.value));
        if (true)
            return;;
    }
}
