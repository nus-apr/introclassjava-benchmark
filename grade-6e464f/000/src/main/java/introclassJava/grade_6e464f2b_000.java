package introclassJava;

public class grade_6e464f2b_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        grade_6e464f2b_000 mainClass = new grade_6e464f2b_000 ();
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
            new FloatObj (), d = new FloatObj (), s = new FloatObj ();
        CharObj g = new CharObj ();
        output +=
            (String.format
             ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        a.value = scanner.nextFloat ();
        b.value = scanner.nextFloat ();
        c.value = scanner.nextFloat ();
        d.value = scanner.nextFloat ();
        output +=
            (String.format ("Thank you. Now enter student score (percent) >"));
        s.value = scanner.nextFloat ();
        if (s.value < d.value) {
            output += (String.format ("Student has failed the course\n"));
        } else if (s.value < c.value) {
            g.value = 'C';
        } else if (s.value < b.value) {
            g.value = 'B';
        } else {
            g.value = 'A';
        }
        if (g.value == 'A' || g.value == 'B' || g.value == 'C') {
            output += (String.format ("Student has an %c grade\n", g.value));
        }
        if (true)
            return;;
    }
}
