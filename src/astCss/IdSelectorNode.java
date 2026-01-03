package astCss;

public class IdSelectorNode extends SimpleSelectorNode {

    private String idName;

    public IdSelectorNode(String idName, int lineNumber) {
        super("IdSelector", SimpleSelectorType.ID, idName, lineNumber);
        this.idName = idName;
    }

    public String getIdName() {
        return idName;
    }

    @Override
    public String toString() {
        return " IdSelectorNode ( " + idName + ") (line " + lineNumber + ")";
    }
}
