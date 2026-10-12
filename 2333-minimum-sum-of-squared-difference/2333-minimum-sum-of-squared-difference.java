// class Solution {
//     public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
//         int max=0;
//         int idx=0;
//         if(k1 != 0){
//             for(int i=0;i<k1;i++){
//                 for(int j=0;j<nums1.length;j++){
//                     int diff=Math.abs(nums1[j])-Math.abs(nums2[j]);
//                     if(max<diff){
//                         idx=i;
//                     }
//                     max=Math.max(max,diff);
//                 }
//                 nums1[idx]++;
//             }
//         }
//         if(k2 != 0){
//             for(int i=0;i<k2;i++){
//                 for(int j=0;j<nums1.length;j++){
//                     int diff=Math.abs(nums1[j])-Math.abs(nums2[j]);
//                     if(max<diff){
//                         idx=i;
//                     }
//                     max=Math.max(max,diff);
//                 }
//                 nums2[idx]++;
//             }
//         }
//         int sum=0;
//         for(int i=0;i<nums1.length;i++){
//             int d=Math.abs(nums1[i])-Math.abs(nums2[i]);
//             int sqr=d*d;
//             sum+=sqr;
//         }
//         return sum;
//     }
// }


class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int[] d = new int[100001];
        long k = (long) k1 + k2, sum = 0;
        int max = 0;

        // Step 1: count the differences
        for (int i = 0; i < nums1.length; i++) {
            int x = Math.abs(nums1[i] - nums2[i]);
            d[x]++;
            sum += x;
            max = Math.max(max, x);
        }

        // Enough budget -> every difference becomes 0
        if (sum <= k) return 0;

        // Step 2: shave the biggest differences, level by level
        for (int i = max; i > 0 && k > 0; i--) {
            long move = Math.min(k, d[i]);
            d[i] -= move;
            d[i - 1] += move;
            k -= move;
        }

        // Step 3: add up the squares
        long ans = 0;
        for (int i = 0; i <= max; i++)
            ans += (long) i * i * d[i];

        return ans;
    }
}