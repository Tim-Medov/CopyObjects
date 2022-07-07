
package enterprise;

public class Main {

    public static void main(String[] args) {

        Terminator terminator1 = new Terminator("T-800", 75);

        Terminator terminator2 = new Terminator(terminator1);
        terminator2.setDamage(50);

        Terminator terminator3 = new Terminator(terminator2);
        terminator3.setDamage(99);

        System.out.println("\n--Three different terminators--\n");

        System.out.println("Terminator1: " + terminator1);
        terminator1.print();
        System.out.println();

        System.out.println("Terminator2: " + terminator2);
        terminator2.print();
        System.out.println();

        System.out.println("Terminator3: " + terminator3);
        terminator3.print();
        System.out.println();
    }
}
