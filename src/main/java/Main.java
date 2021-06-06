import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        String curNum = scanner.nextLine();
        int theCurNum = Integer.parseInt(curNum);
        int i = 1;
        int theArray[] = new int[100000];
        theArray[0] = theCurNum;
        while (!curNum.equals("done")) {
            System.out.println("Enter a number:");
            curNum = scanner.nextLine();
            if(!curNum.equals("done")) {
                theCurNum = Integer.parseInt(curNum);
                theArray[i] = theCurNum;
                i++;
            }
        }
        System.out.print("Numbers: ");
        int average = 0;
        int max = theArray[0];
        int min = theArray[0];
        double standardDeviation = 0;
        for(int j = 0; j < i; j++)
        {
            if(j == i -1)
            {
            System.out.print(theArray[j]);
            }
            else
            {
                System.out.print(theArray[j] + ", ");
            }
            if(theArray[j] > max)
            {
                max = theArray[j];
            }
            if(theArray[j] < min)
            {
                min = theArray[j];
            }
            average = average + theArray[j];
        }
        average = average/i;
        for(double num: theArray) {
            standardDeviation = standardDeviation + Math.pow(num - average, 2);
        }
        standardDeviation = Math.sqrt(standardDeviation/i);
        System.out.println("\nThe average is " + average + ".");
        System.out.println("The minimum is " + min + ".");
        System.out.println("The maximum is " + max + ".");
        System.out.println("The standard deviation is " + standardDeviation + ".");
    }
}