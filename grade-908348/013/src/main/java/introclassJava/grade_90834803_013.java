package introclassJava;

public class grade_90834803_013 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        grade_90834803_013 mainClass = new grade_90834803_013 ();
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
        DoubleObj A = new DoubleObj (), B = new DoubleObj (), C =
            new DoubleObj (), D = new DoubleObj (), grade = new DoubleObj ();
        output +=
            (String.format
             ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        A.value = scanner.nextDouble ();
        B.value = scanner.nextDouble ();
        C.value = scanner.nextDouble ();
        D.value = scanner.nextDouble ();
        output +=
            (String.format ("Thank you. Now enter student score (percent) >"));
        grade.value = scanner.nextDouble ();
        if (grade.value >= A.value) {
            output += (String.format ("Student has an A grade\n"));
        } else if (grade.value >= B.value && grade.value < A.value) {
            output += (String.format ("Student has an B grade\n"));
        } else if (grade.value >= C.value && grade.value < B.value) {
            output += (String.format ("Student has an C grade\n"));
        } else if (grade.value >= D.value && grade.value < C.value) {
            output += (String.format ("Student has an D grade\n"));
        } else if (grade.value < D.value) {
            output += (String.format ("Student has an F grade\n"));
        }
        if (true)
            return;;
    }
}
