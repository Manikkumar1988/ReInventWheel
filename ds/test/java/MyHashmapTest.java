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
    public void hash_PassedInteger_returnUniqueInteger() {
        MyHashmap<Integer,Object> blah = new MyHashmap<>();
        assertEquals(blah.hashFunc(1),0);
    }

    @Test
    public void put_ValidValues_ReturnValue(){
        MyHashmap<Integer,Object> blah = new MyHashmap<>();
        assertEquals(blah.put(1,2),2);
    }
}