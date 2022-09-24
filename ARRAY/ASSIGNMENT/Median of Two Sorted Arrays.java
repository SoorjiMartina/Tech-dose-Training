class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int  b = nums2.length;
        int c = a+b;
        double c1 [] = new double [c];
        for(int i=0;i<a;i++)
        {
            c1[i]=nums1[i];
        }
        for(int i=0;i<b;i++)
        {
            c1[a+i]=nums2[i];
        }
        Arrays.sort(c1);
        double d=0;
        if(c%2==0)
        {
            d=(c1[c/2]+c1[(c/2)-1])/2;
        }
        else
        {
            d=c1[c/2];
        }
        return d;
    }
}
