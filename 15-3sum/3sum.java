class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort( nums );

        List<List<Integer>> list = new ArrayList<>();

        for( int i = 0; i < n - 2; i++ ) {
            int n1 = -nums[i];

            if( i > 0 && nums[i] == nums[i - 1] ) continue;

            int j = i + 1;
            int k = n - 1;

            while( j < k ) {
                int sum = nums[j] + nums[k];

                if( sum == n1 ) {
                    List<Integer> l1 = new ArrayList<>();
                    l1.add(nums[i]);
                    l1.add(nums[j]);
                    l1.add(nums[k]);
                    list.add(l1);

                    j += 1;
                    k -= 1;

                    while( j < k && nums[j] == nums[j - 1] ) {
                        j += 1;
                    }

                    while( k > j && nums[k] == nums[k + 1] ) {
                        k -= 1;
                    }
                }
                else if( sum > n1 ) {
                    k -= 1;
                }
                else{
                    j += 1;
                }

            }
        }

        return list;

    }
}