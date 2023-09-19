public class ParameterMystery_3 {
    public static void main(String[] args) {
        int x = 9;
        int y = 2;
        int z = 5;

        mystery(z, y, 27);

        mystery(19, x, z);

        System.out.println(x + " " + y + " " + z);
    }

    public static void mystery(int x, int z, int y) {
        x++; z--; y++;
        System.out.println(z + " and " + (y - x));
    }
}