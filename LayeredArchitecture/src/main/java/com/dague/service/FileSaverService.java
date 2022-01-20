package com.dague.service;

import com.dague.Employee;

public class FileSaverService implements Saver {
    String filename;

    public FileSaverService() {
    }

    public FileSaverService(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public void save(Employee employee) {
        System.out.println("filename saved: "+filename);

    }
}
