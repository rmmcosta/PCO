public class AndGate2 {
    private boolean _in1,_in2;

    AndGate2(){
        _in1 = false;
        _in2 = false;
    }

    AndGate2(boolean portValue){
        _in1 = _in2 = portValue;
    }

    AndGate2(boolean portValue1, boolean portValue2){
        _in1 = portValue1;
        _in2 = portValue2;
    }

    public void setIn1(boolean port1Value){
        _in1 = port1Value;
    }

    public void setIn2(boolean port2Value){
        _in2 = port2Value;
    }

    public boolean getIn1(){
        return _in1;
    }

    public boolean getIn2(){
        return _in2;
    }

    public boolean getOutput(){
        return _in1&_in2;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof AndGate2){
            AndGate2 otherGate = (AndGate2) o;
            return this._in1 == otherGate._in1 && this._in2 == otherGate._in2;
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return "A: " + _in1 + " B: " + _in2;
    }
}
