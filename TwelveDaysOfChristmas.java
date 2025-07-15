public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
        for (int day = 1; day <= 12; day++) {
           
            System.out.print("On the ");
            switch (day) {
                case 1 -> System.out.print("first");
                case 2 -> System.out.print("second");
                case 3 -> System.out.print("third");
                case 4 -> System.out.print("fourth");
                case 5 -> System.out.print("fifth");
                case 6 -> System.out.print("sixth");
                case 7 -> System.out.print("seventh");
                case 8 -> System.out.print("eighth");
                case 9 -> System.out.print("ninth");
                case 10 -> System.out.print("tenth");
                case 11 -> System.out.print("eleventh");
                case 12 -> System.out.print("twelfth");
            }
            System.out.println(" day of Christmas, my true love gave to me:");


            switch (day) {
                case 12 -> System.out.println("Twelve drummers drumming,");
                case 11 -> System.out.println("Eleven pipers piping,");
                case 10 -> System.out.println("Ten lords a-leaping,");
                case 9 -> System.out.println("Nine ladies dancing,");
                case 8 -> System.out.println("Eight maids a-milking,");
                case 7 -> System.out.println("Seven swans a-swimming,");
                case 6 -> System.out.println("Six geese a-laying,");
                case 5 -> System.out.println("Five golden rings,");
                case 4 -> System.out.println("Four calling birds,");
                case 3 -> System.out.println("Three French hens,");
                case 2 -> System.out.println("Two turtle doves,");
                case 1 -> {
                    if (day == 1)
                        System.out.println("A partridge in a pear tree.");
                    else
                        System.out.println("And a partridge in a pear tree.");
                }
            }
        }
    }
}
