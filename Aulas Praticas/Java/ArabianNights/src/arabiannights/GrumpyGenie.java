package arabiannights;

public class GrumpyGenie extends Genie
{
    private boolean _hasGrantedWish;

    public GrumpyGenie(int wishes){
        super(wishes);
    }
	
	@Override
    public boolean grantWish() {
		if(!_hasGrantedWish){
		    _hasGrantedWish = true;
		    _wishesGranted++;
		    return true;
        }
		return false;
	}

	public int getRemainingWishes() {
        if(!_hasGrantedWish){
            return 1;
        }
        return 0;
	}

    @Override
    public String toString(){
        if (_hasGrantedWish){
            return "Grumpy genie has granted a wish.";
        } else {
            return "Grumpy genie has a wish to grant.";
        }
    }

}

