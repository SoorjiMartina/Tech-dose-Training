int climbStairs(int n){
    int cib[n+4];
    cib[0]=0;
    cib[1]=1;
    cib[2]=2;
    for(int i=3;i<=n;i++)
    {
        cib[i]=cib[i-1]+cib[i-2];
    }
    return cib[n];

}
