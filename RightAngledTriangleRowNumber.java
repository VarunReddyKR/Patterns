/* 

Pattern:
1
12
123
1234
12345

*/
// 0(n2)
class Main {
    static void patternPrinter(int numOfRows, int numOfCols){
        for (int i=1; i<=numOfRows; i++){ // O(n)
            for (int j=1; j<=i; j++){ // O(n)
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patternPrinter(5,5);
    }
}