package introclassJava;

public class syllables_38eb99ca_004 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        syllables_38eb99ca_004 mainClass = new syllables_38eb99ca_004 ();
        String output;
        if (args.length > 0) {
            mainClass.scanner = new java.util.Scanner (args[0]);
        } else {
            mainClass.scanner = new java.util.Scanner (System.in);
        }
        mainClass.exec ();
        System.out.println (mainClass.output);
    }

    public static int sizeA = 22;
    public void exec () throws Exception {
        char[] string = new char[sizeA];
        IntObj i = new IntObj (), length = new IntObj ();
        IntObj count = new IntObj (0);
        output += (String.format ("Please enter a string > "));
        string = (scanner.nextLine () + "\n").toCharArray ();
        length.value = string.length;
        for (i.value = 0; i.value < length.value; i.value++) {
            if (string[i.value] == 'a' || string[i.value] == 'e'
                    || string[i.value] == 'o' || string[i.value] == 'u'
                    || string[i.value] == 'y') {
                count.value++;
            }
        }
        output +=
            (String.format ("The number of syllables is %d.\n", count.value));
        if (true)
            return;;
    }
}
