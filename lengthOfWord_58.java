class lengthOfWord_58{
    public int lengthOfLastWord(String s) {
        char[] arr = s.toCharArray();
        int n=0;
        
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]!=' '){
                n++;
            }else{
                if(n>0){
                    return n;
                }
            }
        }
        return n;
    }
}