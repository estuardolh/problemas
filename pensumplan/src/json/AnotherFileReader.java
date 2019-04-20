package json;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class AnotherFileReader {
	public static String getTextFromFile(String path) throws IOException {
		StringBuilder res = new StringBuilder();
		File file = new File(path);
		List<String> lines = FileUtils.readLines(file, "UTF-8");
		for(int i = 0; i < lines.size(); i++) {
			res.append("\n"+lines.get(i).toString());
		}
		
		return res.toString();
	}
}
