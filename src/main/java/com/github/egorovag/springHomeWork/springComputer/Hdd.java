package com.github.egorovag.springHomeWork.springComputer;

public class Hdd implements Parts {
    private String model;
    private int volume;

    Hdd(String model, int volume) {
        this.model = model;
        this.volume = volume;
    }

    @Override
    public boolean checkStandardPart() {
        return model.equals("Seagate") || model.equals("Toshiba") && volume>=5000;
    }
}
