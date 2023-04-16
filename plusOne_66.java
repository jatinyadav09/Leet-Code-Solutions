public class plusOne_66 {
    public int[] plusOne(int[] digits) {
        int n = 1;
    for (int i = digits.length - 1; i >= 0; i--) {
        digits[i] ++;
        if (digits[i] < 10) {
            n = 0;
            break;
        } else {
            digits[i] = 0;
        }
    }
    if (n == 1) {
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    } else {
        return digits;
          
   }
}
}
