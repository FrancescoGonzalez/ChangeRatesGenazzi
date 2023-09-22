package animals;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Animal{

    public void makeNoise(){

    }

    void eat(){ //deafult --> solo nel package

    }

    public void jump(){}

    public <T extends Animal> void takeThing(ArrayList<T> list){
        List<T> a = new ArrayList<>();
    }
}

