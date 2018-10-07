package arabiannights;


public class RecyclableDemon extends Genie
{
	
	private boolean _isBackToLamp;

	public RecyclableDemon(int wishes){
		super(wishes);
	}

	public boolean canGrantWishes() {
		return !_isBackToLamp;
	}
	
	public int getRemainingWishes() {
		if(_isBackToLamp){
		    return 0;
        }
		return _wishes-_wishesGranted;
	}

	public void feed() {
		_isBackToLamp = true;
	}

    @Override
    public String toString(){
        if (!_isBackToLamp) {
            return "Recyclable demon has granted " + _wishesGranted + " wishes.";
        } else {
            return "Demon has been recycled.";
        }
    }

}

