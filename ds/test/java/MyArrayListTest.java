import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mani on 25/04/18.
 */
public class MyArrayListTest {

    @Test
    public void Size_InitializedWithZero_ReturnsZero() {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        assertEquals(myArrayList.size(),0);
    }

    /*@Test
    public void Size_InitializedWithMaxValue_ReturnsMaxValue() {
        MyArrayList<String> myArrayList = new MyArrayList<>(Integer.MAX_VALUE);
        assertEquals(myArrayList.size(),Integer.MAX_VALUE);
    }*/

    @Test
    public void Size_InitializedWithOne_ReturnsOne() {
        MyArrayList<String> myArrayList = new MyArrayList<>(1);
        assertEquals(myArrayList.size(),1);
    }

    @Test(expected = Exception.class)
    public void Size_InitializedWithMinusOne_ThrowsException() {
        MyArrayList<String> myArrayList = new MyArrayList<>(-1);
    }

    @Test
    public void isEmpty_EmptyArray_True() {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        assertEquals(myArrayList.isEmpty(),true);
    }

    @Test
    public void isEmpty_NonEmptyArray_False() {
        MyArrayList<String> myArrayList = new MyArrayList<>(10);
        assertEquals(myArrayList.isEmpty(),false);
    }

    @Test
    public void clear_ClearArray_True() {
        MyArrayList<String> myArrayList = new MyArrayList<>(10);
        myArrayList.clear();
        assertEquals(myArrayList.isEmpty(),true);
    }

    @Test
    public void clear_ClearArray_ReturnsZero() {
        MyArrayList<String> myArrayList = new MyArrayList<>(10);
        myArrayList.clear();
        assertEquals(myArrayList.size(),0);
    }

    @Test
    public void contains_ElementAbsent_False() {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        assertEquals(myArrayList.contains("A"),false);
    }

    @Test
    public void contains_ElementPresent_True() {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("A");
        assertEquals(myArrayList.contains("A"),true);
    }
}