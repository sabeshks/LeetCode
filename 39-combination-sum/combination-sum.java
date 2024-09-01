class Solution {
    public void solve(int[] candidates, int target,List<Integer> ans,List<List<Integer>> res,int i )
    {
        if(target==0)
        {
            res.add(new ArrayList<>(ans));
            return;
        }
        if(i==candidates.length || target < 0)
        {
            return;
        }
        else
        {
            ans.add(candidates[i]);
            solve(candidates,target-candidates[i],ans,res,i);
            ans.remove(ans.size()-1);
            solve(candidates,target,ans,res,i+1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        solve(candidates,target,ans,res,0);
        return res;
        
    }
}