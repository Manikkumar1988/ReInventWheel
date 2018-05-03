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
    public void Size_InitializedWithOne_ReturnsZero() {
        MyArrayList<String> myArrayList = new MyArrayList<>(1);
        assertEquals(myArrayList.size(),0);
    }

    @Test(expected = Exception.class)
    public void Size_InitializedWithMinusOne_ThrowsException() {
        MyArrayList<String> myArrayList = new MyArrayList<>(-1);
    }

    @Test
    public void isEmpty_EmptyNonPopulatedArray_True() {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        assertEquals(myArrayList.isEmpty(),true);
    }

    @Test
    public void isEmpty_NonEmptyNonPopulatedArray_True() {
        MyArrayList<String> myArrayList = new MyArrayList<>(10);
        assertEquals(myArrayList.isEmpty(),true);
    }

    @Test
    public void isEmpty_NonEmptyPopulatedArray_False() {
        MyArrayList<String> myArrayList = new MyArrayList<>(10);
        myArrayList.add("A");
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
    public void contains_ElementStringPresent_True() {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("A");
        assertEquals(myArrayList.contains("A"),true);
    }

    @Test
    public void contains_ElementIntegerPresent_True() {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        assertEquals(myArrayList.contains(1),true);
    }

    @Test
    public void contains_ElementFloatPresent_True() {
        MyArrayList<Float> myArrayList = new MyArrayList<>();
        myArrayList.add(1.f);
        assertEquals(myArrayList.contains(1.f),true);
    }

    @Test
    public void contains_ElementLongPresent_True() {
        MyArrayList<Long> myArrayList = new MyArrayList<>();
        myArrayList.add(1l);
        assertEquals(myArrayList.contains(1l),true);
    }

    @Test
    public void add_EmptyArrayList_True() {
        MyArrayList<Long> myArrayList = new MyArrayList<>();
        myArrayList.add(1l);
        assertEquals(myArrayList.contains(1l),true);
    }

    @Test
    public void add_FullArrayList_True() {
        MyArrayList<Long> myArrayList = new MyArrayList<>(1);
        myArrayList.add(1l);
        myArrayList.add(1l);
        assertEquals(myArrayList.contains(1l),true);
    }

    @Test
    public void indexOf_NonMatchingDataType_MinusOne()
    {
        MyArrayList<Long> myArrayList = new MyArrayList<>();
        myArrayList.add(1l);

        assertEquals(myArrayList.indexOf("2"),-1);
    }

    @Test
    public void indexOf_MatchingData_Zero()
    {
        MyArrayList<Long> myArrayList = new MyArrayList<>();
        myArrayList.add(1l);

        assertEquals(myArrayList.indexOf(1l),0);
    }


    @Test
    public void lastIndexOf_NonMatchingDataType_MinusOne()
    {
        MyArrayList<Long> myArrayList = new MyArrayList<>();
        myArrayList.add(1l);
        myArrayList.add(2l);
        myArrayList.add(3l);
        myArrayList.add(1l);

        assertEquals(myArrayList.indexOf("2"),-1);
    }

    @Test
    public void lastIndexOf_MatchingData_Zero()
    {
        MyArrayList<Long> myArrayList = new MyArrayList<>();
        myArrayList.add(1l);
        myArrayList.add(2l);
        myArrayList.add(3l);
        myArrayList.add(1l);

        assertEquals(myArrayList.lastIndexOf(1l),3);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void get_IndexLessThanZero_ThrowsException() {
        MyArrayList<Long> myArrayList = new MyArrayList<>();
        myArrayList.get(-1);
    }


    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void get_IndexGreaterThanSize_ThrowsException() {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("A");
        myArrayList.get(5);
    }

    @Test
    public void get_IndexWithinBoundary_ActualElement() {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("A");
        assertEquals(myArrayList.get(0),"A");
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void set_IndexLessThanZero_ThrowsException() {
        MyArrayList<Long> myArrayList = new MyArrayList<>();
        myArrayList.set(-1,1l);
    }


    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void set_IndexGreaterThanSize_ThrowsException() {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("A");
        myArrayList.set(5,"B");
    }

    @Test
    public void set_IndexWithinBoundary_Element() {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("A");
        myArrayList.add("B");
        assertEquals(myArrayList.set(1,"C"),"C");
    }


    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void add_IndexLessThanZero_ThrowsException() {
        MyArrayList<Long> myArrayList = new MyArrayList<>();
        myArrayList.add(-1,1l);
    }


    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void add_IndexGreaterThanSize_ThrowsException() {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("A");
        myArrayList.add(5,"B");
    }

    @Test
    public void add_IndexWithinBoundary_Element() {
        MyArrayList<String> myArrayList = new MyArrayList<>(2);
        myArrayList.add("A");
        myArrayList.add("B");
        myArrayList.add(1,"C");
        assertEquals(myArrayList.indexOf("C"),1);
    }


    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void remove_IndexLessThanZero_ThrowsException() {
        MyArrayList<Long> myArrayList = new MyArrayList<>();
        myArrayList.remove(-1);
    }


    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void remove_IndexGreaterThanSize_ThrowsException() {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("A");
        myArrayList.remove(5);
    }

    @Test
    public void remove_IndexWithinBoundaryElementAbsent_False() {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("A");
        myArrayList.add("B");
        assertEquals(myArrayList.remove("C"),false);
    }

    @Test
    public void remove_IndexWithinBoundaryElementPresent_True() {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("A");
        myArrayList.add("B");
        assertEquals(myArrayList.remove("A"),true);
        assertEquals(myArrayList.size(),1);
        assertEquals(myArrayList.indexOf("A"),-1);
        assertEquals(myArrayList.indexOf("B"),0);
    }

}