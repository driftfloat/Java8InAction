package t;

import java.io.File;
import java.io.FileFilter;

public class FileHidden {

	public static void main(String[] args) {
		String path = "T:\\TEMP";
		File[] hiddenFiles = new File(path).listFiles(new FileFilter() {  
		    public boolean accept(File file) { 
		    	return file.isHidden(); 
		    }
		}); 
		for(File f: hiddenFiles) {
			System.out.println(f.getName());
		}
		File[] hiddenFiles2 = new File(path).listFiles(File::isHidden);
		for(File f: hiddenFiles2) {
			System.out.println(f.getName());
		}
		File[] hiddenFiles3 = new File(path).listFiles(File::isDirectory);
		for(File f: hiddenFiles3) {
			System.out.println(f.getName());
		}
		
	}

}
