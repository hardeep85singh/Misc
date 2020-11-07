package dataStructureAlgorithmsTest;

import dataStructureAlgorithms.BinarySearch;
import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchMainTest {

    @Test
    public void test1(){
        int[] array = {5,4,5,6,9,2,1};
        BinarySearch search = new BinarySearch();
        search.sort(array);
        assertEquals("Index of searched number: ", 2,
                search.binarySearch(array,0,array.length,4));
    }

    @Test
    public void test2(){
        int[]array = {1};
        BinarySearch search = new BinarySearch();
        search.sort(array);
        assertEquals("Index of searched number: ", 0,
                search.binarySearch(array,0,array.length,1));
    }

    @Test
    public void test3(){
        int[] array = {5,4,5,6,9,2,1};
        BinarySearch search = new BinarySearch();
        search.sort(array);
        assertEquals("Index of searched number: ", -1,
                search.binarySearch(array,0,array.length,7));
    }

}
