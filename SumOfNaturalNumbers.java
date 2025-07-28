public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int i = 1;
        int j = 0;

        while (i <= 10) {
            j = j + i;
            i++;
        }        

        System.out.println("The sum of the first 10 natural numbers is: " + j);
    }
}
