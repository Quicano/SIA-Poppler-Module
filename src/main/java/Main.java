public class Main {


    public static void main(String[] args) throws Exception {
        PDFToXML converter = new PDFToXML();
        String xmlFile = converter.convertToXml("Data/wpss87-framsida-pdf.pdf");
    }
}
