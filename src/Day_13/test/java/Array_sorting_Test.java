////Array Sorting
////Write a method to sort an array of integers. Test cases should include arrays with duplicates,
//// already sorted arrays, and empty arrays.
///
package Day_13.test.java;

import Day_13.main.java.Array_sorting;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Array_sorting_Test {
    Array_sorting as;
    @Before
    public void setUp() throws Exception {
        as = new Array_sorting();
    }

    @Test
    public void test_sort() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] res = {1, 2, 3, 4, 5};
        Array_sorting.sort(arr);
        assertArrayEquals(res, arr);
    }

    @Test
    public void test_sort_empty() {
        int[] arr = {};
        int[] res = {};
        Array_sorting.sort(arr);
        assertArrayEquals(res, arr);
    }

    @Test
    public void test_sort_sorted() {
        int[] arr = {2,3,4,5,6};
        int[] res = {2,3,4,5,6};
        Array_sorting.sort(arr);
        assertArrayEquals(res, arr);
    }

    @Test
    public void test_sort_sorted1() {
        int[] arr = {10,20,30,40,50};
        int[] res = {10,20,30,40,50};
        Array_sorting.sort(arr);
        assertArrayEquals(res, arr);
    }

    @Test
    public void test_sort_duplicate() {
        int[] arr = {5, 4, 3, 2, 1, 7, 8, 9, 4};
        int[] res = {1, 2, 3, 4, 4, 5, 7, 8, 9};
        Array_sorting.sort(arr);
        assertArrayEquals(res, arr);
    }




}
