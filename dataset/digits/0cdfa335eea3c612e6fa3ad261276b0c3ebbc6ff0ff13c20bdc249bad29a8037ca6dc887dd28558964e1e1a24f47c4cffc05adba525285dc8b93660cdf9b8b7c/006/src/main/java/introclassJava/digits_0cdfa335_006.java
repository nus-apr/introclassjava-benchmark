package introclassJava;

public class digits_0cdfa335_006 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_0cdfa335_006 mainClass = new digits_0cdfa335_006 ();
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
        IntObj n = new IntObj (), temp = new IntObj (), digit = new IntObj ();
        DoubleObj i = new DoubleObj ();
        output += (String.format ("\nEnter an integer > "));
        n.value = scanner.nextInt ();
        output += (String.format ("\n"));
        temp.value = Math.abs (n.value);
        i.value = Math.log10 (temp.value);
        i.value = (int) Math.ceil (i.value);
        if (i.value / i.value == 1) {
            i.value++;
        }
        while (n.value != 0) {
            digit.value = n.value % 10;
            n.value = n.value / 10;
            if (i.value != 1) {
                output += (String.format ("%d\n", Math.abs (digit.value)));
            }
            if (i.value == 1) {
                output += (String.format ("%d\n", digit.value));
            }
            i.value--;
        }
        output += (String.format ("That's all, have a nice day!\n"));
        if (true)
            return;;
    }
}
