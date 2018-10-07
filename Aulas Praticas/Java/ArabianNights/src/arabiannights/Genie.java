package arabiannights;

public abstract class Genie {
    int _wishes = 0;

    int _wishesGranted = 0;

    Genie(int wishes){
        _wishes = wishes;
    }

    public int getGrantedWishes(){
        return _wishesGranted;
    }

    public abstract int getRemainingWishes() ;

    public boolean grantWish() {
        if(getRemainingWishes()>0){
            _wishesGranted++;
            return true;
        }
        return false;
    }
}
