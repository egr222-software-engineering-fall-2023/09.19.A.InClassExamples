public class Main {
    public static void main(String[] args) {
        int letter = 'a' + 2;
        System.out.println(letter);

        char letter1 = 'a' + 2;
        System.out.println(letter1);

        // The following line would produce an error because
        // an int (the default for the expression) cannot be assigned
        // to a String without an explicit cast.
//        String letter2 = 'a' + 2;
//        System.out.println(letter2);
    }
}