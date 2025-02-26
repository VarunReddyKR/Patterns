/* 

Pattern:
*
**
***
****
*****

*/
// 0(n2)
class Main {
    static void patternPrinter(int numOfRows){
        for (int i=0; i<numOfRows; i++){ // O(n)
            for (int j=0; j<=i; j++){ // O(n)
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patternPrinter(5,5);
    }
}