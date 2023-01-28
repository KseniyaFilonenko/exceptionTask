package by.teachmeskills.accountingsystem;

public class ExceptionVerification {

    by.teachmeskills.accountingsystem.Document[] documents;

    public class WrongDocumentFormatException extends Exception {
        public WrongDocumentFormatException(String message) {
            super(message);
        }

        String DOCUMENT_STARTS_WITH = "555";
        String DOCUMENT_ENDS_WITH = "1a2b";
        String DOCUMENT_CONTAINS = "abc";
        String DOCUMENT_INVALID = "This Document is invalid: ";

        public void numberOfDocument(by.teachmeskills.accountingsystem.Document[] documents) throws WrongDocumentFormatException {
            for (by.teachmeskills.accountingsystem.Document document : documents) {
                if (!document.getNumberOfDocument().startsWith(DOCUMENT_STARTS_WITH)) {
                    throw new WrongDocumentFormatException(DOCUMENT_INVALID + document.getDateOfDocument());
                } else if (!document.getNumberOfDocument().contains(DOCUMENT_CONTAINS)) {
                    throw new WrongDocumentFormatException(DOCUMENT_INVALID + document.getNumberOfDocument());
                } else if (!document.getNumberOfDocument().endsWith(DOCUMENT_ENDS_WITH)) {
                    throw new WrongDocumentFormatException(DOCUMENT_INVALID + document.getNumberOfDocument());
                } else {
                    System.out.println(document);
                }
            }
        }
    }
}
