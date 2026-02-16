package test2;

//Croaking frags
public class CroakingFrags {
    private int getNoOfFrogs(String sound){
        int [] freq=new int[256];
        for(int i=0;i<sound.length();i++){
            freq[sound.charAt(i)]++;
        }

        int initialFreq=0;
        for(int j=0;j<freq.length;j++){
            if(initialFreq==0){
                if(freq[j]>0){
                    initialFreq=freq[j];
                }
            }
            else if(initialFreq!=freq[j]&& freq[j]!=0){
                return -1;
            }
        }
        return initialFreq;

    }

    public static void main(String[] args) {
        CroakingFrags obj=new CroakingFrags();
        String str="crcoakroak";
        System.out.println("Number Of Frogs: "+obj.getNoOfFrogs(str));
    }

}
