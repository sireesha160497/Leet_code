class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int highest_streak=0;
        int current_streak =0 ;
        for (int a=0; a<nums.length; a++){
            if(nums[a]==1){
                current_streak=1;
                highest_streak =1;
            }
        }
        for (int i =0; i<nums.length-1; i++){
            if (nums[i+1]==nums[i] && nums[i]==1)
                current_streak+=1;
            else if (nums[i]==1)
                current_streak =1;
            
            if(current_streak>=highest_streak)
                    highest_streak=current_streak;            
        }
        
       return highest_streak; 
        
    }
}
