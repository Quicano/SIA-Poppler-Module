import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static List<String> readPDFFiles(){
        File DataDir = new File("Data");
        ArrayList<File> fileList = new ArrayList<>(Arrays.asList(DataDir.listFiles()));
        ArrayList<String> pdfList = new ArrayList<>();
        for (File f : fileList){
            if(f.getName().endsWith(".pdf")){
                pdfList.add(f.getName());
            }
        }
        return pdfList;
    }

    public static void main(String[] args) throws Exception {
        PDFToXML converter = new PDFToXML();
        List<String> Filenames = readPDFFiles();
        for (String s : Filenames){
            converter.convertToXml("Data/"+s);
        }
    }
}
