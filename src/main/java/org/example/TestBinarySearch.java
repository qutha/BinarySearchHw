package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestBinarySearch {
    public static void main(String[] args) {
        testArrayBinarySearch();
        testCollectionsBinarySearch();
    }

    private static void testArrayBinarySearch() {
        // byte[]
        System.out.println("byte");
        byte[] byteArray = {1, 3, 5, 7, 9};
        var bt1 = Arrays.binarySearch(byteArray, (byte) 5); // 2
        System.out.println(bt1);
        var bt2 = Arrays.binarySearch(byteArray, 0, 4, (byte) 7); // 3
        System.out.println(bt2);
        var bt3 = Arrays.binarySearch(byteArray, (byte) 2); // -2
        System.out.println(bt3);

        // char[]
        System.out.println("char");
        char[] charArray = {'a', 'c', 'e', 'g'};
        var ct1 = Arrays.binarySearch(charArray, 'e'); // 2
        System.out.println(ct1);
        var ct2 = Arrays.binarySearch(charArray, 'd'); // -3
        System.out.println(ct2);


        // double[]
        System.out.println("double");
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        var dt1 = Arrays.binarySearch(doubleArray, 3.3); // 2
        System.out.println(dt1);
        var dt2 = Arrays.binarySearch(doubleArray, 2.5); // -3
        System.out.println(dt2);

        // int[]
        System.out.println("int");
        int[] intArray = {10, 20, 30, 40};
        var it1 = Arrays.binarySearch(intArray, 20); // 1
        System.out.println(it1);
        var it2 = Arrays.binarySearch(intArray, 25); // -3
        System.out.println(it2);

        // long[]
        System.out.println("long");
        long[] longArray = {100L, 200L, 300L};
        var lt1 = Arrays.binarySearch(longArray, 300L); // 2
        System.out.println(lt1);
        var lt2 = Arrays.binarySearch(longArray, 150L); // -2
        System.out.println(lt2);

        // Comparator
        System.out.println("comparator");
        Integer[] integerArray = {1, 3, 5, 7};
        var cmpt1 = Arrays.binarySearch(integerArray, 5, Comparator.naturalOrder()); // 2
        System.out.println(cmpt1);
        var cmpt2 = Arrays.binarySearch(integerArray, 2, Comparator.naturalOrder()); // -2
        System.out.println(cmpt2);
    }

    private static void testCollectionsBinarySearch() {
        System.out.println("collections 1");
        List<Integer> intList = new ArrayList<>(List.of(1, 3, 5, 7));
        var it1 = Collections.binarySearch(intList, 5); // 2
        System.out.println(it1);
        var it2 = Collections.binarySearch(intList, 2); // -2
        System.out.println(it2);

        System.out.println("collections 2");
        List<String> stringList = new ArrayList<>(List.of("apple", "banana", "cherry", "date"));
        var st1 = Collections.binarySearch(stringList, "cherry", Comparator.naturalOrder()); // 2
        System.out.println(st1);
        var st2 = Collections.binarySearch(stringList, "grape", Comparator.naturalOrder());
        System.out.println(st2);
    }
}