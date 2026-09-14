public class Main{
    public static void main(String[] args) {
        Date d = new Date();
        int choice;
            System.out.println();
            System.out.println("================================");
            System.out.println("                      Date Menu      ");
            System.out.println("================================");
            System.out.println("1. Set Date");
            System.out.println("2. Add Days");
            System.out.println("3. Add Months");
            System.out.println("4. Add Years");
            System.out.println("5. Display");
            System.out.println("6. Compare Dates (not implement)");
            System.out.println("7. Exit");
            System.out.println("================================");
            System.out.println("Enter your choice : ");
            choice = ConsoleInput.getInteger();
            switch (choice) {
                case 1:
                    System.out.println("Enter Day : ");
                    int day = ConsoleInput.getInteger();
                    System.out.println("Enter Month : ");
                    int month = ConsoleInput.getInteger();
                    System.out.println("Enter Year : ");
                    int year = ConsoleInput.getInteger();
                    d.setDate(day, month, year);
                    System.out.println("Date set successfully.");
                    break;
                case 2:
                    System.out.println("Enter number of days : ");
                    int days = ConsoleInput.getInteger();
                    d.addDays(days);
                    System.out.println("Days added successfully.");
                    break;
                case 3:
                    System.out.println("Enter number of months : ");
                    int months = ConsoleInput.getInteger();
                    d.addMonths(months);
                    System.out.println("Months added successfully.");
                    break;
                case 4:
                    System.out.println("Enter number of years : ");
                    int years = ConsoleInput.getInteger();
                    d.addYears(years);
                    System.out.println("Years added successfully.");
                    break;
                case 5:
                    d.display();
                    break;
                case 6:
                    System.out.println( "Compare Dates is not implemented.");
                    break;
                case 7:
                    System.out.println("Program Ended.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } 
    }
