package com.github.egorovag.springHomeWork.springComputer;

public class Cpu implements Parts {
    private String model;
    private int frequency;

    Cpu(String model, int frequency) {
        this.model = model;
        this.frequency = frequency;
    }

    @Override
    public boolean checkStandardPart() {
        return model.equals("Ryzen") || model.equals("Athlon") && frequency>=3000;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
