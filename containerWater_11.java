public class containerWater_11 {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length-1;
        int max=0;
        while(low<high){
            int width = high-low;
            int h = Math.min(height[low], height[high]);
            int area = width*h;
            max = Math.max(max,area);
            if(height[low]<height[high]){
                low++;
            }else{
                // low++;
                high--;
            }
        }
        return max;
    }
}
