package work;

public class Frequency {
    public static void main(String[] args) {

        String s1 = "hello world";
        int[] freq = new int[s1.length()];
        char[] ch=s1.toCharArray();


        for(int i=0;i<s1.length();i++){
            freq[i] = 1;
            for(int j=i+1;j<s1.length();j++){
                if(ch[i] == ch[j]){
                    freq[i]++;
                    ch[j] = '0';
                }
            }
        }

        for(int i=0;i<freq.length;i++){
            if(ch[i] != ' ' && ch[i] != '0'){
                System.out.println(ch[i] + " " +freq[i] ) ;
            }
        }






    }
}
