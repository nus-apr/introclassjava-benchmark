package introclassJava;

public class grade_3b2376ab_007 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        grade_3b2376ab_007 mainClass = new grade_3b2376ab_007 ();
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
        FloatObj A = new FloatObj (), B = new FloatObj (), C =
            new FloatObj (), D = new FloatObj (), grade = new FloatObj ();
        output +=
            (String.format
             ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        A.value = scanner.nextFloat ();
        B.value = scanner.nextFloat ();
        C.value = scanner.nextFloat ();
        D.value = scanner.nextFloat ();
        output +=
            (String.format ("Thank you. Now enter student score (percent) >"));
        grade.value = scanner.nextFloat ();
        if (grade.value >= A.value) {
            output += (String.format ("Student has an A grade"));
        } else if (A.value > grade.value && grade.value >= B.value) {
            output += (String.format ("Student has an B grade"));
        } else if (B.value > grade.value && grade.value >= C.value) {
            output += (String.format ("Student has an C grade"));
        } else {
            output += (String.format ("Student has an D grade"));
        }
        output += (String.format ("\n"));
        if (true)
            return;;
    }
}
