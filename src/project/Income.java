package project;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Income {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double income = 0;

        do {
            System.out.println(" Enter Taxable Income ( or -1 to end ) : ");
            double taxPayableAmount = sc.nextDouble();

            if (taxPayableAmount == -1) {
                break;
            }
            income += taxPayableAmount;
        }
        while (income != -1);
        /*DecimalFormat decimalFormat1 = new DecimalFormat();
        System.out.println("Total Taxable Income: " + decimalFormat1.format(income));
        System.out.println("Total Tax Payable: " + decimalFormat1.format(taxPayable(income)));*/
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        System.out.println("Total Taxable Income: " + numberFormat.format(income));
        System.out.println("Total Tax Payable: " + numberFormat.format(taxPayable(income)));
    }
    public static double taxPayable(double income) {
        if (income <= 200000)
            return 0;
        else if (income > 200000 && income <= 500000)
            return (income - 200000) * .2;
        else if (income > 500000 && income <= 750000)
            return ((income - 500000) * .25) + 50000;
        else if (income > 750000 && income <= 1000000)
            return ((income - 750000) * .30) + 750000;
        else
            return ((income - 1000000) * .35) + 100000;
    }
}

