package pensumplan;

import java.io.IOException;

import com.google.gson.Gson;

import json.AnotherFileReader;
import pensum.Course;
import pensum.Cycle;
import pensum.Pensum;
import pensum.Root;

public class Main {

	public static void main(String[] args) {
		loadConfig();
	}
	
	public static void loadConfig() {
		String pensum_string = null;
		try {
			pensum_string = AnotherFileReader.getTextFromFile("pensum.json");
		} catch (IOException e) {
			e.printStackTrace();
		}
		Gson gson = new Gson();
		Root root_pensum_raw = gson.fromJson(pensum_string, Root.class);
	}
}
