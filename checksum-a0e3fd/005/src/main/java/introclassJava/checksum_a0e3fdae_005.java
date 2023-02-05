package introclassJava;

public class checksum_a0e3fdae_005 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        checksum_a0e3fdae_005 mainClass = new checksum_a0e3fdae_005 ();
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
        IntObj checksum = new IntObj (), integer_value = new IntObj (), sum =
            new IntObj (0);
        char[] value = new char[1000];
        output +=
            (String.format
             ("Enter an abitrarily long string, ending with carriage return > "));
        value = scanner.next ().toCharArray ();
        IntObj i = new IntObj ();
        IntObj stringlength = new IntObj (value.length);
        for (i.value = 0; i.value < stringlength.value; i.value++) {
            integer_value.value = value[i.value];
            sum.value = sum.value + integer_value.value;
        }
        checksum.value = (sum.value % 64) + ' ';
        output += (String.format ("Check sum is %c\n", checksum.value));
        if (true)
            return;;
    }
}
