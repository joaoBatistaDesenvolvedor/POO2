public class DocumentEditCommand implements Command{
    
    private Document docEditable;
    private String text;

    public DocumentEditCommand(Document doc,String text) {
        this.docEditable = doc;
        this.text = text;
        docEditable.Write(text);
    }
    
    public DocumentEditCommand(Document doc, String text, Object object) {
        this.docEditable = doc;
        this.text = text;
        docEditable.Erase(text);
    }

    @Override
    public void Redo() {
        docEditable.Write(this.text);
    }

    @Override
    public void Undo() {
        docEditable.Erase(this.text);
    }

}