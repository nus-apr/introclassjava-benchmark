package introclassJava;

public class grade_ee1f20cc_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        grade_ee1f20cc_000 mainClass = new grade_ee1f20cc_000 ();
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
        FloatObj a = new FloatObj (), b = new FloatObj (), c =
            new FloatObj (), d = new FloatObj (), A = new FloatObj ();
        output +=
            (String.format
             ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages  > "));
        a.value = scanner.nextFloat ();
        b.value = scanner.nextFloat ();
        c.value = scanner.nextFloat ();
        d.value = scanner.nextFloat ();
        output +=
            (String.format ("Thank you. Now enter student score (percent) >"));
        A.value = scanner.nextFloat ();
        if (A.value >= a.value) {
            output += (String.format ("Student has an A grade\n"));
        } else if (A.value < a.value && A.value >= b.value) {
            output += (String.format ("Student has an B grade\n"));
        } else if (A.value < b.value && A.value >= c.value) {
            output += (String.format ("Student has an C grade\n"));
        } else if (A.value < c.value && A.value >= d.value) {
            output += (String.format ("Student has an D grade\n"));
        } else {
            output += (String.format ("Student has an F grade\n"));
        }
        if (true)
            return;;
    }
}
