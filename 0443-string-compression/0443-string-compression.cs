public class Solution {
    public int Compress(char[] chars) {
        int n=chars.Length;
        int ind=0;
       // int totalcount=0;

        for(int i=0;i<chars.Length;i++){
            
             char ch =chars[i];
             int count =0;

             while(i<n && chars[i]==ch){
                count++; i++;
             }

             if(count==1) chars[ind++]=ch;
             else{
                chars[ind++]=ch;
                String str=Convert.ToString(count);
                foreach(char dig in str){
                    chars[ind++]=dig;
                    
                }

             }
             i--;
            // totalcount++;
            }

            return ind;
    }
}