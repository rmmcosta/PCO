package arabiannights;

public class FriendlyGenie extends Genie
{

	public FriendlyGenie(int wishes){
		super(wishes);
	}

	public int getRemainingWishes() {
		return _wishes-_wishesGranted;
	}

	@Override
	public String toString(){
		return "Friendly genie has granted " + getGrantedWishes() + " wishes and still has " + getRemainingWishes() + " to grant.";
	}

}

