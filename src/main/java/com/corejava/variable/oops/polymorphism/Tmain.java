package com.corejava.variable.oops.polymorphism;

public class Tmain {
    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        Animal Dog = new Dog();
        Animal Fish = new Fish();

        trainer.teach(Dog);
        trainer.teach(Fish);



    }
}
