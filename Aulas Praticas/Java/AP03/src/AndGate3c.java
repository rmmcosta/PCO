public class AndGate3c {
    private AndGate2 _ag1, _ag2;

    AndGate3c(){
        _ag1 = new AndGate2();
        _ag2 = new AndGate2();
    }

    AndGate3c(boolean portValue){
        _ag1 = new AndGate2(portValue);
        _ag2 = new AndGate2(portValue);
    }

    AndGate3c(boolean port1Value, boolean port2Value, boolean port3Value){
        _ag1 = new AndGate2(port1Value, port2Value);
        _ag2 = new AndGate2(_ag1.getOutput(), port3Value);
    }

    public void setPort1(boolean port1Value){
        _ag1.setIn1(port1Value);
        _ag2.setIn1(_ag1.getOutput());
    }

    public void setPort2(boolean port2Value){
        _ag1.setIn2(port2Value);
        _ag2.setIn1(_ag1.getOutput());
    }

    public void setPort3(boolean port3Value){
        _ag2.setIn2(port3Value);
    }

    public boolean getOutput(){
        return _ag2.getOutput();
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof AndGate3c){
            AndGate3c otherGate = (AndGate3c) o;
            return this._ag1.getIn1() == otherGate._ag1.getIn1() &&
                    this._ag1.getIn2() == otherGate._ag1.getIn2() &&
                    this._ag2.getIn2() == otherGate._ag2.getIn2();
        }
        return false;
    }

    @Override
    public String toString(){
        return "A:" + _ag1.getIn1() + " B:" + _ag1.getIn2() + " C:" + _ag2.getIn2();
    }

}
