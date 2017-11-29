class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < n; i++){
            l.add(i+1);
        }
        rec(l, k, new ArrayList<Integer>(), 0);
        return result;
    }

    public void rec(List<Integer> arr, int k, List<Integer> soFar, int start){
        if(k == 0){
            result.add(new ArrayList<>(soFar));
            return;
        }

        for(int i = start; i < arr.size(); i++){
            int num = arr.get(i);
            soFar.add(num);

            rec(arr, k - 1, soFar, i + 1);

            soFar.remove(soFar.size()-1);
        }
    }
}
