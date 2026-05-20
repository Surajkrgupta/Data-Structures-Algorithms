class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] res=new int[A.length];
        Map<Integer,Integer> map=new HashMap<>();

        int n=A.length;
        int c=0;
        for(int i=0;i<n;i++){
            if(A[i]==B[i]) c++;
            c+=map.getOrDefault(A[i],0);
            c+=map.getOrDefault(B[i],0);
            res[i]=c;
            map.put(A[i],1);
            map.put(B[i],1);

        }
        return res;

    }
}