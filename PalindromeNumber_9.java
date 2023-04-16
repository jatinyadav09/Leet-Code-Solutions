class PalindromeNumber_9 {
    public boolean isPalindrome(int x) {
        int sum =0;
        int a =x;
        while(x>0){
            int rem = x%10;
            sum =sum*10+rem;
            x/=10;
        }
        if(a==sum){
            return true;
        }
        return false;
    }
}
    