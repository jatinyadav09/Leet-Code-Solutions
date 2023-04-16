public class mergeArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x=m+n;
        int a=0;
        for(int i=m; i<nums1.length; i++){
            for(int j=a; j<n; j++){
                if(nums1[i]==0){
                    nums1[i]=nums2[j];
                    a=j;
                    a++;
                }
            }
        }
        Arrays.sort(nums1);
    }
}
