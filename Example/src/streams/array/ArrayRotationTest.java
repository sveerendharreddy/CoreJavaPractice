package streams.array;

import array.ArrayRotation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class ArrayRotationTest {

    private ArrayRotation arrayRotation;

    @Before
    public void setUp(){
        arrayRotation = new ArrayRotation();
    }

    @Test
    public void TestReverseArray(){
        int[] inputArray = {1,2,3,4,5};
        int[] result = ArrayRotation.reverseArray(inputArray, 0, 1);
        Assert.assertArrayEquals(new int[]{2,1,3,4,5},result);
    }
}
