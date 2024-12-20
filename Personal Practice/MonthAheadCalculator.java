import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;
import java.util.GregorianCalendar;

public class MonthAheadCalculator {
    public static void main(String[] args) {
        
        System.out.print("Enter the day (e.g., 2024-01-01): ");
        String inputDay = new java.util.Scanner(System.in).nextLine();

       
        LocalDate inputDate = LocalDate.parse(inputDay);

        // Calculate the end date using the calculateEndDate method
        LocalDate endDate = calculateEndDate(inputDate);

        // Print the calculated end date
        System.out.println("Next 28 to 30 days: " + endDate);
    }

    private static LocalDate calculateEndDate(LocalDate inputDate) {
        // Create a MonthDay object from the input date
        MonthDay inputMonthDay = MonthDay.from(inputDate);

        // Determine the number of days to add based on the input day's month
        int daysToAdd = inputMonthDay.getMonth().maxLength();

        // Ensure the end date is within the desired range (28 to 30 days)
        if (daysToAdd > 30) {
            daysToAdd = 30;
        }

        // Calculate the end date by adding the determined number of days
        LocalDate endDate = inputDate.plus(daysToAdd, ChronoUnit.DAYS);

        return endDate;
    }

	/* 	private Scanner scanner;

    public static void main(String[] args) {
        MenstrualApp app = new MenstrualApp();
        
    }

    public void run() {
        LocalDate lastCycleDate = getLastCycleDate();
        int daysOfCycle = getDaysOfCycle();
        LocalDate nextCycleDate = calculateNextCycle(lastCycleDate, daysOfCycle);
        LocalDate ovulationPeriod = calculateOvulationPeriod(lastCycleDate, daysOfCycle);
        LocalDate fertilityStart = calculateFertilityStart(ovulationPeriod);

        printResults(lastCycleDate, nextCycleDate, ovulationPeriod, fertilityStart, daysOfCycle);
    }

    private LocalDate getLastCycleDate() {
        System.out.println("Enter Your Last Month Cycle (DD/MM/YYYY): ");
        String input = scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(input, formatter);
    }

    private int getDaysOfCycle() {
        System.out.println("Enter your cycle days: ");
        return scanner.nextInt();
    }

    private LocalDate calculateNextCycle(LocalDate lastCycleDate, int daysOfCycle) {
        return lastCycleDate.plusDays(daysOfCycle);
    }

    private LocalDate calculateOvulationPeriod(LocalDate lastCycleDate, int daysOfCycle) {
        return lastCycleDate.plusDays(daysOfCycle / 2);
    }

    private LocalDate calculateFertilityStart(LocalDate ovulationPeriod) {
        return ovulationPeriod.minusDays(3);
    }

    private void printResults(LocalDate lastCycleDate, LocalDate nextCycleDate, LocalDate ovulationPeriod, LocalDate fertilityStart, int daysOfCycle) {
        System.out.println("Your last cycle started on: " + lastCycleDate);
        System.out.println("Your next cycle starts on: " + nextCycleDate);
        System.out.println("Your ovulation period starts on: " + ovulationPeriod);
        System.out.println("Your fertility period starts on: " + fertilityStart + " and ends on: " + ovulationPeriod.plusDays(3));
        System.out.println("Your safe period starts on: " + ovulationPeriod.plusDays(4));
    }
}

	
	
	
	
	
	
	*/






}