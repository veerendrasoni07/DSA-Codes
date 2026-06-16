public class string {
    public static void main(String[] args) {
        /*StringBuilder str = new StringBuilder("Veerendra");
        str.append("Soni");
        System.out.println(str);
        str.insert(13, "Hello");
        System.out.println(str);

        str.delete(2, 5);
        System.out.println(str);


        String s = "i love java";
        StringBuilder ans = new StringBuilder();
        String [] arr = s.split(" ");
        for(int i = 0;i<arr.length;i++){
            StringBuilder sbstr = new StringBuilder(arr[i]);
            ans.append(sbstr.reverse()+" ");
            
            
        }

        System.out.println(ans);*/


        String s = "abbcbbb";
        StringBuilder str = new StringBuilder();
        int i = 0;
        int cnt = 1;
        while(i<s.length()-1){
            
            while (i+1 < s.length()-1 && s.charAt(i)==s.charAt(i+1)) {
                cnt++;
                i++;
            }
            str.append(s.charAt(i)).append(cnt);
            cnt = 1;
            i++;
        }
        if(str.charAt(str.length()-2) == s.charAt(s.length()-1) ){
            
        }
        

        System.out.println(str);

        
    
    }
}
