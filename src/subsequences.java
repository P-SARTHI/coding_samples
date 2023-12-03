public class subsequences {
    public static void main(String args[]){
        int arr[]={1,2,3};
        int seq[]=new int[arr.length];
        //subsequence_string("abc", "");
        subsequence_array(arr, 0, seq, 0);
    }
    public static void subsequence_string(String word,String ans){
        if(word==""){
            System.out.println(ans);
            return ;
           }
              
               subsequence_string(word.substring(1), ans+word.charAt(0));//picking a alphabet
               subsequence_string(word.substring(1), ans);//not picking a albhabet
    }
    public static void subsequence_array(int arr[],int arrindx, int seq[],int seqindx){
        if(arrindx==arr.length){
            for(int i=0;i<seq.length;i++){
                System.out.print(seq[i]);
            }
            System.out.println();
            return;
        }
         subsequence_array(arr, arrindx+1, seq, seqindx);
           seq[seqindx]=arr[arrindx];
           subsequence_array(arr, arrindx+1, seq, seqindx+1);
          

    }
}
