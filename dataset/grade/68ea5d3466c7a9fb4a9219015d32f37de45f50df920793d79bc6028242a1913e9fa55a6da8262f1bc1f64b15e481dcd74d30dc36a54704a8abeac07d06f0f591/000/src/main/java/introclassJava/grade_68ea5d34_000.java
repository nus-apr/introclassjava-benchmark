package introclassJava;

public class grade_68ea5d34_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        grade_68ea5d34_000 mainClass = new grade_68ea5d34_000 ();
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
            new DoubleObj (), d = new DoubleObj (), in = new DoubleObj ();
        CharObj g = new CharObj ();
        output +=
            (String.format
             ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        a.value = scanner.nextDouble ();
        b.value = scanner.nextDouble ();
        c.value = scanner.nextDouble ();
        d.value = scanner.nextDouble ();
        output +=
            (String.format ("Thank you. Now enter student score (percent) >"));
        in.value = scanner.nextDouble ();
        if (in.value >= a.value) {
            g.value = 'A';
        } else if (in.value >= b.value) {
            g.value = 'B';
        } else if (in.value >= c.value) {
            g.value = 'C';
        } else if (in.value >= d.value) {
            g.value = 'D';
        } else {
            g.value = 'F';
        }
        output += (String.format ("Student has an %c grade\n", g.value));
        if (true)
            return;;
    }
}
