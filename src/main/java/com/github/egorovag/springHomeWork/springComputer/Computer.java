package com.github.egorovag.springHomeWork.springComputer;

public class Computer implements StateComputer {
    private int id;
    private String name;
    private Parts cpu;
    private Parts hdd;
    private Parts ram;
    private boolean resState = false;

    Computer(int id, String name, Cpu cpu, Hdd hdd, Ram ram) {
        this.id = id;
        this.name = name;
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
    }

    @Override
    public void turnOn() {
        if (cpu.checkStandardPart() && hdd.checkStandardPart() && ram.checkStandardPart()) {
            System.out.println("Компьютер включен");
            resState = true;
        } else {
            System.out.println("Компьютер не включается");
        }
    }

    @Override
    public void turnOff() {
        if (resState) {
            System.out.println("Компьютер выключен");
        } else {
            System.out.println("Компьютер не был включен");
        }
    }
}
