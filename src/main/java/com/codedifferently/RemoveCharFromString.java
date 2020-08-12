package com.codedifferently;


public class RemoveCharFromString {

    public String remove(String word, char unwanted){
        String str = "";

        for(int i = 0; i < word.length(); i++){
            if (unwanted != word.charAt(i)){
                str += word.charAt(i);
            }
           
        }
        return str;
        
    }
    

    /*Extra Credit Flex*/
    /*
    public String removeRecursive(String word, char ch){
        return null;
    }
    */
}
