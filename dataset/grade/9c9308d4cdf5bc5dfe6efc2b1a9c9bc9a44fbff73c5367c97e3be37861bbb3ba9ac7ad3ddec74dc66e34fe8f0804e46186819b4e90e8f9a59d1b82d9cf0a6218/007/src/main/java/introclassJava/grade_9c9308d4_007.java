package introclassJava;

public class grade_9c9308d4_007 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        grade_9c9308d4_007 mainClass = new grade_9c9308d4_007 ();
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
            new DoubleObj (), D = new DoubleObj (), studentscore = new DoubleObj ();
        CharObj lettergrade = new CharObj ();
        output +=
            (String.format
             ("Enter thresholds for A, B, C, D \nin that order, decreasing percentages > Thank you. "));
        A.value = scanner.nextDouble ();
        B.value = scanner.nextDouble ();
        C.value = scanner.nextDouble ();
        D.value = scanner.nextDouble ();
        output += (String.format ("Now enter student score (perecnt) >"));
        studentscore.value = scanner.nextDouble ();
        if (studentscore.value >= A.value) {
            lettergrade.value = 'A';
        } else if (studentscore.value >= B.value) {
            lettergrade.value = 'B';
        } else if (studentscore.value >= C.value) {
            lettergrade.value = 'C';
        } else if (studentscore.value >= D.value) {
            lettergrade.value = 'D';
        } else {
            lettergrade.value = 'F';
        }
        output +=
            (String.format ("Student has an %c grade\n", lettergrade.value));
        if (true)
            return;;
    }
}
