package Chapter12.exercise18;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class AddPackageStatement {
	
	public static void main(String[] args) throws IOException {File file = new File(args[0]);
	
	if (!file.exists()) {
		file.mkdir();
	}
	
	
	File [] sourceCode = new File[34];
	File [] mkDir = new File[sourceCode.length];
	
	for (int i = 0; i < sourceCode.length; i++) {
		mkDir[i] = new File(file.getPath() + "/chapter" + (i + 1));
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
		
		writePackage.println("package " + file.getName() + "." + mkDir[i].getName() + ";");
		writePackage.close();
	}
	
	}
	public static void convertSlashToDot(char[] path) {
		
		
		
		for (int i = 0; i < path.length; i++) {
			
			if (path[i] == '/') {
				path[i] = '.';
			}
			
		}
		
		
		
		
		
	}
	

}
