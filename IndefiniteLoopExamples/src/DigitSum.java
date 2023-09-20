public class DigitSum {
    public static void main(String[] args) {
        int number = 29107;
        System.out.println("Number: " + number);
        System.out.println("Sum: " + digitSum(number)); // should return 19 (2+9+1+0+7)
        System.out.println("Min: " + digitMin(number)); // should return 0
        number = -456;
        System.out.println("Number: " + number);
        System.out.println("Sum: " + digitSum(number)); // should return 15 (4+5+6)
        System.out.println("Min: " + digitMin(number)); // should return 4
    }

    public static int digitSum(int num) {
        if (num == 0) return 0; // handle trivial solution
        if (num < 0) num *= -1; //make it a positive integer
        int sum = 0;    // initialize sum at zero (the default prior to summing any digits)

       // do stuff here to figure out the sum

        return sum;
    }

    public static int digitMin(int num) {
        if (num == 0) return 0; // handle trivial solution
        if (num < 0) num *= -1; //make it a positive integer
        int min = 9; //initialize with the highest possible digit (default or worst case when looking for a minimum)

        // do stuff here to figure out the minimum digit

        return min;
    }
}