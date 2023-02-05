package introclassJava;

public class syllables_99cbb46b_003 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        syllables_99cbb46b_003 mainClass = new syllables_99cbb46b_003 ();
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
        char[] str = new char[20];
        IntObj i = new IntObj (), syl = new IntObj (), len = new IntObj ();
        output += (String.format ("Please enter a string > "));
        str = scanner.next ().toCharArray ();
        len.value = str.length;
        syl.value = 0;
        for (i.value = 0; i.value < len.value; i.value++) {
            if (str[i.value] == 'a' || str[i.value] == 'e' || str[i.value] == 'i'
                    || str[i.value] == 'o' || str[i.value] == 'u'
                    || str[i.value] == 'y') {
                syl.value++;
            }
        }
        output += (String.format ("The number of syllables is %d.\n", syl.value));
        if (true)
            return;;
    }
}
