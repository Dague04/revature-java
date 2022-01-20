package com.dague.controller;

import com.dague.Employee;
import com.dague.service.Saver;

public class SaverController {
    Saver saver;

    public SaverController() {
    }

    public SaverController(Saver saver) {
        this.saver = saver;
    }

    public Saver getSaver() {
        return saver;
    }

    public void setSaver(Saver saver) {
        this.saver = saver;
    }

    public void save(Employee employee){
        saver.save(employee);
    }

}
