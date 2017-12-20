package com.mkyong.utils.print;

import java.util.Arrays;

public class Arrays {
  // can you remember how to set up your main function?
  public static void main(String[] args) {
    // declare an array of Strings and print it
    // String[] myStringArray = new String[]{"a","b","c"};
    // System.out.println(Arrays.toString(myStringArray));
    // array
    String[] arrayStr = new String[]{"Java", "Node", "Python", "Ruby"};
    System.out.println(Arrays.toString(arrayStr));
    // Output : [Java, Node, Python, Ruby]

    int[] arrayInt = {1, 3, 5, 7, 9};
    System.out.println(Arrays.toString(arrayInt));
    // Output : [1, 3, 5, 7, 9]

    // 2d array, need Arrays.deepToString
    String[][] deepArrayStr = new String[][]{{"mkyong1", "mkyong2"}, {"mkyong3", "mkyong4"}};
    System.out.println(Arrays.toString(deepArrayStr));
    // Output : [[Ljava.lang.String;@23fc625e, [Ljava.lang.String;@3f99bd52]

    System.out.println(Arrays.deepToString(deepArrayStr));
    // Output : [[mkyong1, mkyong2], [mkyong3, mkyong4]

    int[][] deepArrayInt = new int[][]{{1, 3, 5, 7, 9}, {2, 4, 6, 8, 10}};
    System.out.println(Arrays.toString(deepArrayInt));
    // Output : [[I@3a71f4dd, [I@7adf9f5f]

    System.out.println(Arrays.deepToString(deepArrayInt));
    // Output : [[1, 3, 5, 7, 9], [2, 4, 6, 8, 10]]
  }
}



// declare an array of integers and print it

// declare an ArrayList of integers, add numbers to it, and then print it
