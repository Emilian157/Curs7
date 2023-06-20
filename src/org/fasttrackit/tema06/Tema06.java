package org.fasttrackit.tema06;

import java.util.Random;

public class Tema06 {
    static int [] numbers = new int[] {1,2,4,5, 79, 3};
    public static void main(String[] args) {
        int sumofNumbers = sumOfArray(numbers);
        System.out.println(sumofNumbers);
        int oddNumbers = oddNumbers(numbers);
        System.out.print(oddNumbers(numbers));
        int[] numbersHigherThan = numbersHigherThan(numbers, 3);
        printArray(numbersHigherThan);
        donatii(20000);
        System.out.println();
        donatiiLinmitate(700, 10);
        splitSentance("Ana are mere. multe. foarte multe. a. b. c. d.");
    }

    public static int sumOfArray( int[] numbers) {
        int sum = 0;
        for (int number : numbers){
            sum = sum + number;
        }
        return sum;
    }

    public static int oddNumbers(int[] numbers) {
        int oddNumbers = 0;
        for(int number : numbers){
            if(number % 2 == 1){
                oddNumbers++;
            }
        }
        return oddNumbers;
    }

    public static int[] numbersHigherThan(int[] numbers, int numbersToCompare) {
//        int[] numbersHigherThan = new int[numbers.length];
//        int index = 0;
//        for(int currentNUmber : numbers) {
//            if( currentNUmber > numbersToCompare) {
//                numbersHigherThan[index] = currentNUmber;
//                index++;
//            }
//        }
//        return numbersHigherThan;
        int counter = 0;
        for (int currentNumber: numbers) {
            if( currentNumber > numbersToCompare) {
                counter++;
            }
        }
        int[] numbersHigherThan = new int[counter];
        int index = 0;
        for (int currentNumber: numbers) {
            if( currentNumber > numbersToCompare) {
                numbersHigherThan[index] = currentNumber;
                index++;
            }
        }
        return numbersHigherThan;
    }

    public static void printArray(int[] numbers) {
        for(int nr: numbers){
            System.out.println(nr + " ");
        }
    }

    public static void donatii(int target) {
        Random random = new Random();
        int sumaStransa = 0;
        while (target > sumaStransa){
            sumaStransa = sumaStransa + random.nextInt(500) + 1;
        }
        System.out.println("Am strans suma: " + sumaStransa);
    }

    public static void donatiiLinmitate(int target, int nrDonatii){
        Random random = new Random();
        int sumaStransa = 0;
        int counter = 0;
        while(target > sumaStransa){
//            if(counter == nrDonatii) {
//                break;
//            }
            sumaStransa = sumaStransa + random.nextInt(50) + 1;
            counter++;
        }
        System.out.println("Am strans " + sumaStransa + " in " + counter + " donatii");
    }

    public static void splitSentance(String toSplit) {
        String[] sentence = toSplit.split("\\.");
        for(String currentSentance: sentence) {
            System.out.println(currentSentance.trim());
        }
    }
}
