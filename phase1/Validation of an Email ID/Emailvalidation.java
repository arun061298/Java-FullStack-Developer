package com.simplilearn.Email;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emailvalidation {
	public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add("arunpratap@gmail.com");  
        emails.add("rajapratap.80@gmail.com");  
        emails.add("dkingh#@domain.co.in");  
        emails.add("rudraT_semt@domain.com");  
        emails.add("google@domaincom");  
        //Add invalid emails in list  
        emails.add("@yahoo.com");  
        emails.add("12instagram#domain.com");  
        //Regular Expression   
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);  
        //Iterate emails array list  
        for(String email : emails){  
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
  

}
