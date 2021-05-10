package com.company;

public class CollectionOfSamplesOfDirt {

    private samplesOfDirt[] dirtSample = null; // private field of samplesOfDirt class array reference variable
    private int counter = 0;                   // private field counter for...


    public CollectionOfSamplesOfDirt() { // public default constructor
        this(3);
    }

    public CollectionOfSamplesOfDirt(int sampleSize) {       // public parametrized constructor
        if (sampleSize >= 2)
            this.dirtSample = new samplesOfDirt[sampleSize];
        else
            this.dirtSample = new samplesOfDirt[3];
    }

    public boolean isFull() {
        return counter == dirtSample.length;
    }

    public int getMaxSampleSize() {
        return dirtSample.length;
    }

    public int getSampleCount() {
        return counter;
    }

    public boolean addSample(samplesOfDirt p) {
        if (!isFull()) {
            dirtSample[counter] = p;
            counter++;
            return true;
        }
        return false;
    }

    public boolean addSample(double x, double y, double z) {
        samplesOfDirt q = new samplesOfDirt(x,y,z);
        return addSample(q);
    }


    public double averageClay;
    public double averagePercentOfClay() {
        for (int i = 0; i < dirtSample.length; i++) {
            averageClay += (dirtSample[i].getPercentOfClay() / dirtSample.length);
        } return averageClay;
    }

    public double averageSand;
    public double averagePercentOfSand() {
        for (int i = 0; i < dirtSample.length; i++) {
            averageSand += (dirtSample[i].getPercentOfSand() / dirtSample.length);
        } return averageSand;
    }

    public double averageOtherMaterials;
    public double averagePercentOfOtherMaterials() {
        for (int i = 0; i < dirtSample.length; i++) {
            averageOtherMaterials += (dirtSample[i].getPercentOfOtherMaterials() / dirtSample.length);
        } return averageOtherMaterials;
    }

    public double averagePH;
    public double averagePH() {
        for (int i = 0; i < dirtSample.length; i++) {
            averagePH += (dirtSample[i].getpH_Value() / dirtSample.length);
        } return averagePH;
    }

    public double highestPercentageClay() {
        double highestClay = dirtSample[0].getPercentOfClay();
        for (int i = 1; i < dirtSample.length; i++) {
            if (dirtSample[i].getPercentOfClay() > highestClay) {
                highestClay = dirtSample[i].getPercentOfClay();
            }
        } return highestClay;
    }

    public double highestPercentageSand() {
        double highestSand = dirtSample[0].getPercentOfSand();
        for (int i = 1; i < dirtSample.length; i++) {
            if (dirtSample[i].getPercentOfSand() > highestSand) {
                highestSand = dirtSample[i].getPercentOfSand();
            }
        } return highestSand;
    }

    public double highestPercentageOther() {
        double highestOther = dirtSample[0].getPercentOfOtherMaterials();
        for (int i = 1; i < dirtSample.length; i++) {
            if (dirtSample[i].getPercentOfOtherMaterials() > highestOther) {
                highestOther = dirtSample[i].getPercentOfOtherMaterials();
            }
        } return highestOther;
    }

    public double highestPH() {
        double highestPH = dirtSample[0].getpH_Value();
        for (int i = 1; i < dirtSample.length; i++) {
            if (dirtSample[i].getpH_Value() > highestPH) {
                highestPH = dirtSample[i].getpH_Value();
            }
        } return highestPH;
    }

    public double lowestPercentageClay() {
        double lowestClay = dirtSample[0].getPercentOfClay();
        for (int i = 1; i < dirtSample.length; i++) {
            if (dirtSample[i].getPercentOfClay() < lowestClay) {
                lowestClay = dirtSample[i].getPercentOfClay();
            }
        } return lowestClay;
    }

    public double lowestPercentageSand() {
        double lowestSand = dirtSample[0].getPercentOfSand();
        for (int i = 1; i < dirtSample.length; i++) {
            if (dirtSample[i].getPercentOfSand() < lowestSand) {
                lowestSand = dirtSample[i].getPercentOfSand();
            }
        } return lowestSand;
    }

    public double lowestPercentageOther() {
        double lowestOther = dirtSample[0].getPercentOfOtherMaterials();
        for (int i = 1; i < dirtSample.length; i++) {
            if (dirtSample[i].getPercentOfOtherMaterials() < lowestOther) {
                lowestOther = dirtSample[i].getPercentOfOtherMaterials();
            }
        } return lowestOther;
    }

    public double lowestPH() {
        double lowestPH = dirtSample[0].getpH_Value();
        for (int i = 1; i < dirtSample.length; i++) {
            if (dirtSample[i].getpH_Value() < lowestPH) {
                lowestPH = dirtSample[i].getpH_Value();
            }
        } return lowestPH;
    }

}
