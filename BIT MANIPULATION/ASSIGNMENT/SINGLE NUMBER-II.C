int singleNumber(int* nums, int numsSize){
    int result=0,result1=0;
    for(int i=0;i<numsSize;++i)
    {
        result ^= nums[i] & (~result1);
        result1 ^=nums[i]  & (~result);
    }
    return result;

}
