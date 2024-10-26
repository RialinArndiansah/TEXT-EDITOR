import java.util.Stack;

public class TextEditor {
    private StringBuilder text;
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    public TextEditor() {
        text = new StringBuilder();
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    public void write(String newText) {
        undoStack.push(text.toString());
        text.append(newText);
        redoStack.clear();
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(text.toString());
            text = new StringBuilder(undoStack.pop());
        } else {
            System.out.println("Tidak ada tindakan yang bisa di-undo.");
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(text.toString());
            text = new StringBuilder(redoStack.pop());
        } else {
            System.out.println("Tidak ada tindakan yang bisa di-redo.");
        }
    }

    public void show() {
        System.out.println("Current Text: " + text.toString());
    }
}