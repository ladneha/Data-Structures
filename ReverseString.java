class ReverseString {
    public String reverseString(String s) {
        char[] str = s.toCharArray();
        int left = 0;
        int right = str.length-1;
        
        while(left<right){
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            
            left++;
            right--;
        }
        return new String(str);
    }
}