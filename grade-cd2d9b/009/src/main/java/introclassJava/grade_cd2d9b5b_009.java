package introclassJava;

public class grade_cd2d9b5b_009 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        grade_cd2d9b5b_009 mainClass = new grade_cd2d9b5b_009 ();
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
        FloatObj num1 = new FloatObj (), num2 = new FloatObj (), num3 =
            new FloatObj (), num4 = new FloatObj ();
        FloatObj score = new FloatObj ();
        output +=
            (String.format
             ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        num1.value = scanner.nextFloat ();
        num2.value = scanner.nextFloat ();
        num3.value = scanner.nextFloat ();
        num4.value = scanner.nextFloat ();
        output +=
            (String.format ("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextFloat ();
        if (score.value >= num1.value) {
            output += (String.format ("Student has an A grade"));
        } else if (score.value >= num2.value) {
            output += (String.format ("Student has an B grade"));
        } else if (score.value >= num3.value) {
            output += (String.format ("Student has an C grade"));
        } else if (score.value >= num4.value) {
            output += (String.format ("Student has an D grade"));
        }
        output += (String.format ("\n"));
        if (true)
            return;;
    }
}
