import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mani on 04/05/18.
 */
public class MyHashmapTest {

    @Before
    public void setup(){}

    @Test
    public void put_ValidValues_ReturnValue(){
        MyHashmap<Integer,Object> myHashmap = new MyHashmap<>();
        assertEquals(myHashmap.put(1,2),2);
    }

    @Test
    public void size_ValidValues_ReturnOne() {
        MyHashmap<Integer,Object> myHashmap = new MyHashmap<>();
        myHashmap.put(1,2);
        assertEquals(myHashmap.size(),1);
    }

    @Test
    public void size_ValidValues_ReturnTwo() {
        MyHashmap<Integer,Object> myHashmap = new MyHashmap<>();
        myHashmap.put(1,2);
        myHashmap.put(3,4);
        assertEquals(myHashmap.size(),2);
    }

    @Test
    public void get_ValidKey_ReturnValue() {
        MyHashmap<Integer,Object> myHashmap = new MyHashmap<>();
        myHashmap.put(1,2);
        assertEquals(myHashmap.get(1),2);
    }

    @Test
    public void get_InValidKey_ReturnNull() {
        MyHashmap<Integer,Object> myHashmap = new MyHashmap<>();
        myHashmap.put(1,2);
        assertEquals(myHashmap.get(2),null);
    }
}