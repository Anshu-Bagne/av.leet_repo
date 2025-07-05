class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int luck_no = -1;
         for (int key : map.keySet()) {
            if (map.get(key) == key) {
                luck_no = key; 
            }
        }
        return luck_no;  
    }
}