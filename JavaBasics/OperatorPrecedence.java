public class OperatorPrecedence {
 public static void main(String[] args) {
    int result1 = 10 + 5 * 2;
    int result2 = (10 + 5) * 2;
    int result3 = 10 - 5 + 2 * 3;
    int result4 = 10 / 2 * 3 - 1;
    
    System.out.println("Result 1 (10 + 5 * 2): " + result1); // 20
    System.out.println("Result 2 ((10 + 5) * 2): " + result2);  // 30
    System.out.println("Result 3 (10 - 5 + 2 * 3): " + result3); // 11
    System.out.println("Result 4 (10 / 2 * 3 - 1): " + result4); // 14  
 }   
}
