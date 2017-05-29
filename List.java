import java.io.*;
import java.util.*;

public class List {
	public static void main (String[] args) {
		String listFilename = args[0] + ".list";

		try {
			// Read .list file
			BufferedReader listFile = new BufferedReader(new FileReader(listFilename));
			String line;
			ArrayList<String> listItems = new ArrayList<String>();
			while ((line = listFile.readLine()) != null) {
				listItems.add(line);
			}
			listFile.close();

			// Write .html file
			BufferedWriter htmlListFile = new BufferedWriter(new FileWriter(args[0] + ".html"));
			htmlListFile.write("<!DOCTYPE HTML>");
			htmlListFile.write("<html>");
			htmlListFile.write("<head>");
			htmlListFile.write("<title>" + args[0].substring(0, 1).toUpperCase() + args[0].substring(1) + "</title>");
			htmlListFile.write("</head>");
			htmlListFile.write("<body>");
			htmlListFile.write("<ul>");
			for (int i = 0; i < listItems.size(); i++) {
				htmlListFile.write("<li>" + listItems.get(i) + "</li>");
			}
			htmlListFile.write("</ul>");
			htmlListFile.write("</body>");
			htmlListFile.write("</html>");
			htmlListFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occured!");
		} catch (IOException e) {
			System.out.println("An error occured!");
		}
	}
}