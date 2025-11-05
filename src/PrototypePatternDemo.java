class Document implements Cloneable {
    private String title;
    private String content;

    // Constructor
    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    protected Document clone() {
        try {
            // Object's clone() makes a shallow copy, we are safe since fields are Strings (immutable)
            return (Document) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Should never happen
        }
    }

    @Override
    public String toString() {
        return "Document [title=" + title + ", content=" + content + "]";
    }
}

public class PrototypePatternDemo {
    public static void main(String[] args) {
        // Original document
        Document originalDoc = new Document("Project Plan", "This is the original content.");

        // Clone the document
        Document clonedDoc = originalDoc.clone();

        // Modify the clone
        clonedDoc.setTitle("Project Plan - Copy");
        clonedDoc.setContent("This is the cloned content.");

        // Display both
        System.out.println("Original Document: " + originalDoc);
        System.out.println("Cloned Document: " + clonedDoc);
    }
}
