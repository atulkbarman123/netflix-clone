public class climbstairs {
    public static int countWys(int n,int ways[]){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
   return countWys(n-1)+countWys(n-2);
    }

    public static void main(String []arg){
        int n = 5;
        int ways[] = new int[n+1];
        Arrays.fill(ways,-1);
        System.out.println(countWys(n, ways));

    }
    
}