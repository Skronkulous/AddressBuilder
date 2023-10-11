package com.pluralsight;
import java.util.*;
import java.util.regex.Pattern;

public class AddressBuilder {
    public static void main(String[] args) {
        StringBuilder billingInfo = new StringBuilder();
        String appendedInfo;
        Scanner kbScanner = new Scanner(System.in);

        System.out.println("Please provide the following information: ");
        System.out.print("Full Name: ");
        billingInfo.append(kbScanner.nextLine() + "|");
        System.out.println("");
        System.out.print("Billing Street: ");
        billingInfo.append(kbScanner.nextLine() + "|");
        System.out.print("Billing City: ");
        billingInfo.append(kbScanner.nextLine() + "|");
        System.out.print("Billing State: ");
        billingInfo.append(kbScanner.nextLine() + "|");
        System.out.print("Billing Zip: ");
        billingInfo.append(kbScanner.nextLine() + "|");
        System.out.println("");
        System.out.print("Shipping Street: ");
        billingInfo.append(kbScanner.nextLine() + "|");
        System.out.print("Shipping City: ");
        billingInfo.append(kbScanner.nextLine() + "|");
        System.out.print("Shipping State: ");
        billingInfo.append(kbScanner.nextLine() + "|");
        System.out.print("Shipping Zip: ");
        billingInfo.append(kbScanner.nextLine() + "|");

        appendedInfo = billingInfo.toString();
        String[] infoSplit = appendedInfo.split(Pattern.quote("|"));

        System.out.println("\n" + infoSplit[0] + "\n\nBilling Address:\n" + infoSplit[1] + "\n" + infoSplit[2] + ", " + infoSplit[3] + " " + infoSplit[4] + "\n\nShipping Address:\n" + infoSplit[5] + "\n" + infoSplit[6] + ", " + infoSplit[7] + " " + infoSplit[8]);


    }
}
