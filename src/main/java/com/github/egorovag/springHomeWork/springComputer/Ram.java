package com.github.egorovag.springHomeWork.springComputer;

public class Ram implements Parts {
    private String standardRam;
    private int memorySize;

    Ram(String standardRam, int memorySize) {
        this.standardRam = standardRam;
        this.memorySize = memorySize;
    }

    @Override
    public boolean checkStandardPart() {
        return standardRam.equals("DDR3") && memorySize>=8;
    }
}
