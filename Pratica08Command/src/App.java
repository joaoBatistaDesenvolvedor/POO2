
public class App {
public static void main(String[] args) {
	DocumentInvoker invoker = new DocumentInvoker();
    invoker.Write("Here is some other text.");
    System.out.println(invoker.Read());
    
    invoker.undo(0);
    System.out.println(invoker.Read());
    
    invoker.redo(0);
    System.out.println(invoker.Read());
    
    invoker.Write("And a little more text");
    System.out.println(invoker.Read());
    
    invoker.undo(1);
    System.out.println(invoker.Read());
    
    invoker.redo(1);
    System.out.println(invoker.Read());
    
    invoker.undo(0);
    System.out.println(invoker.Read());	
}
}
