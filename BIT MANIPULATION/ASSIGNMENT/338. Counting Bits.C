int* countBits(int num, int* returnSize){
   num++;
    *returnSize = num;
    int* arr = (int*)malloc(sizeof(int)*num);
    arr[0] = 0;
    for(int i = 1; i < num; i++)
        arr[i] = (i&1)? arr[i>>1]+1 : arr[i>>1];
    return arr;

}
