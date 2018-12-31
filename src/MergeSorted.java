public class MergeSorted {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
       // nums1 = [1,2,3,0,0,0], m = 3
       // nums2 = [2,5,6],       n = 3

        // start at index1 =0, index2 = 0
        int index1 = 0, index2 = 0;
        while (index1 < nums1.length) {
            if (index2 > nums2.length - 1 || nums1[index1] <= nums2[index2] && index1 < m) {
                index1++;
            } else {
                // shift elements of nums1
                for(int i = m; i > index1; i--) {
                    nums1[i] = nums1[i - 1];
                }
                nums1[index1] = nums2[index2];
                index1++; index2++; m++;
            }
        }

        // compare nums1[index1] with nums2[index2]
           // nums1[index1] <= than nums2[index2]
           // advance index1
           // index1 = 1 and index2 = 0
        // compare nums1[index1] with nums2[index2]
            // nums1[index1] <= than nums2[index2]
            // advance index1
            // index1 = 2 and index2 = 0
        // compare nums1[index1] with nums2[index2]
            // nums1[index1] > than nums2[index2]
            // shift elements of nums1
                    // nums1[3] = nums[2]
                        // nums1 = [1,2,3,3,0,0], m = 3
                        // nums2 = [2,5,6],       n = 3
            // place nums2[index2] at nums1[index1]
                        // nums1 = [1,2,2,3,0,0], m = 3
                        // nums2 = [2,5,6],       n = 3

            // advance index2 && index1
            // index1 = 3 and index2 = 1
        // compare nums1[index1] with nums2[index2]
            // nums1[index1] <= than nums2[index2]
            // advance index1
            // index1 = 4 and index2 = 1

        // if index1 > m -> stop
            // put rest of nums2 into nums1
                // for i = index1; i < nums1.length; i++
                // nums1[i] = nums2[index2]
                // index2++

    }

}
