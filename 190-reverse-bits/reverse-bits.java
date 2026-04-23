class Solution {
    public int reverseBits(int n) {
        int bit[]=new int[32];
        Arrays.fill(bit,0);
        int temp=n,i=31;
 
        // Store bits of the number
        while(temp!=0){
            bit[i]=temp%2;
            i--;
            temp=temp/2;
        }

        int ans=0;
        // Rebuild the number from stored bits
        for(int j=31;j>=0;j--){
            ans+=(int)Math.pow(2,j)*bit[j];
        }
        return ans;
    }
}