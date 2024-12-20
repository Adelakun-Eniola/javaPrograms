import java.util.Scanner;

public class SalesTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of salespeople: ");
        int numSalespeople = scanner.nextInt();

        
        int[] salesPeople = new int[numSalespeople];
        double[] salesAmounts = new double[numSalespeople];

        
        for (int i = 0; i < numSalespeople; i++) {
            salesPeople[i] = i + 1; 
            System.out.print("Enter sales amount for salesperson :  ");
            salesAmounts[i] = scanner.nextDouble();
        }

        
        double totalSales = 0;
        double maxSale = Double.MIN_VALUE;
        double minSale = Double.MAX_VALUE;
        int maxSalespersonId = 0;
        int minSalespersonId = 0;

        for (int i = 0; i < numSalespeople; i++) {
            totalSales += salesAmounts[i];
            if (salesAmounts[i] > maxSale) {
                maxSale = salesAmounts[i];
                maxSalespersonId = salesPeople[i];
            }
            if (salesAmounts[i] < minSale) {
                minSale = salesAmounts[i];
                minSalespersonId = salesPeople[i];
            }
        }

        double averageSale = totalSales / numSalespeople;

        
        System.out.println("Total Sales: $" + totalSales);
        System.out.println("Average Sale: $" + averageSale);
        System.out.println("Salesperson " + maxSalespersonId + " had the highest sale with $" + maxSale);
        System.out.println("Salesperson " + minSalespersonId + " had the lowest sale with $" + minSale);

        
        System.out.print("Enter a value: ");
        double targetValue = scanner.nextDouble();

        int numExceeding = 0;
        for (int i = 0; i < numSalespeople; i++) {
            if (salesAmounts[i] > targetValue) {
                System.out.println("Salesperson " + salesPeople[i] + " exceeded the target with $" + salesAmounts[i]);
                numExceeding++;
            }
        }

        System.out.println("Total number of salespeople exceeding the target: " + numExceeding);
    }
}