import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SolutionTest {
    private int[] input;
    private int[] expected;
    private Solution soln = new Solution2();

    public SolutionTest(int[] input, int[] output) {
        this.input = input;
        this.expected = output;
    }

    @Parameterized.Parameters
    public static Collection parameters() {
        return Arrays.asList(new Object[][]{
                {new int[]{2,0,2,1,1,0}, new int[]{0,0,1,1,2}}
        });
    }

    @Test
    public void testSort() {
        soln.sortColors(input);
        assert(checkEqual(expected, input));
    }

    private boolean checkEqual(int[] expected, int[] actual) {
        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != actual[i]) {
                return false;
            }
        }
        return true;
    }
}