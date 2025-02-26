/*

Pattern:
*
**
***
****
*****
******
*****
****
***
**
*

*/

class Main {
    static void patternPrinter(int numOfRows) {
        // Upper part (increasing stars)
        for (int i = 0; i < numOfRows; i++) { // Print from 1 to numOfRows
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part (decreasing stars)
        for (int i = numOfRows - 1; i > 0; i--) { // Print from numOfRows-1 to 1
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patternPrinter(6); // Adjust this value for different sizes
    }
}
