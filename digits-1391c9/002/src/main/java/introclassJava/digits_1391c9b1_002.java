package introclassJava;

public class digits_1391c9b1_002 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_1391c9b1_002 mainClass = new digits_1391c9b1_002 ();
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
        IntObj Num = new IntObj (), X = new IntObj (), NewNum = new IntObj ();
        output += (String.format ("Please enter a number > "));
        Num.value = scanner.nextInt ();
        if (Num.value == 0) {
            output += (String.format ("0\n"));
        }
        while (Num.value > 0) {
            X.value = Num.value % 10;
            output += (String.format ("%d\n", X.value));
            NewNum.value = (Num.value - X.value) / 10;
            Num.value = NewNum.value;
        }
        while (Num.value < 0) {
            X.value = Num.value % 10;
            NewNum.value = (Num.value - X.value) / 10;
            if (X.value < 0) {
                output += (String.format ("%d\n", (X.value * -1)));
            }
            if (Num.value < 0 && Num.value > -10) {
                output += (String.format ("%d\n", X.value));
            }
            Num.value = NewNum.value;
        }
        output += (String.format ("That's all, have a nice day!\n"));
        if (true)
            return;;
    }
}
