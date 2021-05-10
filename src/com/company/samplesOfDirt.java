package com.company;

public class samplesOfDirt {   // dirt sample class

    private double PercentOfSand;              //range: [0,1] inclusive - private variable for sand percentage in sample
    private double PercentOfClay;              //range: [0,1] inclusive - private variable for clay percentage in sample
    private double PercentOfOtherMaterials;    //range: [0,1] inclusive - private variable for percentage of other materials in sample
    private double pH_Value;                   //range: [0,14] inclusive - private variable for pH level in sample


    public samplesOfDirt() {
        this(.45, .45, 14);
    }

    public samplesOfDirt(double PercentOfSand, double PercentOfClay, double pH_Value) {  // parametrized constructor
        setPercentOfSand(PercentOfSand);
        setPercentOfClay(PercentOfClay);
        setPH_Value(pH_Value);
        setPercentOfOtherMaterials(1 - (PercentOfSand + PercentOfClay));
    }

    public double getPercentOfSand() {
        return PercentOfSand;
    }
    public double getPercentOfClay() {
        return PercentOfClay;
    }
    public double getPercentOfOtherMaterials() {
        return PercentOfOtherMaterials;
    }
    public double getpH_Value() {
        return pH_Value;
    }

    public void setPercentOfSand(double PercentOfSand) {
        if (PercentOfSand >= 0 && PercentOfSand <= 1)
            this.PercentOfSand = PercentOfSand;

    }
    public void setPercentOfClay(double PercentOfClay) {
        if (PercentOfClay >= 0 && PercentOfClay <= 1)
            this.PercentOfClay = PercentOfClay;
    }
    public void setPercentOfOtherMaterials(double PercentOfOtherMaterials) {
        if (PercentOfOtherMaterials >= 0 && PercentOfOtherMaterials <= 1)
            this.PercentOfOtherMaterials = PercentOfOtherMaterials;
    }
    public void setPH_Value(double pH_Value) {
        if (pH_Value >= 0 && pH_Value <= 14)
            this.pH_Value = pH_Value;
    }
}
