class Solution {
    int fact(int i, int f,int n){
        if(i<=n){
            f=f*i;
            i++;
            
            return fact(i,f,n); 
        }
        else{
            return f;
        }
    }
    int factorial(int n) {
        return  fact(1,1,n);
        
    }
}
