package com.test.zoho;
import java.io.*;
public class StringAdditionOfNumbers {

    static char[] addNumbers(char[] a,char[] b,int l,int r) {
        char ans[] = new char[l+1];
        int i=l-1,j=r-1,k=l;
        int sum=0,carry=0;
        while(j>=0){
            ans[k] =(char) ((((a[i]-'0') + (b[j]-'0')+ carry) % 10)+48);
            carry = ((a[i]-'0') + (b[j]-'0')+ carry) / 10;
            i--;
            j--;
            k--;
        }
        if(carry==1){
            ans[0] = '1';
        } else{
            ans[0] = '0';
        }
        return ans;
    }

    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the First Number : ");
        String numberOne = br.readLine();
        System.out.println("Enter the Second Number : ");
        String numberTwo = br.readLine();
        int n1 = numberOne.length(),n2 = numberTwo.length();
        char[] first = numberOne.toCharArray();
        char[] second = numberTwo.toCharArray();
        char[] ans = null;
        if(n1>n2){
           ans = addNumbers(first,second,n1,n2);
        } else {
            ans = addNumbers(second,first,n2,n1);
        }
        System.out.println("The Sum of the numbers is : "+ String.valueOf(ans));
    }
}
