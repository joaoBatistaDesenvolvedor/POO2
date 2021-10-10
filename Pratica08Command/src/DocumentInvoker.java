import java.util.ArrayList;

public class DocumentInvoker{

    private ArrayList<Command> commands = new ArrayList<Command>();
    private Document doc = new Document();
    
    public void redo(int level) {
        commands.get(level).Redo();
    }
    
    public void undo (int level) {
        commands.get(level).Undo();
    }
    
    public void erase(String text) {
        DocumentEditCommand cmd = new DocumentEditCommand(doc,text, null);
        commands.add(cmd);
    }
    
    public void Write(String text) {
        DocumentEditCommand cmd = new DocumentEditCommand(doc,text);
        commands.add(cmd);
    }
    
    public String Read() {
        return doc.readDocument();
    }
    
}