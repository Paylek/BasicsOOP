package task1.logic;

import task1.bean.File;

public class FileLogic {
	public File createTextFile(String fileName, String fileContent) {

		File textFile = new File(fileName, fileContent);

		return textFile;

	}

	public File renameFile(File textFile, String newNameFile) {

		textFile.setFileName(newNameFile);

		return textFile;

	}

	public File addContent(File textFile, String newContent) {

		textFile.setFileContent(textFile.getFileContent() + newContent);

		return textFile;
	}

}
