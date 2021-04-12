package jsonhandle;

import java.io.FileWriter;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWrite {

	public static void main(String[] args) {
		
	JSONObject hm = new JSONObject();
	
	hm.put("Email", "diego@gmail.com");
	hm.put("First Name", "Diego");
	hm.put("Last Name", "Rivas");
	
	HashMap<String,String> h = new HashMap<String,String>();
	h.put("Address1", "Res. Vill 2");
	h.put("City", "San Salvador");
	h.put("Country", "El Salvador");
	hm.put("Address", h);
	
	System.out.println(hm);
	
	JSONArray arr = new JSONArray();
	HashMap<String,String> h1 = new HashMap<String,String>();
	
	h1.put("empname", "emp1");
	h1.put("empid", "e001");
	arr.add(h1);
	h1.put("empname", "emp2");
	h1.put("empid", "e002");
	arr.add(h1);
	h1.put("empname", "emp3");
	h1.put("empid", "e003");
	arr.add(h1);
	
	hm.put("Employee", arr);
	
	System.out.println(hm);
	
	try {
		
		FileWriter file = new FileWriter("src/main/resources/testJsonWriting.json");
		file.write(hm.toJSONString());
		file.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	}

}
