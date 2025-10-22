

//  Link https://www.geeksforgeeks.org/problems/nearly-sorted-1587115620/1
// Geeks For Geeks Potd

// Java Solution
class Solution {
    public void nearlySorted(int[] arr, int k) {
        //custom sorting
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> a - b);
        for(int i = 0;i < k;i++){
            queue.add(arr[i]);
        }
        int counter = 0;
        // int[] ans = new int[arr.length];
        for(int i = k;i < arr.length;i++){
            queue.add(arr[i]);
            arr[counter++] = queue.poll();
        }
        while(!queue.isEmpty()){
            arr[counter++] = queue.poll();
        }
    }
}
