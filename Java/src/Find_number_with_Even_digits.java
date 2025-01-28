public class Find_number_with_Even_digits {
    public int findNumbers(int[] nums) {
        int num_digits = 0;
        int num_even_digits = 0;
        for (int i=0; i<nums.length;i++){
            num_digits =0;
            int number=nums[i];
            while(number>0){
                number = number/10;
                num_digits++;
            }
            if (num_digits%2 ==0)
                num_even_digits++;
        }

        return num_even_digits;
    }

}
