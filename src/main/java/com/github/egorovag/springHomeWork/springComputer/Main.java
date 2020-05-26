package com.github.egorovag.springHomeWork.springComputer;

public class Main {
    public static void main(String[] args) {
        Cpu cpu = new Cpu("Ryzen",5000);
        Hdd hdd = new Hdd("Seagate",5000);
        Ram ram = new Ram("DDR3", 12);
        Computer computer = new Computer(1, "comp", cpu, hdd , ram);
        computer.turnOn();
        computer.turnOff();
    }
}
