import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SearchFilesInFolders {
    public static void main(String[] args) {
        ArrayList<File> fileArrayList = new ArrayList<>();
        searchFiles(new File("E:\\"), fileArrayList);
        for(File file: fileArrayList){
            System.out.println(file.getAbsolutePath());
        }
    }

    private static void searchFiles (File rootFile, List<File> fileList){
        if(rootFile.isDirectory()){
            System.out.println("==="+ rootFile.getAbsolutePath());
            File[] directoryFiles = rootFile.listFiles();
            if(directoryFiles != null){
                for ( File file: directoryFiles){
                    if(file.isDirectory()){
                        searchFiles(file,fileList);
                    } else {
                        if(file.getName().toLowerCase().endsWith(".jpg")){
                            fileList.add(file);
                        }
                    }
                }
            }
        }
    }
}
