package introclassJava;

public class grade_af81ffd4_001 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        grade_af81ffd4_001 mainClass = new grade_af81ffd4_001 ();
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
        DoubleObj per = new DoubleObj ();
        output += (String.format ("Enter thresholds for A, B, C, D\n"));
        output += (String.format ("in that order, decreasing percentages > "));
        a.value = scanner.nextDouble ();
        b.value = scanner.nextDouble ();
        c.value = scanner.nextDouble ();
        d.value = scanner.nextDouble ();
        per.value = (a.value + b.value + c.value + d.value) / 4;
        if (per.value < 60) {
            output +=
                (String.format
                 ("Thank you. Now enter student score (percent) >Student has an D grade\n"));
        } else if (per.value >= 60 && per.value < 70) {
            output +=
                (String.format
                 ("Thank you. Now enter student score (percent) >Studnet has an C grade\n"));
        } else if (per.value >= 70 && per.value < 80) {
            output +=
                (String.format
                 ("Thank you. Now enter student score (percent) >Student has an B grade\n"));
        } else if (per.value >= 80) {
            output +=
                (String.format
                 ("Thank you. Now enter student score (percent) >Student ahs an A grade\n"));
        }
        if (true)
            return;;
    }
}
