public class MergingTwoSortedArrays{
   public static int[] merge(int[] A, int[] B){
      int aTally = 0;
      int bTally = 0;
      int [] merged = new int[A.length + B.length];
      /*if(A.length == 0){
      return B;
      } else if(B.length == 0){
      return A;
      }*/
      for(int i = 0; i < (A.length + B.length); i++){ 
         if(aTally >= A.length){
            merged[i] = B[bTally];
            bTally++;
         } else if(bTally >= B.length) {
            merged[i] = A[aTally];
            aTally++;
         }else if(A[aTally] >= B[bTally]){
            merged[i] = B[bTally];
            bTally++;
         } else if(A[aTally] < B[bTally]){
            merged[i] = A[aTally];
            aTally++;
         }
      }
      return merged;
   }
   public static void main(String[] args){
      int[] empty = new int[0];
      int[] a = new int[1];
      int[] b = {-4, 10};
      int[] c = {-9};
      merge(b, c);
   }
}