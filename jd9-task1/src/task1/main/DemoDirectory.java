package task1.main;

import java.util.ArrayList;
import java.util.List;

import task1.bean.Directory;
import task1.bean.File;
import task1.logic.DirectoryLogic;
import task1.logic.FileLogic;
import task1.view.DirectoryView;
import task1.view.FileView;

public class DemoDirectory {
	public static void main(String[] args) {

		FileLogic logicFile = new FileLogic();
		FileView fileView = new FileView();
		DirectoryLogic logicDirectory = new DirectoryLogic();
		DirectoryView directoryView = new DirectoryView();

		File newTextFile = logicFile.createTextFile("TextFile1", "Hello Java");
		File newTextFile2 = logicFile.createTextFile("TextFile2", "My homework");

		fileView.printContent(newTextFile);

		logicFile.addContent(newTextFile, " and World");

		fileView.printContent(newTextFile);

		logicFile.renameFile(newTextFile, "Java");

		fileView.printContent(newTextFile);

		Directory newDirectory = logicDirectory.createDirectory("Hometask");

		List<File> list = new ArrayList<File>();

		list.add(newTextFile);
		list.add(newTextFile2);

		logicDirectory.addFileToDirectory(newDirectory, list);

		directoryView.printDirectory(newDirectory);

		logicDirectory.deleteFileFromDirectory(newDirectory, newTextFile);

		directoryView.printDirectory(newDirectory);

		logicDirectory.renameDirectory(newDirectory, "Classwork");

		directoryView.printDirectory(newDirectory);

	}
}
