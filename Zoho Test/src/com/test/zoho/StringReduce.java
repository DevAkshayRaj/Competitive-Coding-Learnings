package com.test.zoho;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class StringReduce {
    static String reduceString(String ip){
        char temp[] = ip.toCharArray();
        String ans = "";
        for(int i=0;i<temp.length-1;i++){
            if(temp[i]==temp[i+1]){
                temp[i]='0';
                temp[i+1]='0';
                i++;
            }
        }
        for(int i=0;i<temp.length;i++){
            if(temp[i]!='0'){
                ans += String.valueOf(temp[i]);
            }
        }
        return ans;
    }
    static boolean checkUniqueness(String ip){
        if(ip.equals(""))
            return true;
        Set<Character> uniqueCharSet = new HashSet<>();
        char temp[] = ip.toCharArray();
        for(int i=0;i<temp.length;i++){
            if(uniqueCharSet.contains(temp[i])){
                return false;
            }else{
                uniqueCharSet.add(temp[i]);
            }
        }
        return true;
    }
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ip = br.readLine();
        //String ip="aaabccddd";
        String reducedString = reduceString(ip);
        //System.out.println(reducedString +" "+checkUniqueness(reducedString));
        if(!reducedString.equals("")) {
            while (!checkUniqueness(reducedString)) {
                String temp = reducedString;
                reducedString = reduceString(reducedString);
                if(temp.equals(reducedString)){
                    break;
                }
                //System.out.println(reducedString +" "+checkUniqueness(reducedString));
                if (reducedString.equals(""))
                    break;
            }
        }
        if(reducedString.equals("")){
            System.out.println("Empty String");
        } else{
            System.out.println(reducedString);
        }
    }
}
