import java.util.Scanner;

public class SmallLargeArray {

    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

          int largest = 1;
          int smallest = 1;

             System.out.println("Please enter the array length: ");

         final int[] numOfArr = new int[SCANNER.nextInt()];

             System.out.println("Please enter the array values: ");

        for (int i = 0; i < numOfArr.length; i++) {

             numOfArr[i] = SCANNER.nextInt();
        }

        for (int i = 0; i < numOfArr.length; i++) {

            if (numOfArr[i] > largest) {
                largest = numOfArr[i];
            }
        }
             System.out.println("The Largest number in the array is: " + largest);

        for (int i = 0; i < numOfArr.length; i++) {
             if (numOfArr[i] < smallest) {
                 smallest = numOfArr[i];
            }
        }
             System.out.println("The smallest number in the array is: " + smallest);

    }
}








