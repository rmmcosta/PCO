package arabiannights;

public class MagicLamp
{
	
    private int _capacity, _timesRubbed;
	
	private int _timesRecharged;

	public MagicLamp(int capacity){
		_capacity = capacity;
	}
	
	public Genie rub(int wishes) {
	    if(_timesRubbed>=_capacity){
            _timesRubbed++;
	        return new RecyclableDemon(wishes);
        } else {
            if(_timesRubbed>0 && _timesRubbed%2==0){
                _timesRubbed++;
                return new FriendlyGenie(wishes);
            } else{
                _timesRubbed++;
                return new GrumpyGenie(wishes);
            }
        }
	}
	
	public void feedDemon(RecyclableDemon demon) {
		_timesRecharged++;
		_timesRubbed=0;
		demon.feed();
	}
	
	public int getGenies() {
		return _capacity - _timesRubbed;
	}
	
	public int getDemons() {
		return _timesRecharged;
	}
	
	public Object equals() {
		// TODO implement me
		return null;
	}
	
	public int getCapacity() {
		return _capacity;
	}

}

