bool checkDistances(char * s, int* distance, int distanceSize){
    int i,j;
    for(i=0;i<strlen(s);i++){
        for(j=i+1;j<strlen(s);j++){
            if(s[j]== s[i]){
                int dis = j-i-1;
    if(distance[s[i]-'a']!=dis)
                return false;
            }
        }
    }
                  return true;
}
