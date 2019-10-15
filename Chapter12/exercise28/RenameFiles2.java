package Chapter12.exercise28;

import java.io.File;

public class RenameFiles2 {

	public static void main(String[] args) {

		File currentDir = new File("./");

		File[] childs = currentDir.listFiles();

		for (File child : childs) {
			if (isSingleDigit(child)) child.renameTo(new File(giveNewPath(child)));
		}

	}

	private static String giveNewPath(File file) {
		int index = 0;
		for (int i = 0; i < file.getPath().length(); i++) {
			if (file.getPath().charAt(i) == '_') {
				index = i;
				break;
			}
		}

		String path1 = file.getPath().substring(0, index + 1);
		String path2 = "0";
		String path3 = file.getPath().substring(index + 1);

		return path1 + path2 + path3;

	}

	private static boolean isSingleDigit(File file) {

		int index = 0;
		for (int i = 0; i < file.getPath().length(); i++) {
			if (file.getPath().charAt(i) == '_') {
				index = i;
				break;
			}
		}

		for (int i = index; i < file.getPath().length() - 1; i++) {

			if (Character.isDigit(file.getPath().charAt(i)) && Character.isDigit(file.getPath().charAt(i + 1))) {
				return false;
			}

		}

		return true;
	}

}
