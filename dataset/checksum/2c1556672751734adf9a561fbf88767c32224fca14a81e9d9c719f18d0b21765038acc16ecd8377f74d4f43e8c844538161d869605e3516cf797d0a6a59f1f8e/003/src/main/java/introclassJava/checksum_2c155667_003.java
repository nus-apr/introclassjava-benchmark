package introclassJava;

public class checksum_2c155667_003 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        checksum_2c155667_003 mainClass = new checksum_2c155667_003 ();
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
        CharObj character = new CharObj ();
        CharObj remainder = new CharObj ();
        IntObj sum = new IntObj ();
        output +=
            (String.format
             ("Enter an abitrarily long string, ending with carriage return > "));
        sum.value = 0;
        while (character.value != '\n') {
            try {
                character.value = scanner.findInLine (".").charAt (0);
            } catch (java.lang.NullPointerException e) {
                character.value = '\n';
            };
            sum.value = sum.value + (int) character.value;
        }
        remainder.value = (char) ((sum.value % 64) + 22);
        output += (String.format ("Check sum is %c\n", remainder.value));
        if (true)
            return;;
    }
}
