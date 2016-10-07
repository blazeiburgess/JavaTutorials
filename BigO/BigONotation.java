// Big O measures how algorithms scale as data load increases. This is often
// misconstrued as being a measure of speed.
//
// Full coverage of Big O would include covering more specific ways of analyzing
// algorithms as data size scale, but this will be simple and general
//
// Code and notes derived from:
// http://www.newthinktank.com/2013/03/big-o-notations/

public class BigONotation {
  private int[] theArray;
  private int arraySize;
  private int itemsInArray = 0;
  static long startTime;
  static long endTime;
  public static void main (String[] args) {
    /*
     *  Basic structure:
     *
     *  Test BigONotation testAlgo = new BigONotation(10);
     *  testAlgo.addItemToArray(10);
     *  System.out.println(Arrays.toString(testAlgo.theArray));
     */

    BigONotation testAlgo2 = new BigONotation(100000);
    testAlgo2.generateRandomArray();

    BigONotation testAlgo3 = new BigONotation(200000);
    testAlgo3.generateRandomArray();

    BigONotation testAlgo4 = new BigONotation(300000);
    testAlgo4.generateRandomArray();

    BigONotation testAlgo5 = new BigONotation(400000);
    testAlgo5.generateRandomArray();

    // tests `O(n log n)`
    startTime = System.currentTimeMillis();
    testAlgo2.quickSort(0, testAlgo2.itemsInArray);
    endTime = System.currentTimeMillis();
    System.out.println("Quick Sort of 100,000 items took " + (endTime - startTime));

    startTime = System.currentTimeMillis();
    testAlgo3.quickSort(0, testAlgo2.itemsInArray);
    endTime = System.currentTimeMillis();
    System.out.println("Quick Sort of 200,000 items took " + (endTime - startTime));

    startTime = System.currentTimeMillis();
    testAlgo4.quickSort(0, testAlgo2.itemsInArray);
    endTime = System.currentTimeMillis();
    System.out.println("Quick Sort of 300,000 items took " + (endTime - startTime));
  }

  public void addItemToArray(int newItem) {
    theArray[itemsInArray++] = newItem;
  }

  public void quickSort(int left, int right) {
    if (right - left <= 0) {
      return;
    } else {
      int pivot = theArray[right];
      int pivotLoc = partitionArray(left, right, pivot);
      quickSort(left, pivotLoc - 1);
      quickSort(pivotLoc + 1, right);
    }
  }

  public int partitionArray(int left, int right, int pivot) {
    int leftPointer = left - 1;
    int rightPointer = right;
    while (true) {
      if (leftPointer >= rightPointer) {
	break;
      }	else {
	swapValues(leftPointer, rightPointer);
	return leftPointer;
      }
    }
  }

  BigONotation(int size) {
    arraySize = size;
    theArray = new int[size];
  }
} 
