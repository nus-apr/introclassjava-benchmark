package introclassJava;

public class grade_75c98d3d_003 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        grade_75c98d3d_003 mainClass = new grade_75c98d3d_003 ();
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
        output += (String.format ("Enter thresholds for A, B, C, D\n"));
        output += (String.format ("in that order, decreasing percentages > "));
        A.value = scanner.nextFloat ();
        B.value = scanner.nextFloat ();
        C.value = scanner.nextFloat ();
        D.value = scanner.nextFloat ();
        output +=
            (String.format ("Thank you. Now enter student score (percent) >"));
        grade.value = scanner.nextFloat ();
        if (grade.value < 60) {
            output += (String.format ("Student has failed the course\n"));
        } else if (grade.value < 70) {
            output += (String.format ("Student has an D grade\n"));
        } else if (grade.value < 80) {
            output += (String.format ("Student has an C grade\n"));
        } else if (grade.value < 90) {
            output += (String.format ("Student has an B grade\n"));
        } else {
            output += (String.format ("Student has an A grade\n"));
        }
        if (true)
            return;;
    }
}
