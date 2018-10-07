public class Gato extends Animal {
    protected final int ENERGIA_INICIAL = 500,
                        ENERGIA_CORRER = 25,
                        ENERGIA_ATACADO_CAO = 25,
                        TENTATIVAS_SUCESSO_CAPTURAR_RATO = 5,
                        TENTATIVAS_SUCESSO_CAPTURAR_PASSARO = 10
                        ;

    private int _tentativasFeitasCapturarRato = 0,
                _tentativasFeitasCapturarPassaro =0
                ;
    public String nome;

    Gato(String nome){
        energia = ENERGIA_INICIAL;
        this.nome = nome;
    }

    private void come(Rato r){
        energia +=r.energia;
        r.morre();
    }

    private void come(Passaro p){
        energia +=p.energia;
        p.morre();
    }

    public boolean captura(Rato r){
        boolean correu;
        correu = corre(ENERGIA_CORRER);
        if(correu){
            _tentativasFeitasCapturarRato++;
            r.corre(r.ENERGIA_CORRER);
            if(_tentativasFeitasCapturarRato == TENTATIVAS_SUCESSO_CAPTURAR_RATO){
                come(r);
                _tentativasFeitasCapturarRato = 0;
                return true;
            }
            else{
                r.energia+=r.ENERGIA_ESCAPAR;
                return false;
            }
        } else{
            dorme(ENERGIA_INICIAL);
            return false;
        }
    }

    public boolean captura(Passaro p){
        boolean correu;
        correu = corre(ENERGIA_CORRER);
        if(correu){
            _tentativasFeitasCapturarPassaro++;
            p.corre(p.ENERGIA_CORRER);
            p.voa();
            if(_tentativasFeitasCapturarPassaro == TENTATIVAS_SUCESSO_CAPTURAR_PASSARO){
                come(p);
                _tentativasFeitasCapturarPassaro = 0;
                return true;
            }
            else{
                p.energia+=p.ENERGIA_ESCAPAR;
                return false;
            }
        } else{
            dorme(ENERGIA_INICIAL);
            return false;
        }
    }

    public void morre(){
        energia = 0;
        System.out.println("O Gato morreu!");
    }

    @Override
    public String toString(){
        if(energia >0)
            return "O " + nome + " ainda tem " + energia + " de energia.";
        else
            return "O " + nome + " já morreu!";
    }
}
