/*

Pattern:
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *

*/

class Main {
    static void patternPrinter(int numOfRows) {
        for(int i = 0; i < numOfRows; i++){
            for (int space=0 ; space < numOfRows-i-1 ; space++){
                System.out.print(" ");
                    }

            for(int j = 0; j< 2 * i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < numOfRows; i++) {
            // Print leading spaces for centering
            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }
            // Print '*' characters in decreasing order
            for (int j = 0; j < (2 * (numOfRows - i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        patternPrinter(5);
    }
}
