package com.dague;

import com.dague.beans.Brother;
import com.dague.beans.Father;
import com.dague.beans.Trainer;
import com.dague.entity.Person;

public class Main {
    public static void main(String[] args) {
        Brother brother = new Person();
        brother.play();

        Trainer trainer = new Person();
        trainer.train();

        Father father = new Person();
        father.provide();
    }
}
