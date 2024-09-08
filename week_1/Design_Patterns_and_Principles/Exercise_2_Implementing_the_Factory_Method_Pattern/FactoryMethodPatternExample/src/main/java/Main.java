
public class Main {
	public static void main(String args[]) {
		
		WordDocumentFactory wordfactory = new WordDocumentFactory();
		Document worddocument = wordfactory.createDocument();
		worddocument.NewDocument();
		
		PdfDocumentFactory pdffactory = new PdfDocumentFactory();
		Document pdfdocument = pdffactory.createDocument();
		pdfdocument.NewDocument();
		
		ExcelDocumentFactory excelfactory = new ExcelDocumentFactory();
		Document exceldocument = excelfactory.createDocument();
		exceldocument.NewDocument();
		
	}
}
