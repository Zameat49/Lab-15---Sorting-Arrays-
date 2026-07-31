/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/
class Main 
{
  public static void main(String[] args) 
	{
        int[] numbers = { 12, 16, 26, 42, 53, 77, 84 };
        ArrayMethods.swap(numbers, 0, 6);
        int minIndex = ArrayMethods.indexOfMin(numbers, 0);
        System.out.println(ArrayMethods.arrayString(numbers));
        System.out.println("Min @ position: " + minIndex);

// Test reverse
        int[] numbersToReverse = { 42, 16, 84, 12, 77, 26, 53 };
        ArrayMethods.reverse(numbersToReverse);
        System.out.println(ArrayMethods.arrayString(numbersToReverse));

// Test selectionSort
        int[] numbersToSort = { 42, 16, 84, 12, 77, 26, 53 };
        ArrayMethods.selectionSort(numbersToSort);
        System.out.println(ArrayMethods.arrayString(numbersToSort));

  }
}