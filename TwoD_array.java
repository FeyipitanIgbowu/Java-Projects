import java.util.Arrays;

public class TwoD_array {
    public static void main(String... feyi) {
        int[][] array = {{50, 10}, {7, 9}, {40, 10}};
        int smallest = array[0][0];
        int largest = array[0][0];

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                int number = array[row][column];

                if (number < smallest) {
                    smallest = number;
                }

                if (number > largest) {
                    largest = number;
                }
            }

            // System.out.println(Arrays.toString(array[row]));
        }

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}
