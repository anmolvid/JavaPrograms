package com.bridgelabz.oops;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.bridgelabz.util.OopsUtility;

public class Regex {

    public static void main(String[] args) throws FileNotFoundException {
        String str = "/home/admin1/Documents/Regex.txt";
        String line=OopsUtility.readFile(str);
        System.out.println("Please enter the first name");
        String firstName = OopsUtility.StringValue();
        System.out.println("Please enter the last name");
        String lastName = OopsUtility.StringValue();
        String fullname = firstName + " " + lastName;
        System.out.println("Please enter your 10 digit phone number");
        String phoneNum = OopsUtility.StringValue();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy"); 
        LocalDateTime now = LocalDateTime.now(); 
        String date=dtf.format(now);
        String message = OopsUtility.replaceString(firstName, fullname, phoneNum, date, line);
        System.out.println(message);
       
    }
}

