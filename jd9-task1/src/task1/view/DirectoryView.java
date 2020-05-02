package task1.view;

import task1.bean.Directory;

public class DirectoryView {
	public void printDirectory(Directory directory) {

		System.out.println(directory.getDirectoryName() + " directory content " + directory.getDirectory());
	}

}
