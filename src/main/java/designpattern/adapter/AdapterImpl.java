package designpattern.adapter;

public class AdapterImpl implements Adapter {

    @Override
    public Float twiceOf(Float f){
        return f + f;
    }

    @Override
    public Float halfOf(Float f){
        return f / 2;
    }
}
