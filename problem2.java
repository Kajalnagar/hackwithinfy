class Solution {
    public List<Integer> partitionLabels(String s) {
        // create a arry with the 26 characters of alphabets
         int[] last = new int[26];
         // use a for loop for iterate the arrayliost

        for(int i = 0; i < s.length(); i++){
            // last occerence
            last[s.charAt(i) - 'a'] = i;
        }
        // create a list 

        List<Integer> result = new ArrayList<>();
// two pointer 


        int start = 0;
        int end = 0;

        for(int i = 0; i < s.length(); i++){

            end = Math.max(end, last[s.charAt(i) - 'a']);

            if(i == end){
                result.add(end - start + 1);
                start = i + 1;
            }
        }

        return result;
    }
}
