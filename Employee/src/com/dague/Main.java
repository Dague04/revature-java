package com.dague;

import com.dague.beans.Manager;
import com.dague.beans.Supervisor;
import com.dague.beans.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker(4,"david");


        Manager manager = new Manager(4,"John",4);

        Supervisor supervisor = new Supervisor(6,"Lewis", 8);

        System.out.println(worker.toString());
        System.out.println(supervisor.toString());
        System.out.println(manager.toString());
    }
}
