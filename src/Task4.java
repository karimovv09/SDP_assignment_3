class Task4 {
    interface TextEditor {
        String write();
    }

    class SimpleText implements TextEditor {
        public String write() {
            return "This is plain text.";
        }
    }

    abstract class TextDecorator implements TextEditor {
        protected TextEditor editor;

        public TextDecorator(TextEditor editor) {
            this.editor = editor;
        }

        public String write() {
            return editor.write();
        }
    }

    class BoldDecorator extends TextDecorator {
        public BoldDecorator(TextEditor editor) {
            super(editor);
        }

        public String write() {
            return "<b>" + super.write() + "</b>";
        }
    }

    class ItalicDecorator extends TextDecorator {
        public ItalicDecorator(TextEditor editor) {
            super(editor);
        }

        public String write() {
            return "<i>" + super.write() + "</i>";
        }
    }

    public void execute() {
        TextEditor plainText = new SimpleText();
        TextEditor boldText = new BoldDecorator(plainText);
        TextEditor italicBoldText = new ItalicDecorator(boldText);

        System.out.println(plainText.write());
        System.out.println(boldText.write());
        System.out.println(italicBoldText.write());
    }
}
