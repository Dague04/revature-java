package com.dague.service;

import com.dague.Employee;

public class DbSaverService implements Saver {
    String driver;
    String url;
    String username;
    String password;

    public DbSaverService() {
    }

    public DbSaverService(String driver, String url, String username, String password) {
        this.driver = driver;
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "DbSaverService{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public void save(Employee employee) {
        System.out.println("Saving employee into db");
        System.out.println("Driver: "+driver);
        System.out.println("Url: "+url);
        System.out.println("Username: "+username+", and Password: "+password);

    }
}
