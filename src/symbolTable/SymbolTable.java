package symbolTable;

import java.util.HashMap;

public class SymbolTable {

    public static class SymbolEntry {
        private String name;
        private HashMap<String, Object> attributes = new HashMap<>();

        public SymbolEntry(String name) {
            this.name = name;
        }

        public void setAttribute(String key, Object value) {
            attributes.put(key, value);
        }

        public Object getAttribute(String key) {
            return attributes.get(key);
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name +
                    " | kind: " + attributes.getOrDefault("kind", "unknown") +
                    " | line: " + attributes.getOrDefault("line", "unknown");
        }
    }

    private HashMap<String, SymbolEntry> table = new HashMap<>();

    public SymbolEntry insert(String name, int lineNumber, String kind) {
        SymbolEntry entry = new SymbolEntry(name);
        entry.setAttribute("kind", kind);
        entry.setAttribute("line", lineNumber);
        table.put(name, entry);
        return entry;
    }

    public void print() {
        System.out.println("\n=== Symbol Table ===");
        if (table.isEmpty()) {
            System.out.println("  (No symbols found)");
        } else {
            for (SymbolEntry entry : table.values()) {
                System.out.println("  " + entry);
            }
        }
        System.out.println("=====================\n");
    }
}