/********************************************
*	AUTHOR:	<name>
* COLLABORATORS: <names>
*	COURSE:	CS 111 Intro to CS I - Java
*	LAST MODIFIED: <date>
********************************************/

/********************************************
*	ArrayMethods
*********************************************
*	PROGRAM DESCRIPTION:
*	Collection of useful methods for int arrays.
*********************************************
*	ALGORITHM:
*	TODO: <Pseudocode for selection sort here>
*********************************************

/* UML CLASS DIAGRAM:
-----------------------------------------
ArrayMethods
-----------------------------------------
-----------------------------------------
+ arrayString(array : int[]) : String //static
+ swap(array : int[], a : int, b : int) : void //static
+ indexOfMin(array : int[], startIndex : int) : int //static
+ reverse(array : int[]) : void //static
+ selectionSort(array : int[]) : void //static
-----------------------------------------
*/

public class ArrayMethods
{
  /**DESCRIPTION: */
  // { 12, 16, 26, 42, 53, 77, 84 }
  public static String arrayString(int[] a)
  {
    String contents = "{ ";

    for (int i = 0; i < a.length; i++)
    {
      contents += a[i];
      if (i < a.length - 1) {
        contents += ", ";

        }
      else {
        contents += " ";
      }
    }
    contents += "}";

    return contents; //STUB to keep compiler happy
  }

  /**DESCRIPTION: */
  public static void swap(int[] array, int a, int b)
  {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }
	
	/**DESCRIPTION: */
  public static int indexOfMin(int[] array, int startIndex)
  {
    int minIndex = startIndex;

    for (int i = startIndex; i < array.length; i++) {
      if (array[i] < array[minIndex]) {
        minIndex = i;
      }
    }
    return minIndex; //STUB to keep compiler happy
  }

	/**DESCRIPTION: */
  public static void reverse(int[] array)
  {
    /*
    for(int i = 0; i < array.length / 2; i++) {
      swap(i, array.length - 1 - i);
    }
     */
  }

	/**DESCRIPTION: */
  public static void selectionSort(int[] array)
  {
    /*



     */
  }

}
