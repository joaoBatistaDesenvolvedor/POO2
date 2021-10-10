import java.util.ArrayList;

public class Document {
    ArrayList<String> documento = new ArrayList<>();
    
    public Document() {
        documento.add("This is original text.");
    }

    public void Write(String texto) {
        documento.add(texto);
    }
    
    public void Erase(String texto) {
        documento.remove(texto);
    }
    
    public void Erase(int i) {
        documento.remove(i);
    }
    
    public String readDocument() {
        String str = "";
        for (String string : documento) {
            str += string + " ";
        }
        return str;
    }
}