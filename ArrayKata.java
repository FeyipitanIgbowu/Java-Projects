import java.util.Arrays;
public class ArrayKata {
   
 public static int maximumInt(int [] ArrayOfIntegers) {
   int largest = ArrayOfIntegers[0];
     for(int i = 0; i < ArrayOfIntegers.length; i++) {
   	 if(ArrayOfIntegers[i] > largest) {
   	 	largest = ArrayOfIntegers[i];
   }
    }
   return largest;	
  }
  
  public static int minimumIn(int[] ArrayOfIntegers) {
    int smallest = ArrayOfIntegers[0];
    for(int i = 0; i < ArrayOfIntegers.length; i++) {
       if(ArrayOfIntegers[i] < smallest) {
          smallest = ArrayOfIntegers[i];
      }
   }
   return smallest;
   }
    
public static int sumOf(int[] ArrayOfIntegers) {
  int sum = 0;
  for(int i = 0; i < ArrayOfIntegers.length; i++) {
      sum += ArrayOfIntegers[i];
    }
   return sum;
      }
     
 public static int sumOfEvenNumbersIn(int[] ArrayOfIntegers) {
   int sumOfEven = 0;
    for (int i = 0; i < ArrayOfIntegers.length; i++) {
      if( ArrayOfIntegers[i] % 2 == 0) {
        sumOfEven+= ArrayOfIntegers[i];
     }
     }
    return sumOfEven;
    }
  
  public static int sumOfOddNumbersIn(int[] ArrayOfIntegers) {
   int sumOfOdd = 0;
    for (int i = 0; i < ArrayOfIntegers.length; i++) {
      if( ArrayOfIntegers[i] % 2 != 0) {
        sumOfOdd+= ArrayOfIntegers[i];
     }
     }
    return sumOfOdd;
    }

  public static int[]  maximumAndMinimumOf(int [] ArrayOfIntegers) {
   int smallest = ArrayOfIntegers[0];
   int largest = ArrayOfIntegers[0];
     for(int i = 0; i < ArrayOfIntegers.length; i++) {
       if(ArrayOfIntegers[i] < smallest) {
          smallest = ArrayOfIntegers[i];
          }
      if(ArrayOfIntegers[i] > largest) {
          largest =ArrayOfIntegers[i];
    }
  }
    int largestAndSmallest [] =new int[] {smallest, largest};
    return largestAndSmallest;
  }
       
  public static int noOfOddNumbersIn(int [] ArrayOfIntegers) {
   int oddNumber = 0;
    for(int i =0; i < ArrayOfIntegers.length; i++) {
      if( ArrayOfIntegers[i] % 2 != 0) {
         oddNumber++;
        }
     }
   return oddNumber;
   }
   
    public static int noOfEvenNumbersIn(int [] ArrayOfIntegers) {
   int evenNumber = 0;
    for(int i =0; i < ArrayOfIntegers.length; i++) {
      if( ArrayOfIntegers[i] % 2 == 0) {
         evenNumber++;
        }
     }
   return evenNumber;
   }

  public static int[] evenNumbersIn(int [] ArrayOfIntegers) {
  int[] even = new int[ArrayOfIntegers.length];
    int j = 0;
    for(int i =0; i < ArrayOfIntegers.length; i++) {
      if( ArrayOfIntegers[i] % 2 == 0) {
          even[j] = ArrayOfIntegers[i];
           j++;
       }
       }
      return even;
      }
      
  public static int[] oddNumbersIn(int [] ArrayOfIntegers) {
  int[] odd = new int[ArrayOfIntegers.length];
   int j = 0;
    for(int i =0; i < ArrayOfIntegers.length; i++) {
      if( ArrayOfIntegers[i] % 2 != 0) {
           odd[j] = ArrayOfIntegers[i];
             j++;
             
       }
       }
     
      return odd;
      }

  
  

public static void main(String... feyi) {
   int number [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int largest = maximumInt(number);
      System.out.println("The largest number is : " + largest);
      
     int smallest = minimumIn(number);
       System.out.println("The smallest number is : " + smallest);
       
     int sum = sumOf(number);
       System.out.println("The Sum is: " + sum);
       
     int sumOfEven = sumOfEvenNumbersIn(number);
       System.out.println("The Sum of Even Numbers is : " + sumOfEven);
      
     int sumOfOdd = sumOfOddNumbersIn(number);
       System.out.println("The Sum of Odd Numbers is : " + sumOfOdd);

    int largestAndSmallest [] = maximumAndMinimumOf(number);
        System.out.println("The Minimum and Maximum Numbers are: " + Arrays.toString(largestAndSmallest));
        
    int oddNumber = noOfOddNumbersIn (number);
       System.out.println("The Number Of Odd Numbers Is: " + oddNumber);
    
    int evenNumber = noOfEvenNumbersIn (number);
       System.out.println("The Number Of Even Numbers Is: " + evenNumber);
    
    int evenNumberArray [] = evenNumbersIn(number);
       System.out.println("The Even Number is : " + Arrays.toString(evenNumberArray));
    
     int oddNumberArray [] = oddNumbersIn(number);
       System.out.println("The Odd Number is : " + Arrays.toString(oddNumberArray));
    


  }
  
   }