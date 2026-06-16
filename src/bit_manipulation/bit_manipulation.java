package bit_manipulation;

public class bit_manipulation {
    public static void main(String[] args) {
//        System.out.println(powerXtoN(2,7));
//        convert2to10("1000");
        System.out.println(minBitFlips(10,7));
    }

    public static void convert2to10(String binary){
        int len = binary.length();
        int ans = 0;
        int p2 = 1;
        for(int i=len-1;i>=0;i--){
            if(binary.charAt(i)=='1'){
                ans = ans + p2;
            }
            p2 = p2*2;
        }
        System.out.println(ans);

    }

    public static int powerXtoN(int number,int power){
        if(power==0){
            return 1;
        }
        if(power==1){
            return number;
        }
        return number * powerXtoN(number,power-1);
    }
    public static int minBitFlips(int start, int goal) {
        int d = 1;
        int cnt=0;
        while(start!=goal){
            if((start&d) != (goal&d)){
                start = start^d;
                cnt ++;
            }else{
                d=d*10;
            }
        }
        return cnt;
    }

}
