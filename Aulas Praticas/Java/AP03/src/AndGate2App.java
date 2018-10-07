public class AndGate2App {
    public static void main(String[] args){

        AndGate2 ag1 = new AndGate2();
        System.out.println(ag1);
        System.out.println("Output: " + ag1.getOutput());

        AndGate2 ag2 = new AndGate2(true);
        System.out.println(ag2);
        System.out.println("Output: " + ag2.getOutput());

        AndGate2 ag3 = new AndGate2(false);
        System.out.println(ag3);
        System.out.println("Output: " + ag3.getOutput());

        AndGate2 ag4 = new AndGate2(true,false);
        System.out.println(ag4);
        System.out.println("Output: " + ag4.getOutput());

        AndGate2 ag5 = new AndGate2(false,true);
        System.out.println(ag5);
        System.out.println("Output: " + ag5.getOutput());

        AndGate2 ag6 = new AndGate2(false,false);
        System.out.println(ag6);
        System.out.println("Output: " + ag6.getOutput());

        AndGate2 ag7 = new AndGate2(true,true);
        System.out.println(ag7);
        System.out.println("Output: " + ag7.getOutput());

        System.out.println(ag1 + " equals " + ag3 + "?\n" + ag1.equals(ag3));
    }
}
