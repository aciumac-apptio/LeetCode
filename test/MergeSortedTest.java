import org.junit.Assert;
import org.junit.Test;

import java.sql.Array;
import java.util.Arrays;

public class MergeSortedTest {
    @Test
    public void mergeSorted1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        int[] result = {1, 2, 2, 3, 5, 6};

        MergeSorted mergeSorted = new MergeSorted();
        mergeSorted.merge(nums1, 3, nums2, 3);

        Assert.assertTrue(Arrays.equals(nums1, result));
    }


    @Test
    public void mergeSorted2() {
        int[] nums1 = {1, 2, 6, 0, 0, 0};
        int[] nums2 = {2, 3, 5};

        int[] result = {1, 2, 2, 3, 5, 6};

        MergeSorted mergeSorted = new MergeSorted();
        mergeSorted.merge(nums1, 3, nums2, 3);

        Assert.assertTrue(Arrays.equals(nums1, result));
    }
}
