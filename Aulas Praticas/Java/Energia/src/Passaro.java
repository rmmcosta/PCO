public class Passaro extends Animal {
    protected final int ENERGIA_INICIAL = 20,
                        ENERGIA_CORRER = 5,
                        ENERGIA_VOAR = 2,
                        ENERGIA_ESCAPAR = 5
                        ;

    Passaro(){
        energia = ENERGIA_INICIAL;
    }

    public void voa(){
        energia -=ENERGIA_VOAR;
    }

    public void morre(){
        energia = 0;
    }

    @Override
    public String toString(){
        if(energia >0)
            return "Este pássaro ainda tem " + energia + " de energia.";
        else
            return "Este pássaro está morto!";
    }
}
