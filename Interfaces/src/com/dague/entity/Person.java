package com.dague.entity;

import com.dague.beans.Brother;
import com.dague.beans.Father;
import com.dague.beans.Trainer;

public class Person implements Father, Trainer, Brother {
    @Override
    public void play() {
        System.out.println("Playing games with my brother");
    }

    @Override
    public void provide() {
        System.out.println("Providing food");
    }

    @Override
    public void train() {
        System.out.println("Training with my trainer");
    }
}
