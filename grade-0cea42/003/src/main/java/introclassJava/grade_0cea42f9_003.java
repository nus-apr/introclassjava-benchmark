package introclassJava;

public class grade_0cea42f9_003 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        grade_0cea42f9_003 mainClass = new grade_0cea42f9_003 ();
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
            new FloatObj (), D = new FloatObj (), score = new FloatObj ();
        output += (String.format ("Enter thresholds for A, B, C, D\n"));
        output += (String.format ("in that order, decreasing percentages > "));
        A.value = scanner.nextFloat ();
        B.value = scanner.nextFloat ();
        C.value = scanner.nextFloat ();
        D.value = scanner.nextFloat ();
        output +=
            (String.format ("Thank you. Now enter student score (percent) > "));
        score.value = scanner.nextFloat ();
        if (score.value >= A.value) {
            output += (String.format ("Stdent has an A grade\n"));
        } else if (score.value < A.value && score.value >= B.value) {
            output += (String.format ("Student has an B grade\n"));
        } else if (score.value < B.value && score.value >= C.value) {
            output += (String.format ("Student has an C grade\n"));
        } else if (score.value < C.value && score.value >= D.value) {
            output += (String.format ("Student has an D grade\n"));
        } else {
            output += (String.format ("Student has failed the course\n"));
        }
        if (true)
            return;;
    }
}
