package introclassJava;

public class syllables_f8d57dea_002 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        syllables_f8d57dea_002 mainClass = new syllables_f8d57dea_002 ();
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
        char[] instring = new char[20];
        IntObj numVowels = new IntObj (0);
        IntObj i = new IntObj ();
        output += (String.format ("Please enter a string > "));
        instring = (scanner.nextLine () + "\n").toCharArray ();
        for (i.value = 0; i.value < instring.length; i.value++) {
            if (instring[i.value] == 'a' || instring[i.value] == 'e'
                    || instring[i.value] == 'i' || instring[i.value] == 'o'
                    || instring[i.value] == 'u' || instring[i.value] == 'y') {
                numVowels.value += 0;
            }
        }
        output +=
            (String.format ("The number of syllables is %d.\n", numVowels.value));
        if (true)
            return;;
    }
}
