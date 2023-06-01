class Solution {
    public int findLHS(int[] nums) {

        int res=0;

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int i:map.keySet())
        {
            if(map.containsKey(i+1))
            {
                res=Math.max(res,map.get(i)+map.get(i+1));
            }
        }
        return res;
    }
}
