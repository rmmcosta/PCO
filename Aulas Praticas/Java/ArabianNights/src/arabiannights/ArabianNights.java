package arabiannights;

public class ArabianNights {
    public static void main(String[] args){
        Genie[] genies = new Genie[5];
        MagicLamp mLamp = new MagicLamp(4);
        genies[0] = mLamp.rub(2);
        genies[1] = mLamp.rub(3);
        genies[2] = mLamp.rub(4);
        genies[3] = mLamp.rub(5);
        genies[4] = mLamp.rub(1);

        printState(genies);
        makeWishEachGenie(genies);
        printState(genies);

        makeWishEachGenie(genies);
        printState(genies);

        recycleADemon(genies,mLamp);

        Genie g = mLamp.rub(7);

        System.out.println(g);


    }

    public static void printState(Genie[] genies){
        for (Genie g: genies) {
            System.out.println(g);
        }
    }

    public static void makeWishEachGenie(Genie[] genies){
        for (Genie g: genies) {
            g.grantWish();
        }
    }

    public static void recycleADemon(Genie[] genies, MagicLamp magicLamp){
        for (Genie g: genies) {
            if(g instanceof RecyclableDemon && ((RecyclableDemon) g).canGrantWishes()){
                magicLamp.feedDemon((RecyclableDemon) g);
                return;
            }
        }
    }
}
