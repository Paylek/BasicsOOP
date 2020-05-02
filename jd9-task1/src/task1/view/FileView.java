package task1.view;

import task1.bean.File;

public class FileView {
	public void printContent(File file) {

		System.out.println(
				file.getFileName() + " file size = " + file.getFileSize() + " file content: " + file.getFileContent());

	}
}
