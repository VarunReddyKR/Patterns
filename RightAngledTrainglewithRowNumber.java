/* 

Pattern:
1
22
333
4444
55555

*/
// 0(n2)
class Main {
    static void patternPrinter(int numOfRows){
        for (int i=1; i<=numOfRows; i++){ // O(n)
            for (int j=1; j<=i; j++){ // O(n)
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patternPrinter(5);
    }
}