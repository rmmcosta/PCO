public class Rato extends Animal {
    protected final int ENERGIA_INICIAL = 50,
                        ENERGIA_CORRER = 2,
                        ENERGIA_ESCAPAR = 5
                        ;

    Rato(){
        energia = ENERGIA_INICIAL;
    }

    public void morre(){
        energia = 0;
        System.out.println("O Rato morreu!");
    }

    @Override
    public String toString(){
        if(energia >0)
            return "O rato ainda tem " + energia + " de energia.";
        else
            return "O rato já morreu!";
    }
}
