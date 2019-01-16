package com.bridgelabz.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.CollectionType;

import com.bridgelabz.oops.Inventory;
import com.bridgelabz.oops.InventoryList;

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
	
	
	
	public static float floatValue() {
		try {
			return sc.nextFloat();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0.0F;
	}
	
	
/////
	static ObjectMapper objectMapper = new ObjectMapper();
	////
	
	
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
	
	///////
	
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
	
	///////

	public static String readJsonFile(String filename) throws IOException{
		FileReader fr=new FileReader(filename);
		BufferedReader br=new BufferedReader(fr);
		String str ="";
		String line = "";
		while((line=br.readLine())!=null){
			str+=line;
		}
		br.close();
		return str;
	}
	
	
	/////////////
	public static Inventory insertData(){
		Inventory inventory=new Inventory();
		System.out.println("Enter the name:");
		inventory.setName(StringValue());
		System.out.println("Enter the weight");
		inventory.setWeight(floatValue());
		System.out.println("Enter the price");
		inventory.setPrice(doubleValue());
		return inventory;
	}
	
	//////////////
	
	public static void writeFile(String json,String filename) throws IOException {
		FileWriter fw=new FileWriter(filename);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(json);
		bw.close();
	}
	
	
	//////////////
	
	public static void calulatePrice(List<InventoryList> list){  
		double eachInventoryValue;
		for (int i = 0; i < list.size(); i++) {
			InventoryList inList = list.get(i);
			System.out.println("Inventory name :" + inList.getInventoryName());
			for (int j = 0; j < inList.getListofInventories().size(); j++) {
				eachInventoryValue=(inList.getListofInventories().get(j).getPrice())*(inList.getListofInventories().get(j).getWeight());
				System.out.println("total price:"+eachInventoryValue);
			}	
			System.out.println("---------------------------------------------");
		}
	}
	 
	
	//////////////
	public static Queue<Queue<String>> deckQueueStore(String[] deck )
    {
        Queue<Queue<String>> mainQueue = new Queue<Queue<String>>();
        Queue<String> queueLinkedList = new Queue<String>();
        System.out.println("Total numver of deck of cards are " + deck.length);
        for (int i = 0; i < 4; i++) {
            String[] demo = new String[9];
            for (int j = 0; j < 9; j++) {
                demo[j] = deck[i + j * 4];
            }
            String[] str2 = AlgorithmUtility.sort(demo);
            for (int k = 0; k < str2.length; k++) {
                queueLinkedList.insert(str2[k]);
            }
            mainQueue.insert(queueLinkedList);
            queueLinkedList = new Queue<String>();
            continue;
        }
        return mainQueue;
    }
	
	
	/////////////
    public static void displayDeck(Queue<Queue<String>> mainQueue)
    {
        for (int i = 0; i < mainQueue.getSize(); i++) {
            Queue<String> queue2 = mainQueue.remove();
            System.out.println("---------------------------------------- Person " + (i + 1)
                    + " -------------------------------------------");
            for (int j = 0; j < queue2.getSize(); j++) {
                System.out.print(queue2.remove() + " ");
            }
            System.out.println();
        }
    }


    ///////////////
    public static <T> List<T> userReadValue(String str, Class<?> clazz)
			throws JsonParseException, JsonMappingException, IOException {
		CollectionType colletion = objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, clazz);
		return objectMapper.readValue(str, colletion);
	}

	public static <T> String userWriteValueAsString(List<T> list)
			throws JsonGenerationException, JsonMappingException, IOException {
		return objectMapper.writeValueAsString(list);
	}
///////////////


}
