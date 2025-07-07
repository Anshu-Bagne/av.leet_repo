  class Solution {
public:

    int dfs(int i,vector<int> &cur_sum,vector<int> &cookies)
    {
        if(i == cookies.size())
            return *max_element(cur_sum.begin() ,cur_sum.end());
    
        
        int res = INT_MAX;
        for(int k=0;k<cur_sum.size();k++)
        {
            cur_sum[k] += cookies[i];
            res = min(res, dfs(i+1,cur_sum,cookies));
            cur_sum[k] -= cookies[i];
        }
        
        return res;
    }
    
    int distributeCookies(vector<int>& cookies, int k) {
        int n = cookies.size();
        if(n == k)
            return *max_element(cookies.begin() ,cookies.end());
        int sum = 0;
        for(auto &cookie : cookies)
            sum += cookie;
        
        vector<int> cur_sum(k,0);
        return dfs(0,cur_sum,cookies);
    }
};