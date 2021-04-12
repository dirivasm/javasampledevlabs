package jsonhandle;

import java.io.FileReader;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonRead {

	public static void main(String[] args) {
		
		
		try {
			
			FileReader fr = new FileReader("src/main/resources/jsonsample.json");
			
			JsonParser jsonParser = new JsonParser();
			JsonObject obj = jsonParser.parse(fr).getAsJsonObject();
			
			if(obj.get("users").isJsonArray()) {
				System.out.println("Json Array Type");
				
				JsonArray arr = obj.get("users").getAsJsonArray();
				
				for (int i=0; i< arr.size(); i++) {
					JsonObject obj1 = arr.get(i).getAsJsonObject();
					
					System.out.println(obj1.get("Name"));
					System.out.println(obj1.get("Age"));
				}
				
			}else if(obj.get("users").isJsonObject()) {
				System.out.println("Json Object Type");
			}
			
			fr.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
