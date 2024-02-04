import StringDocument.StringNumberDoc;

public class Main {
    public static void main(String[] args) {
        String doc="1111-aaaa-2222-bbbb-1b2b";
        StringNumberDoc.PrintBlock(doc);
        StringNumberDoc.ChangeBlock(doc);
        StringNumberDoc.PrintOnlyLetters(doc);
        StringNumberDoc.PrintLettersWithBuilder(doc);
    }
}