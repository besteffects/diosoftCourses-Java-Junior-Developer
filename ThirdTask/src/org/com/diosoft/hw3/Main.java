package org.com.diosoft.hw3;

import java.util.Arrays;

/**
 * Created by Smart on 9/27/2015.
 */
public class Main {
    public static void main(String[] args) {
        ArrayUtils method = new ArrayUtils();
        ArraysSimpleTests tests = new ArraysSimpleTests();

//Left Union array and tests calls
        int[] leftUnionLeftArray = {1, 5, 4, 23, 65, 32, 78};
        System.out.println("Condition. Left union Left Array is " + Arrays.toString(leftUnionLeftArray));
        int[] LeftUnionRightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        System.out.println("Condition. Left union Right Array is " + Arrays.toString(LeftUnionRightArray));
        int[] LeftUnionExpectedArray = {1, 5, 4, 23, 65, 32, 78, 5, 4, 1, 32, 5};
        System.out.println("Condition. Left union Expected array " + Arrays.toString(LeftUnionExpectedArray));
        int[] leftUnionResult = method.leftUnion(leftUnionLeftArray, LeftUnionRightArray);
        System.out.println("LeftUnionResult " + Arrays.toString(leftUnionResult));
        tests.leftUnionTestPositive();
        tests.leftUnionTestLeftArrayIsEmpty();
        tests.leftUnionTestLeftArrayIsNull();

//Merge union array and tests calls
        int[] mergeUnionLeftArray = {1, 5, 4, 23, 65, 32, 78};
        System.out.println("Condition. Merge union Left Array is " + Arrays.toString(mergeUnionLeftArray));
        int[] mergeUnionRightArray = {3, 5, 24, 54, 1, 2, 34, 45, 32};
        System.out.println("Condition. Merge union Right Array is " + Arrays.toString(mergeUnionRightArray));
        int[] mergeUnionExpectedArray = {1, 5, 4, 23, 65, 32, 78, 3, 24, 54, 2, 34, 45};
        System.out.println("Condition. Merge union Expected Array is " + Arrays.toString(mergeUnionExpectedArray));
        int[] mergeUnionResult = method.mergeWithoutDuplicates(mergeUnionLeftArray, mergeUnionRightArray);
        System.out.println("MergeUnionResult: " + Arrays.toString(mergeUnionResult));
        tests.mergeUnionTestPositive();
        tests.mergeUnionTestLeftArrayIsEmpty();
        tests.mergeUnionTestLeftArrayIsNull();

//Inner union array and tests calls
        int[] innerUnionLeftArray = {1, 5, 4, 23, 65, 32, 78};
        int[] innerUnionRightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] innerUnionExpectedArray = {5, 4, 32, 1};
        int[] innerUnionResult = method.innerUnion(leftUnionLeftArray, LeftUnionRightArray);
        System.out.println("InnerUnionResult: " + Arrays.toString(innerUnionResult));
//        tests.innerUnionTestPositive();
//        tests.innerUnionTestLeftArrayIsEmpty();
//        tests.innerUnionTestLeftArrayIsNull();

//Outer union array and tests calls
        int[] outerUnionLeftArray = {1, 5, 4, 23, 65, 32, 78};
        int[] outerUnionRightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] outerUnionExpectedArray = {23, 65, 78, 3, 24, 2, 34, 45};
        int[] outerUnionResult = method.outerUnion(leftUnionLeftArray, LeftUnionRightArray);
        System.out.println("OuterUnionResult: " + Arrays.toString(outerUnionResult));
//        tests.outerUnionTestPositive();
//        tests.outerUnionTestLeftArrayIsEmpty();
//        tests.outerUnionTestLeftArrayIsNull();
    }
}
