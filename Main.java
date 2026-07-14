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

  }
}