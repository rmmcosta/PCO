public class Cao extends Animal {
    protected final int ENERGIA_INICIAL = 1000,
                        ENERGIA_CORRER = 50,
                        ENERGIA_ATACAR_GATO = 100,
                        TENTATIVAS_SUCESSO_CAPTURAR_RATO = 25
                        ;
    private int _tentativasFeitasCapturarRato = 0;
    public String nome;

    Cao(String nome){
        energia = ENERGIA_INICIAL;
        this.nome = nome;
    }

    private void come(Rato r){
        r.morre();
        energia +=r.energia;
    }

    public boolean captura(Rato r){
        boolean correu;
        correu = corre(ENERGIA_CORRER);
        if(correu) {
            _tentativasFeitasCapturarRato++;
            r.corre(r.ENERGIA_CORRER);
            if (_tentativasFeitasCapturarRato == TENTATIVAS_SUCESSO_CAPTURAR_RATO) {
                come(r);
                _tentativasFeitasCapturarRato = 0;
                return true;
            } else {
                r.energia += r.ENERGIA_ESCAPAR;
                return false;
            }
        } else {
            dorme(ENERGIA_INICIAL);
            return false;
        }
    }

    public boolean ataca(Gato g){
        if(energia -ENERGIA_ATACAR_GATO <= 0){
            System.out.println("Desmasiado cansado para atacar o Gato!");
            return false;
        } else{
            energia -=ENERGIA_ATACAR_GATO;
            g.energia -=g.ENERGIA_ATACADO_CAO;
            if(g.energia <= 0){
                g.morre();
            }
            return true;
        }
    }

    @Override
    public String toString(){
        if(energia >0)
            return "O " + nome + " ainda tem " + energia + " de energia.";
        else
            return "O " + nome + " já morreu!";
    }
}
