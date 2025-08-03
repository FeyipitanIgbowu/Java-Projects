public class arraySecondLargest {
public static void main(String... feyi) {
 
 int[] array =  {10, 2, 4, 15, 14, 21};
 int largest = 0;
 int second_largest = 0;
 
 for (int count = 0; count < array.length; count++) {
 	if (array[count] > largest) {
 	 largest = array[count];
 	}

 }
 
 for (int counter = 0; counter < array.length; counter++) {
 	if (largest == array[counter]) {
 	 continue;
 	 }
 	if (array[counter] > second_largest) {
 	 second_largest = array[counter];
 
 }
 System.out.println(second_largest);
 }
 
 }
 }