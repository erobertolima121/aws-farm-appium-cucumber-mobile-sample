package Hooks;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class LerDocumentos {

	  public String lerdoctxt()throws Exception 
	  { 

	  File file = new File("C:\\Systems\\Flex\\Mobile\\aws-farm-appium-cucumber-mobile-sample\\src\\test\\readtxt.txt"); 
	  
	  @SuppressWarnings("resource")
	  BufferedReader br = new BufferedReader(new FileReader(file)); 
	  
	  String st; 
	  while ((st = br.readLine()) != null) 
	    System.out.println(st);
	  	return st;
	  }
	  
	  public List<String[]> leralldoccsv() throws IOException {

	        Reader reader = Files.newBufferedReader(Paths.get("C:\\Systems\\Flex\\Mobile\\aws-farm-appium-cucumber-mobile-sample\\src\\test\\readcsv.csv"));
	        CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();

	        List<String[]> linha = csvReader.readAll();
	        for (String[] coluna : linha)
	            System.out.println("Name : " + coluna[0] +
	                            " - Idade : " + coluna[1] +
	                            " - Email : " + coluna[2]);
	        return linha;
	    }

}
