package io.zipcoder.polymorphism;

public class Fox extends Pet{
    public Fox(String name) {
        super(name);
    }
    @Override
    public String speak(){
        return "What does the Fox say? RING DING DING DING DING DA DING";
    }
}
