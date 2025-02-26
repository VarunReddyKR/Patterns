/*
Pattern:
*****
****
***
**
*
*/

class Main {
    static void reversePatternPrinter(int numOfRows) {
        for (int i = numOfRows; i > 0; i--) { // Start from numOfRows and decrement
            for (int j = 1; j <= i; j++) { // Print numbers from 1 to i
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        reversePatternPrinter(5);
    }
}
