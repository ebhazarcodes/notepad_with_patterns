package notepadProject;

import java.util.Stack;

//Geri alýnacak iþlemleri gerçekleþtirecek Receiver nesnesi
class Document {
 private String content;

 public void setContent(String content) {
     this.content = content;
 }

 public void undoSetContent(String oldContent) {
     this.content = oldContent;
 }
}

//Geri alýnacak iþlemleri tanýmlayan Command nesnesi
interface Command {
 void execute();
 void undo();
}

class SetContentCommand implements Command {
 private Document document;
 private String oldContent;
 private String newContent;

 public SetContentCommand(Document document, String newContent) {
     this.document = document;
     this.newContent = newContent;
 }

 @Override
 public void execute() {
     oldContent = document.getContent();
     document.setContent(newContent);
 }

 @Override
 public void undo() {
     document.undoSetContent(oldContent);
 }
}

//Geri alýnacak iþlemleri tutan Invoker nesnesi
class History {
 private Stack<Command> undoStack = new Stack<>();
 private Stack<Command> redoStack = new Stack<>();

 public void execute(Command command) {
     command.execute();
     undoStack.push(command);
     redoStack.clear();
 }

 public void undo() {
     if (undoStack.isEmpty()) {
         return;
     }

     Command command = undoStack.pop();
     command.undo();
     redoStack.push(command);
 }

 public void redo() {
     if (redoStack.isEmpty()) {
         return;
     }

     Command command = redoStack.pop();
     command.execute();
     undoStack.push(command);
 }
}

//Kullaným örneði
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
