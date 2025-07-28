import java.util.Scanner;

public class Nokia1 {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        String menu = """

                            Welcome to Your Nokia Phone  
                            Menu

                             1 -> Phonebook;
                             2 -> Messages; 
                             3 -> Chat;
                             4 -> Call Register;
                             5 -> Tones;
                             6 -> Settings;
                             7 -> Call Divert;
                             8 -> Games;
                             9 -> Calculator;
                            10 -> Reminders;
                            11 -> Clock;
                            12 -> Profiles;
                            13 -> SIM Services;
                            
        """;

        
        while (true) {
    System.out.println(menu);
    int menu1 = input.nextInt();

    if (menu1 == 0) {
        System.out.println("Exiting Nokia... Goodbye!");
        break;
    }


        switch (menu1) {
            
            case 1: System.out.println("""
                        Phonebook Menu:
                            1 -> Search
                            2 -> Service nos
                            3 -> Add name
                            4 -> Erase
                            5 -> Edit
                            6 -> Assign tone
                            7 -> Send b'card
                            8 -> Options
                            9 -> Speed dials
                           10 -> Voice tags
                        """);
                          int phonebookMenu = input.nextInt();
                 switch (phonebookMenu) {
                         case 1 -> System.out.println("Search");
                         case 2 -> System.out.println("Service Nos");
                         case 3 -> System.out.println("Add name");
                         case 4 -> System.out.println("Erase");
                         case 5 -> System.out.println("Edit");
                         case 6 -> System.out.println("Assign Tone");
                         case 7 -> System.out.println("Send b'card");
                         case 8 -> {
                             System.out.println("Options:");
                             System.out.println("""
                                1 -> Type of view
                                2 -> Memory status
                                """);
                        int options = input.nextInt();
                    }
                    case 9 -> System.out.println("Speed dials");
                    case 10 -> System.out.println("Voice tags");
                    default -> System.out.println("Invalid Phonebook Option.");
                }
                break;

            case 2:
                System.out.println("""
                        Message Menu:
                        1 -> Write Messages
                        2 -> Inbox
                        3 -> Outbox
                        4 -> Picture messages
                        5 -> Templates
                        6 -> Smileys
                        7 -> Message Settings
                        8 -> Info service
                        9 -> Voice mailbox number
                       10 -> Service command editor
                        """);
                        
                int messageMenu = input.nextInt();
                switch (messageMenu) {
                    case 1 -> System.out.println("Write Messages");
                    case 2 -> System.out.println("Inbox");
                    case 3 -> System.out.println("Outbox");
                    case 4 -> System.out.println("Picture Messages");
                    case 5 -> System.out.println("Template");
                    case 6 -> System.out.println("Smileys");
                    case 7 -> {
                        System.out.println("Message Settings:");
                        System.out.println("""
                                1 -> Set1
                                2 -> Common
                                """);
                        int set1 = input.nextInt();
                        switch (set1) {
                            case 1 -> System.out.println("Message centre number");
                            case 2 -> System.out.println("Message sent as");
                            case 3 -> System.out.println("Message validity");
                            default -> System.out.println("Invalid selection");
                        }
                    }
                              }
                break;

            case 3: System.out.println("Chat"); break;

            case 4: System.out.println("""
                        Call Register:
                        1 -> Missed calls
                        2 -> Received calls
                        3 -> Dialled numbers
                        4 -> Erase recent call lists
                        5 -> Show call duration
                        6 -> Show call costs
                        7 -> Call cost settings
                        8 -> Prepaid credit
                        """);
                int callRegister = input.nextInt();
                
                switch (callRegister) {
                    case 1 -> System.out.println("Missed calls");
                    case 2 -> System.out.println("Received calls");
                    case 3 -> System.out.println("Dialled numbers");
                    case 4 -> System.out.println("Erase recent call lists");
                    case 5 -> {
                        System.out.println("Show call duration:");
                        System.out.println("""
                                1 -> Last call duration
                                2 -> All calls' duration
                                3 -> Received calls' duration
                                4 -> Dialled calls'
                                5 -> Clear timers
                                """);
                        int callDuration = input.nextInt();
                    }
                    case 6 -> {
                        System.out.println("Show call costs:");
                        System.out.println("""
                                1 -> Last call costs
                                2 -> All calls' cost
                                3 -> Clear counters
                                """);
                        int callCost = input.nextInt();
                    }
                    case 7 -> {
                        System.out.println("Call cost settings:");
                        System.out.println("""
                                1 -> Call cost limit
                                2 -> Show costs in
                                """);
                        int setting = input.nextInt();
                    }
                    case 8 -> System.out.println("Prepaid credit");
                    default -> System.out.println("Invalid selection");
                }
                break;

            case 5: System.out.println("""
                        Tones:
                        1 -> Ringing Tone
                        2 -> Ringing volume
                        3 -> Incoming call alert
                        4 -> Composer
                        5 -> Message alert tones
                        6 -> Keypad tones
                        7 -> Warning and game tones
                        8 -> Vibrating alert
                        9 -> Screen saver
                        """);
                int tones = input.nextInt();
                break;

            case 6: System.out.println("""
                        Settings:
                        1 -> Call settings
                        2 -> Phone settings
                        3 -> Security settings
                        4 -> Restore factory settings
                        """);
                int settings = input.nextInt();
                switch (settings) {
                    case 1 -> {
                        System.out.println("Call settings:");
                        System.out.println("""
                                1 -> Automatic redial
                                2 -> Speed dialling
                                3 -> Call waiting options
                                4 -> Own number sending
                                5 -> Phone line in use
                                6 -> Automatic answer
                                """);
                        int callSetting = input.nextInt();
                    }
                    case 2 -> {
                        System.out.println("Phone settings:");
                        System.out.println("""
                                1 -> Language
                                2 -> Cell info display
                                3 -> Welcome note
                                4 -> Network selection
                                5 -> Lights
                                6 -> Confirm SIM service actions
                                """);
                        int phoneSettings = input.nextInt();
                    }
                    case 3 -> {
                        System.out.println("Security settings:");
                        System.out.println("""
                                1 -> PIN code request
                                2 -> Call barring service
                                3 -> Fixed dialling
                                4 -> Closed user group
                                5 -> Phone security
                                6 -> Change access codes
                                """);
                        int securitySetting = input.nextInt();
                    }
                    case 4 -> System.out.println("Restore factory settings");
                    default -> System.out.println("Invalid Settings Option");
                }
                break;

            case 7: System.out.println("Call divert"); break;
            case 8: System.out.println("Games"); break;
            case 9: System.out.println("Calculator"); break;
            case 10: System.out.println("Reminders"); break;
            case 11: System.out.println("""
                        Clock:
                        1 -> Alarm clock
                        2 -> Clock settings
                        3 -> Date setting
                        4 -> Stopwatch
                        5 -> Countdown timer
                        6 -> Auto update of date and time
                        """);
                int clock = input.nextInt();
                break;
            case 12: System.out.println("Profiles"); break;
            case 13: System.out.println("SIM service"); break;
            default: System.out.println("Invalid Selection"); break;
        }
        }
        }
}
