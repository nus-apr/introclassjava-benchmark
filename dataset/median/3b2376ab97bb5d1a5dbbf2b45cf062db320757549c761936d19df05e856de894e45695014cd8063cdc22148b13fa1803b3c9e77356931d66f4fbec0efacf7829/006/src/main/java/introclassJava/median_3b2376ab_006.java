package introclassJava;

public class median_3b2376ab_006 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        median_3b2376ab_006 mainClass = new median_3b2376ab_006 ();
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
        IntObj n1 = new IntObj (), n2 = new IntObj (), n3 = new IntObj (), small =
            new IntObj ();
        output +=
            (String.format ("Please enter 3 numbers separated by spaces > "));
        n1.value = scanner.nextInt ();
        n2.value = scanner.nextInt ();
        n3.value = scanner.nextInt ();
        if (n1.value <= n2.value) {
            small.value = n1.value;
            if (small.value > n3.value) {
                output += (String.format ("%d is the median\n", n1.value));
            } else if (n3.value > n2.value) {
                output += (String.format ("%d is the median\n", n2.value));
            } else {
                output += (String.format ("%d is the median\n", n3.value));
            }
        } else {
            small.value = n2.value;
            if (small.value > n3.value) {
                output += (String.format ("%d is the median\n", n2.value));
            } else if (n3.value > n1.value) {
                output += (String.format ("%d is the median\n", n1.value));
            } else {
                output += (String.format ("%d IS the median\n", n3.value));
            }
        }
        if (true)
            return;;
    }
}
