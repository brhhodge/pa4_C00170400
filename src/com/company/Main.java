// Brian Hodge
// C00170400
// CMPS 260
// Programming Assignment: #4
// Due Date: 3/15/2019 @ 11:55pm
// Program Description: This program prompts the user to enter number of samples of dirt to be stored, and allows the user to
// enter sand, clay, and other percentage make-up of the dirt samples, and the pH of the dirt. It then computes and displays
// the average, high, low, of each parameter of the dirt samples.
// Certificate of Authenticity:
// - I certify that the code of this project, other than that that was generated by IntelliJ, is entirely my own work.

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Enter the number of samples to be collected: ");
        Scanner input = new Scanner(System.in);
        int sampleSize = input.nextInt();

        CollectionOfSamplesOfDirt sampleCollection = new CollectionOfSamplesOfDirt(sampleSize);
        System.out.println();

        int count = 1;
        while (!sampleCollection.isFull()) {    // while loop to prompt user to enter data for each sample to be collected
            System.out.println("Sample " + count);
            System.out.println("Sand + Clay must be <= 1");

            System.out.print("Enter sand percent: ");
            double sand = input.nextDouble();
            System.out.print("Enter clay percent: ");
            double clay = input.nextDouble();
            System.out.print("Enter pH(0 - 14): ");
            double pH = input.nextDouble();

            if (sand + clay > 1 || (pH < 0 || pH > 14)) {
                System.out.println("Bad values. Please reenter");
                System.out.println();
            }
            else {
                System.out.println("Sample Accepted.");
                System.out.println();
                sampleCollection.addSample(sand, clay, pH);
                count++;
            }
        }
        System.out.println("Sample Count:  " + sampleCollection.getSampleCount());
        System.out.println("Maximum Samples:  " + sampleCollection.getMaxSampleSize());
        System.out.println();
        System.out.println("Average Clay:  " + sampleCollection.averagePercentOfClay());
        System.out.println("Clay High: " + sampleCollection.highestPercentageClay());
        System.out.println("Clay Low:  " + sampleCollection.lowestPercentageClay());
        System.out.println();
        System.out.println("Average Sand:  " + sampleCollection.averagePercentOfSand());
        System.out.println("Sand High:  " + sampleCollection.highestPercentageSand());
        System.out.println("Sand Low:   " + sampleCollection.lowestPercentageSand());
        System.out.println();
        System.out.println("Average Other Materials:  " + sampleCollection.averagePercentOfOtherMaterials());
        System.out.println("Other Materials High:  " + sampleCollection.highestPercentageOther());
        System.out.println("Other Materials Low:  " + sampleCollection.lowestPercentageOther());
        System.out.println();
        System.out.println("Average pH:  " + sampleCollection.averagePH());
        System.out.println("pH High:  " + sampleCollection.highestPH());
        System.out.println("pH Low:  " + sampleCollection.lowestPH());
        System.out.println();

    }

}
