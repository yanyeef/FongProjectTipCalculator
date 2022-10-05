import java. util.Scanner;
import java.text.DecimalFormat;
public class TipCal {
    public static void main(String[] args)
    {
        //object Scan is created from class Scanner
        Scanner Scan = new Scanner(System.in);
        System.out.print("What is the total bill(Ex: 10.00): $");
        double  totalBill = Scan.nextDouble(); //user input for bill

        System.out.print("What is the tip percent without percent(Ex:20): ");
        int tipPercent = Scan.nextInt(); //user input for tip percent


        System.out.print("Total amount of people: ");
        int numOfPeople = Scan.nextInt(); // user input for num of people

        //variables
        double Percentage = tipPercent/100.00;
        double totalTipAmount = totalBill* Percentage;
        double tipPerPerson = totalTipAmount/numOfPeople;
        double billPerPerson = totalBill/numOfPeople;
        double total = totalBill + totalTipAmount;
        double totalPerPerson = billPerPerson + tipPerPerson;

        //object decFormat is created from the class DecimalFormat
        DecimalFormat decFormat = new DecimalFormat("\u00a4#,##0.00");

        //prints out things
        System.out.println("Tip Amount= $" + (decFormat.format(totalTipAmount)));
        System.out.println("Tip Per Person = $" + (decFormat.format(tipPerPerson)));
        System.out.println( "Total Per Person = $"+ (decFormat.format(totalPerPerson)));
        System.out.println("Total bill including tip = $ " + (decFormat.format(total)));

    }
}
