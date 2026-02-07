class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int square(int num) {
        return num * num;
    }
}

public class IT25102270Q5 {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        int part1 = myCalc.multiply(3, 4);
        int part2 = myCalc.multiply(5, 7);
        int sum1 = myCalc.add(part1, part2);
        int result1 = myCalc.square(sum1);
        System.out.println("Result of (3*4 + 5*7)^2 = " + result1);
		
        System.out.println();
		
        int sumA = myCalc.add(4, 7);
        int sumB = myCalc.add(8, 3);
        int squareA = myCalc.square(sumA);
        int squareB = myCalc.square(sumB);
        int result2 = myCalc.add(squareA, squareB);
        System.out.println("Result of (4+7)^2 + (8+3)^2 = " + result2);
    }
}
