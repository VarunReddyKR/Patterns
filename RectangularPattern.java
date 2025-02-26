/*

Pattern:
*****
*****
*****
*****
*****

*/

// O(n2)
class Main {
    static void patternPrinter(int numOfRows, int numOfCols){
        for (int i=0; i<numOfRows; i++){ // O(n)
            for (int j=0; j<numOfCols; j++){
                System.out.print("*");  // O(n)
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        patternPrinter(5,5);
    }
}