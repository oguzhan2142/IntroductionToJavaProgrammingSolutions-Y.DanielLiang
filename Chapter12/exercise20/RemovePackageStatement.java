package Chapter12.exercise20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class RemovePackageStatement {

	
	public static void main(String[] args) throws IOException {
		
		makeDirectoryAndSourceFileIfNotExist();
		
		
		File file = new File(args[0]);
		
		File[] sourceFile = new File[34];
		
		for (int i = 0; i < sourceFile.length; i++) {
			
			sourceFile[i] = new File(file.getPath() + "/chapter" + (i+1) + "/sourceCode" + (i+1) + ".java"); 
			
			
			Scanner input = new Scanner(sourceFile[i]);
			ArrayList<String> sourceCodes = new ArrayList<String>();
			
			while (input.hasNext()) {
				String line = input.nextLine();
				if (!isLinePackageLine(line)) {
					sourceCodes.add(line);
				}
				
			}
			input.close();
				
			PrintWriter output = new PrintWriter(sourceFile[i]);
			for (int j = 0; j < sourceCodes.size(); j++) {
				output.println(sourceCodes.get(i));
				
			}
			output.close();
			
			
		}
		
		
		
		
		
	}
	
	
	
	public static boolean isLinePackageLine(String line) {
		
		if (line.matches("package")) {
			return true;
		}
		
		return false;
	}

	private static void makeDirectoryAndSourceFileIfNotExist() throws IOException, FileNotFoundException {
		String path = "src/Chapter12/exercise20/srcRootDirectory";
		
		File pathFile = new File(path);
		
		if (!pathFile.exists()) {
			pathFile.mkdir();
		}
		
		
		File [] sourceCode = new File[34];
		File [] mkDir = new File[sourceCode.length];
		
		for (int i = 0; i < sourceCode.length; i++) {
			mkDir[i] = new File(pathFile.getPath() + "/chapter" + (i + 1));
			if (!mkDir[i].exists()) {
				mkDir[i].mkdir();
			}
			
			sourceCode[i] = new File(mkDir[i].getPath() + "/sourceCode" + (i + 1) + ".java");
			if (!sourceCode[i].exists()) {
				sourceCode[i].createNewFile();
			}
		}
		
		for (int i = 0; i < sourceCode.length; i++) {
			
			PrintWriter writePackage = new PrintWriter(sourceCode[i]);
			
			writePackage.println("package " + pathFile.getName() + "." + mkDir[i].getName() + ";");
			writePackage.close();
		}
	}
	
	
	
}
