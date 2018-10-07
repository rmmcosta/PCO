public class AndGate3i extends AndGate2 {
    private boolean _in3;

    AndGate3i(){
        super();
        _in3 = false;
    }

    AndGate3i(boolean portValue){
        super(portValue);
        _in3 = portValue;
    }

    AndGate3i(boolean portValue1, boolean portValue2){
        super(portValue1, portValue2);
        _in3 = false;
    }

    AndGate3i(boolean portValue1, boolean portValue2, boolean portValue3){
        super(portValue1, portValue2);
        _in3 = portValue3;
    }

    @Override
    public boolean getOutput(){
        return super.getOutput()&_in3;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof AndGate3i){
            AndGate3i otherGate = (AndGate3i) o;
            return super.equals(o) && this._in3 == otherGate._in3;
        }
        else
            return false;
    }

    @Override
    public String toString(){
        return super.toString() + " C: " + _in3;
    }
}
