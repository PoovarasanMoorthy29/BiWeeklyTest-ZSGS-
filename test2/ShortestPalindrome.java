package test2;

public class ShortestPalindrome {
    private String getShortestPalindrome(String str){
       int l=0;
       int r=str.length()-1;
       int k=str.length()-1;
       while(r>l){
           if(str.charAt(l)!=str.charAt(r)){
               str=str.charAt(str.length()- k--)+str;
               l=0;
               r=str.length()-1;
           }
           else{
               l++;
               r--;
           }
       }
       return str;
    }
    public static void main(String[] args) {
        ShortestPalindrome obj=new ShortestPalindrome();
        String str="abcd";
        System.out.println(obj.getShortestPalindrome(str));
    }
}
