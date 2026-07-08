package com.sd.behaviouralpatterns.MementoPattern;

public class TextEditorMain {

    static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker(); // History / State Management

        editor.write("A");
        caretaker.saveState(editor);

        editor.write("B");
        caretaker.saveState(editor);

        editor.write("C");
        caretaker.saveState(editor);

        // Problem -> undo the last write!
        caretaker.undo(editor);
        caretaker.undo(editor);

        System.out.println(editor.getContent());
    }
}
