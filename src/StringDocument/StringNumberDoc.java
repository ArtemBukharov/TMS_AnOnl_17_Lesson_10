package StringDocument;


public class StringNumberDoc {
    public static void PrintBlock(String numberDoc) {
        System.out.println(numberDoc.substring(0, 4) + numberDoc.substring(9, 14));
    }

    public static void ChangeBlock(String numberDoc) {
        numberDoc = numberDoc.replaceAll("[a-zA-Z]{4}", "****");
        System.out.println(numberDoc);
    }

    public static void PrintOnlyLetters(String numberDoc) {
        numberDoc = numberDoc
                .replaceAll("[0-9-]+", "/")
                .toLowerCase();
        System.out.println(numberDoc);
    }

    public static void PrintLettersWithBuilder(String numberDoc) {
        numberDoc = numberDoc
                .replaceAll("[0-9 -]+", "/")
                .toUpperCase();
        StringBuilder stringBuilder = new StringBuilder("Letters: ").append(numberDoc);
        System.out.println(stringBuilder);

    }
}
