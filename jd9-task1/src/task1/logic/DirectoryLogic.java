package task1.logic;

import java.util.List;

import task1.bean.Directory;
import task1.bean.File;

public class DirectoryLogic {
public Directory createDirectory(String directoryName) {
		
		Directory newDirectory = new Directory(directoryName);
		
		return newDirectory;
		
	}
	
	public Directory renameDirectory(Directory directory, String newNameDirectory) {
		
		directory.setDirectoryName(newNameDirectory);
		
		return directory;
	}
	
	public Directory addFileToDirectory(Directory directory, List<File> list) {
		
		directory.setDirectory(list);
		
		return directory;
		
	}
	
	public Directory deleteFileFromDirectory(Directory directory, File file) {
		
		directory.getDirectory().removeIf(p -> file.equals(p));
		
		return directory;
		
	}

}
