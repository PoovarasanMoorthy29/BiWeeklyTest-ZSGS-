package test2;

import java.util.ArrayList;
import java.util.Arrays;

// Rearrange words in sentences.

public class RearrangeWordsInASentences {

    private String getRearrangedStr(String s){
        String[] str=s.split(" "); // ["Leetcode","makes","me","happy"]
        int [] strSize=new int[str.length];
        System.out.println("StringArr: "+Arrays.toString(str));


        for(int i=0;i<str.length;i++){

            strSize[i]=str[i].length();
        }
        System.out.println("StrSize:" +Arrays.toString(strSize));
        Arrays.sort(strSize); //[2,5,5,8].
        System.out.println("SortedArrSize: "+Arrays.toString(strSize));
        ArrayList<String> list=new ArrayList<>();

        for(int j=0;j<str.length;j++){
            for(int k=0;k<str.length;k++){
                if(strSize[j]==str[k].length()){
                    if(!list.contains(str[k])){
                        list.add(str[k]);
                    }

                }
            }

        }
        String rearrangedString="";
        for(int z=0;z<list.size();z++){
            if(z==0){
                String strs=list.get(z);
                char c[]=strs.toCharArray();
                c[0] =Character.toUpperCase(c[0]);

                rearrangedString+=new String(c)+" ";
            }

            else if(z!=list.size()-1){
                rearrangedString+=list.get(z)+" ";
            }
            else{
                rearrangedString+=list.get(z);
            }
        }
     return rearrangedString;
    }
    public static void main(String[] args) {
        RearrangeWordsInASentences obj=new RearrangeWordsInASentences();
        String str="Keep calm and carry on";
        System.out.println(obj.getRearrangedStr(str));
    }

}
