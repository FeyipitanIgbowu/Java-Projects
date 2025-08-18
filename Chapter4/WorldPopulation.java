public class WorldPopulation {
 public static void main(String... feyi) {
 
 double worldPopulation = 8100000000.0;
 double growthRate = 0.0085;
   
  System.out.printf("Year	Population	Increase");
  
 for(int year = 1; year < 76; year++) {
 	 double increase = worldPopulation * growthRate;
 	 double newPopulation = worldPopulation +  increase;
 	 
 	  System.out.printf("%d %.1f %.1f%n", year, newPopulation, increase);
 	 
 	 worldPopulation = newPopulation;
 	}
 }
 }





























