package introclassJava;

public class syllables_b6fd408d_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        syllables_b6fd408d_000 mainClass = new syllables_b6fd408d_000 ();
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
        char[] word = new char[40];
        IntObj i = new IntObj (0);
        IntObj count = new IntObj (0);
        output += (String.format ("Please enter a string > "));
        word = (scanner.nextLine () + "\n").toCharArray ();
        while (i.value < word.length) {
            if (word[i.value] == 'a' || word[i.value] == 'o'
                    || word[i.value] == 'e' || word[i.value] == 'u'
                    || word[i.value] == 'y') {
                count.value++;
            }
            i.value++;
        }
        output +=
            (String.format ("The number of syllables is %d.\n", count.value));
        if (true)
            return;;
    }
}
