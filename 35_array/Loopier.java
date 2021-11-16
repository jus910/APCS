/*
Team we forgot: Jonathan Song, Justin Mohabir, Kevin Li
APCS
HW35 -- A Pirate's Life for Me (refactored)
2021-11-15
time spent: .2 hours
DISCO
    - 
QCC:
    - Is there a specific range we should aim for in the random number generator if it's not given in the instructions?
*/
public class Loopier{
    public static int counter = 0;

    public static void randomIntArray(int[] a) {
        for(int x = 0; x < a.length; x++) {
            a[x] = (int)(Math.random() * 10);
        }
    }

    public static String printArray(int[] a) {
        String result = "[";
        int x = 0;

        if (a.length == 0) {
            return "[]";
        }

        while(x < a.length - 1) {
            result = result + a[x] + ", ";
            x++;
        }
        result = result + a[x] + "]";
        return result;
    }

    public static int linSearch(int[] a, int target) {
        for(int x = 0; x < a.length; x++) {
            if (a[x] == target) {
                return x;
            }
        }
        return -1;
    }
    
    public static int linSearchR(int[] a, int target) {
        if (a.length == 0) {
            counter = 0;
            return -1;
        }
        
        if (a[0] == target) {
            int targetCounter = counter;
            counter = 0;
            return targetCounter;
        } 

        counter++;
        return linSearchR(subarray(a, 1), target);
    }

    public static int freq(int[] a, int target) {
        int freqCounter = 0;
        for (int x : a) {
            if (x == target) {
                freqCounter++;
            }
        }
        return freqCounter;
    }

    public static int freqRec(int[]a, int target) {
        if (linSearch(a, target) == -1) {
            int freqCounter = counter;
            counter = 0;
            return freqCounter;
        }

        counter++;
        return freqRec(subarray(a, linSearch(a, target) + 1), target);
    }

//creates an array starting from the given index of input a, and ending at the last index of input a
//was meant to match substring in that when given an starting index of 0, subarray returns the original array
    public static int[] subarray(int[] a, int index) {
        int[] array = new int[a.length - index];

        for(int x = 0; index < a.length; x++) {
            array[x] = a[index];
            index++;
        }
        return array;
    }
    public static void main(String args[]) {
        int[] a = new int[5];
        randomIntArray(a);
        System.out.println(printArray(a));

        int[] b = {0, 1, 2, 3, 4, 5};
        System.out.println("linSearch: " + linSearch(b, 4)); //expected 4
        System.out.println("linSearch: " + linSearch(b, 7)); //expected -1
        System.out.println("linSearchR: " + linSearchR(b, 2)); //expected 2
        System.out.println("linSearchR: " + linSearchR(b, 6)); //expected -1
        
        int[] c = {1, 2, 2, 3, 3, 3};
        System.out.println("freq: " + freq(c, 2)); //expected 2
        System.out.println("freq: " + freq(c, 8)); //expected 0
        System.out.println("freqR: " + freqRec(c, 3)); //expected 3
        System.out.println("freqR: " + freqRec(c, 7)); //expected 0
    }
}
