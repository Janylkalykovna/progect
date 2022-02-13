package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Animal[] animals={new Turtle(),new Eagle(), new Shark()};
        Animal[] rep = new Turtle[5];
        for(Animal a: animals){
            if(a instanceof Turtle)
                ((Turtle) a).swim();
            if(a instanceof Eagle)
                ((Eagle)a).fly();
            if(a instanceof Shark) ((Shark)a).attack();
        }

        }
        }


