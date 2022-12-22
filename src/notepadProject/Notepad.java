package notepadProject;

class Notepad {
    public static void main(String[] args) {
        Document document = new Document();
        History history = new History();

        // Ýçerik deðiþtirme iþlemi gerçekleþtiriliyor
        history.execute(new SetContentCommand(document, "Bu bir notepad uygulamasýdýr."));

        // Ýçerik deðiþtirme iþlemi geri alýnýy
        history.undo();

        // Ýçerik deðiþtirme iþlemi tekrar gerçekleþtiriliyor
        history.redo();
    }
}