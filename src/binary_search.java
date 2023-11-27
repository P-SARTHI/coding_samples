public class binary_search {
    public static void main(String args[]){
        int nums[]={1,2,3,4,5,6,7,8,9,10,11,22,34,45};
        int key=111;
        int start=0;
        int end=nums.length-1;
       
        while(start<=end ){
           int mid=(start+end)/2;
            if(key==nums[mid]){
                System.out.println("element found");
                key=-1;
                break;
            }
          if(key<nums[mid]){
            end=mid-1;
          }
          if(key>nums[mid]){
             start=mid+1;
          }
            
         
          
        }
        if(key!=-1){
            System.out.println("not found");
        }
        
        


        
    }
   
}
