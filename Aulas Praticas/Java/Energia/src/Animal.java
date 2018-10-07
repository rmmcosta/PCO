public class Animal {
    protected int energia;

    public boolean corre(int amount){
        if(energia -amount <=0 ){
            System.out.println("Demasiado cansado para Correr!");
            return false;
        } else{
            energia -=amount;
            System.out.println(this + " a Correr...");
            return true;
        }
    }

    public void dorme(int energiaInicial){
        energia = energiaInicial;
        System.out.println("A Dormir...");
    }
}
