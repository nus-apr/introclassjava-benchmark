package introclassJava;

public class grade_dc11fbc9_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        grade_dc11fbc9_000 mainClass = new grade_dc11fbc9_000 ();
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
        DoubleObj a = new DoubleObj (), b = new DoubleObj (), c =
            new DoubleObj (), d = new DoubleObj ();
        DoubleObj score = new DoubleObj ();
        output +=
            (String.format
             ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        a.value = scanner.nextDouble ();
        b.value = scanner.nextDouble ();
        c.value = scanner.nextDouble ();
        d.value = scanner.nextDouble ();
        output +=
            (String.format ("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextDouble ();
        if (score.value >= a.value) {
            output += (String.format ("Student has an A grade\n"));
        } else if (score.value >= b.value) {
            output += (String.format ("Student has a B grade\n"));
        } else if (score.value >= c.value) {
            output += (String.format ("Student has a C grade\n"));
        } else if (score.value >= d.value) {
            output += (String.format ("Student has a D grade\n"));
        } else {
            output += (String.format ("Student has failed the course\n"));
        }
        if (true)
            return;;
    }
}
