package astCss;

public class UniversalSelectorNode extends SimpleSelectorNode {
    public UniversalSelectorNode(int lineNumber) {
        super(
                "UniversalSelector",
                SimpleSelectorType.UNIVERSAL,
                "*",
                lineNumber
        );
    }
}
