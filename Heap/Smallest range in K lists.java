// these Approch -> Heap
class Solution {
    // These Problem using range these thought process thinking is very good solving
    // [[4, 7, 9, 12, 15], [0, 8, 10, 14, 20], [6, 12, 16, 30, 50]]
    // [4, 7, 9, 12, 15] smallest -> 4
    // [0, 8, 10, 14, 20] -> smallest -> 0
    //[6, 12, 16, 30, 50] -> smallest -> 6
     // now the all k smallest having smallest range will be the smallest and largest in that k smalllest
    // here  that range will 0-6
     // after you need change min value then only you can get furthur smallest range
    public ArrayList<Integer> findSmallestRange(int[][] arr) {
        int n1 = -100000,n2 = 100000;
        int maxi = Integer.MIN_VALUE;
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> Integer.compare(a[0],b[0]));
        for(int i = 0;i < arr.length;i++){
            queue.add(new int[]{arr[i][0],i,0});
            if(maxi < arr[i][0])
                maxi = arr[i][0];
        }
        // System.out.println(maxi);
        // while(!queue.isEmpty()){
        //     int[] temp = queue.remove();
        //     System.out.println(Arrays.toString(temp));
        // }
        while(!queue.isEmpty()){
            int[] temp = queue.remove();
            // System.out.println(Arrays.toString(temp));
            if((maxi - temp[0]) < (n2 - n1)){
                n1 = temp[0];
                n2 = maxi;
            }
            if(temp[2] == arr[0].length - 1)
                break;
            if(maxi < arr[temp[1]][temp[2]+1])
                maxi = arr[temp[1]][temp[2]+1];
            queue.add(new int[]{arr[temp[1]][temp[2]+1],temp[1],temp[2]+1});
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(n1);
        ans.add(n2);
        return ans;
    }
}
