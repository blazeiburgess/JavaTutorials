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
    startTime = System.currentTimeMilis();
    testAlgo2.quickSort(0, testAlgo2.itemsInArray);
    endTime = System.currentTimeMilis();
    System.out.println("Quick Sort of 100,000 items took " + (endTime - startTime));

    startTime = System.currentTimeMilis();
    testAlgo3.quickSort(0, testAlgo2.itemsInArray);
    endTime = System.currentTimeMilis();
    System.out.println("Quick Sort of 200,000 items took " + (endTime - startTime));

    startTime = System.currentTimeMilis();
    testAlgo4.quickSort(0, testAlgo2.itemsInArray);
    endTime = System.currentTimeMilis();
    System.out.println("Quick Sort of 300,000 items took " + (endTime - startTime));
  }
} 
