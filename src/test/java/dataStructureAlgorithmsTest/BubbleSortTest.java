package dataStructureAlgorithmsTest;
import dataStructureAlgorithms.BubbleSort;
import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleSortTest {
    BubbleSort sort = new BubbleSort();

    @Test
    public void test1(){
        int[] array = {};

        assertArrayEquals("Empty array should return empty array",null, sort.bubblesort1(array));
    }

    @Test
    public void test2(){
        int[] array = null;
        assertArrayEquals("Null Point exception", null, sort.bubblesort1(array));
    }

    @Test
    public void test3(){
        int[] array = {2,5,-4,-2,0,9};
        int [] sortedArray = {-4,-2,0,2,5,9};
        assertArrayEquals("Sorted array", sortedArray, sort.bubblesort1(array) );
    }
}
