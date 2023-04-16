public class sqrRoot_69 {
    public int mySqrt(int x) {
        int low=1;
        int high=x;
        while(low<=high){
            int mid = (low+high)/2;
            if(x/mid == mid){
                return mid;
            }else if(mid>x/mid){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return high;
    }
}
