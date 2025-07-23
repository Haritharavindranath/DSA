class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int minr=Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++){
                minr=Math.min(minr,matrix[i][j]);
            }
            a.add(minr);
        }
        for(int j=0;j<matrix[0].length;j++){
            int maxc=Integer.MIN_VALUE;
            for(int i=0;i<matrix.length;i++){
                maxc=Math.max(maxc,matrix[i][j]);
            }
            b.add(maxc);
        }
        int max=a.get(0);
        int min=b.get(0);
        for(int i:a){
            max=Math.max(max,i);
        }
        for(int i:b){
            min=Math.min(min,i);
        }
        if(max==min) ans.add(max);
        return ans;
    }
}