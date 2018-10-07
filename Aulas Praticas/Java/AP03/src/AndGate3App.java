import java.util.ArrayList;

public class AndGate3App {
    public static void main(String[] args){
        AndGate3i a3g = new AndGate3i();
        System.out.println(a3g);
        System.out.println(a3g.getOutput());

        AndGate3i a3g2 = new AndGate3i(true);
        System.out.println(a3g2);
        System.out.println(a3g2.getOutput());

        AndGate3i a3g3 = new AndGate3i(true, false);
        System.out.println(a3g3);
        System.out.println(a3g3.getOutput());

        AndGate3i a3g4 = new AndGate3i(true, true, true);
        System.out.println(a3g4);
        System.out.println(a3g4.getOutput());

        System.out.println(a3g2 + " equals " + a3g4 + "?\n" + a3g2.equals(a3g4));
        System.out.println(a3g3 + " equals " + a3g4 + "?\n" + a3g3.equals(a3g4));

        ArrayList list = new ArrayList();
        System.out.println(a3g3 + " equals " + list + "?\n" + a3g3.equals(list));
    }
}
