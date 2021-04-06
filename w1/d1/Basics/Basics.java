import java.util.ArrayList;

public class Basics {
    public void printTo255() {
        for (int i = 0; i < 255; i++) {
            System.out.println(i);
        }
    }
    public void printOddTo255() {
        for (int i = 0; i < 255; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
    public void sumTo255() {
        int sum = 0;
        for (int i = 0; i < 255; i++) {
            sum += i;
            System.out.println("Number: " + i + " Sum: " + sum);
        }
    }
    public void iterateThroughArray(int [] array) {
        for (int element: array) {
            System.out.println(element);
        }
    }
    public int findMax(int[] inputArray) {
        int maxValue = inputArray[0]; 
        for(int i=1;i < inputArray.length;i++){ 
            if(inputArray[i] > maxValue){ 
                maxValue = inputArray[i]; 
            } 
        } 
        return maxValue; 
    }
    public double getAverage(int[] inputArray) {
        int sum = 0;
        int arrCount = 0;
        for (int element: inputArray) {
            sum += element;
            arrCount++;
        }
        return ((double)sum / arrCount);
    }
    public ArrayList<Integer> arrayOddTo255() {
        ArrayList<Integer> oddValues = new ArrayList<Integer>();
        for (Integer i = 0; i < 255; i++) {
            if (i % 2 != 0) {
                oddValues.add(i);
            }
        }
        return oddValues;
    }

    public int greaterThanY(int[] inputArray, int y) {
        int count = 0;
        for (int element: inputArray) {
            if (element > y) {
                count++;
            }
        }
        return count;
    }

    public ArrayList<Integer> squareTheVals(int[] inputArray) {
        ArrayList<Integer> myArray = new ArrayList<Integer>();

        for (int element: inputArray) {
            myArray.add(element * element);
        }
        return myArray;
    }

    public ArrayList<Integer> elimNegVals(int[] inputArray) {
        ArrayList<Integer> myArray = new ArrayList<Integer>();

        for (int element: inputArray) {
            if (element > 0) {
                myArray.add(element);
            }
        }
        return myArray;
    }

    public ArrayList<Object> maxMinAvg(int[] inputArray) {
        ArrayList<Object> maxMinAvgArr = new ArrayList<Object>();

        int arrMaxValue = inputArray[0]; 
        int arrMinValue = inputArray[0]; 
        double arrAvgVal = 0.0;
        int sum = 0;
        for(int i=1;i < inputArray.length;i++){ 
            sum += inputArray[i];
            if(inputArray[i] > arrMaxValue){ 
                arrMaxValue = inputArray[i]; 
            }
            if (inputArray[i] < arrMinValue){ 
                arrMinValue = inputArray[i]; 
            }
        }
        arrAvgVal = (sum / inputArray.length);

        maxMinAvgArr.add(arrMaxValue);
        maxMinAvgArr.add(arrMinValue);
        maxMinAvgArr.add(arrAvgVal);

        return maxMinAvgArr;
    }

    public ArrayList<Integer> shiftVals(int[] inputArray) {
        ArrayList<Integer> myArray = new ArrayList<Integer>();

        for (int i = 1; i < inputArray.length; i++) {
            myArray.add(inputArray[i]);
        }
        myArray.add(0);

        return myArray;
    }

}