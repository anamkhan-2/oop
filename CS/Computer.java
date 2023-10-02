package CS;

import java.util.Objects;

public class Computer {
    public String computerNumber;
    private String lcdModel;
    private int ramSize;
    private int hddSize;
    private boolean hasGPU;

    public String getComputerNumber() {
        return computerNumber;
    }

    public void setComputerNumber(String computerNumber) {
        this.computerNumber = computerNumber;
    }

    public String getLcdModel() {
        return lcdModel;
    }

    public void setLcdModel(String lcdModel) {
        this.lcdModel = lcdModel;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public boolean isHasGPU() {
        return hasGPU;
    }

    public void setHasGPU(boolean hasGPU) {
        this.hasGPU = hasGPU;
    }

    public  Computer(){
        this.computerNumber="";
        this.lcdModel="";
        this.ramSize=0;
        this.hddSize=0;
        this.hasGPU=true;

    }
    public Computer(String computerNumber,String lcdModel,int ramSize,int hddSize,boolean hasGPU) {
        this.computerNumber = computerNumber;
        this.lcdModel= lcdModel;
        this.ramSize=ramSize;
        this.hddSize=hddSize;
        this.hasGPU=hasGPU;
    }


    public boolean equals(Object o) {
        Computer c1 = (Computer) o;
        if (this.lcdModel == c1.lcdModel) {
            return true;

        }
        return false;
    }

    public Computer close(){
            return new Computer(this.getComputerNumber(),this.getLcdModel(),
                    this.getRamSize(),this.getHddSize(),this.isHasGPU());
        }


    }
