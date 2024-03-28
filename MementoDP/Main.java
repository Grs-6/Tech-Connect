package MementoDP;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.appendText("Hello, ");
        editor.appendText("world!");

        history.saveState(editor.save());

        editor.appendText(" This is a text editor.");

        history.saveState(editor.save());

        System.out.println("Current Text: " + editor.getText());

        TextMemento lastSavedState = history.undo();
        if (lastSavedState != null) {
            editor.restore(lastSavedState);
            System.out.println("Undoing last change...");
            System.out.println("Current Text after Undo: " + editor.getText());
        } else {
            System.out.println("No more changes to undo.");
        }
    }
}