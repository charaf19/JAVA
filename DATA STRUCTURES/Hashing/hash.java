class Hash{
    static int [] k = {34,65,88,16,27,100};
    static int [] H = new int[];
    // hash function h(x) = k[i] mod 10
    public static int h(int x){
        return x[i] % 10;
    }
    public static vois main(String [] args){
         for(int i =0;i<=k.length;i++){
             int index = h(k[i]);
             H[index]=k[i];
         }
         for(int i;i<H.length;i++ ){
             System.out.println(i+"=>"+H[i]);
         }
    }
}