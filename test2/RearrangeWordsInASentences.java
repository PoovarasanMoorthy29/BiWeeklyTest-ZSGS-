package test2;

import java.util.ArrayList;
import java.util.Arrays;

// Rearrange words in sentences.

public class RearrangeWordsInASentences {

    private String getRearrangedStr(String s){
       String [] str=s.toLowerCase().split(" ");
        Arrays.sort(str,(a,b)-> a.length()-b.length());
        StringBuilder sb=new StringBuilder();
        sb.append(str[0].substring(0,1).toUpperCase()+str[0].substring(1));
        for(int i=1;i<str.length;i++){
            sb.append(" "+str[i].toLowerCase());
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        RearrangeWordsInASentences obj=new RearrangeWordsInASentences();
        String str="Keep calm and carry on";
        System.out.println(obj.getRearrangedStr(str));
    }

}

