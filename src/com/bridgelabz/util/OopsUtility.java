package com.bridgelabz.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OopsUtility {
	static Scanner sc = new Scanner(System.in);

	public static int intValue() {
		try {
			
			return sc.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public static double doubleValue() {
		try {
			return sc.nextDouble();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0.0;
	}

	public static String StringValue() {
		try {
			return sc.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public static long longValue() {
		try {
			return sc.nextLong();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0l;
	}
	
	public static String replaceString(String first,String fullName,String phoneNum,String date,String line) {
        final  String REGEX_NAME1 = "<<name>>";
        final  String REGEX_NAME2 = "<<full name>>";
        final  String REGEX_NAME3 = "xxxxxxxxxx";
        final  String REGEX_NAME4 = "<<XX/XX/XXXX>>";
        Pattern p1 = Pattern.compile(REGEX_NAME1);
        Matcher m1 = p1.matcher(line);
        line = m1.replaceAll(first);
       
        Pattern p2 = Pattern.compile(REGEX_NAME2);
        Matcher m2 = p2.matcher(line);
        line = m2.replaceAll(fullName);
   
        Pattern p3 = Pattern.compile(REGEX_NAME3);
        Matcher m3 = p3.matcher(line);
        line = m3.replaceAll(phoneNum);

        Pattern p4 = Pattern.compile(REGEX_NAME4);
        Matcher m4 = p4.matcher(line);
        line = m4.replaceAll(date);
        return line;
    }
	public static String readFile(String str) throws FileNotFoundException {
        FileReader f = new FileReader(str);
       
        @SuppressWarnings("resource")
		BufferedReader read = new BufferedReader(f);
        String line = "";
        try {
            String word="";
            while ((word = read.readLine()) != null) {
                line = word;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return line;
    }





}
