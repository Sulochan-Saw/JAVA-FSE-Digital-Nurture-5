public abstract class DocumentFactory {

    // The Factory Method - subclasses will implement this
    public abstract Document createDocument();

    // Common method all factories can use
    public void openDocument() {
        Document doc = createDocument();
        doc.open();
    }
}