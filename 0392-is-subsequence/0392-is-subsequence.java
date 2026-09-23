class Solution {
    public boolean isSubsequence(String a, String t) {
        if(a.length()==0){
            return true;
        }
        int i=0;
        char[] s=a.toCharArray();
        for(char x:t.toCharArray()){
            if(s[i]==x){
                i++;
            }
            if(i==s.length){
            return true;
        }

        }

            return false;
        

    }
}