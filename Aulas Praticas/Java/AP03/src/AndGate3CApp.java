public class AndGate3CApp {
    public static void main(String[] args){
        AndGate3c ag1 = new AndGate3c();
        System.out.println("Output:" + ag1.getOutput());
        System.out.println(ag1);

        AndGate3c ag2 = new AndGate3c(true);
        System.out.println("Output:" + ag2.getOutput());
        System.out.println(ag2);

        AndGate3c ag3 = new AndGate3c(true,false,true);
        System.out.println("Output:" + ag3.getOutput());
        System.out.println(ag3);

        System.out.println(ag3 + " equals " + ag2 + "?\n" + ag3.equals(ag2));

        ag3.setPort2(true);
        System.out.println("Output:" + ag3.getOutput());
        System.out.println(ag3);

        System.out.println(ag3 + " equals " + ag2 + "?\n" + ag3.equals(ag2));
    }
}
