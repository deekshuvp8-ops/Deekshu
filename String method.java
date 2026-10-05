public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "  Hello, Java World!  ";

        // 1. Length & Inspection
        System.out.println("Original String: \"" + str + "\"");
        System.out.println("Length: " + str.length());                 // 22
        System.out.println("Character at index 4: " + str.charAt(4)); // 'l'
        System.out.println("Is Empty: " + str.isEmpty());            // false

        // 2. Trimming Whitespace
        String trimmed = str.trim();
        System.out.println("Trimmed: \"" + trimmed + "\"");           // "Hello, Java World!"

        // 3. Case Conversion
        System.out.println("Uppercase: " + trimmed.toUpperCase());    // "HELLO, JAVA WORLD!"
        System.out.println("Lowercase: " + trimmed.toLowerCase());    // "hello, java world!"

        // 4. Searching & Substring
        System.out.println("Contains 'Java': " + trimmed.contains("Java"));     // true
        System.out.println("Index of 'Java': " + trimmed.indexOf("Java"));      // 7
        System.out.println("Substring (7 to 11): " + trimmed.substring(7, 11)); // "Java"

        // 5. Modification & Replacement
        System.out.println("Replaced: " + trimmed.replace("World", "Developer")); // "Hello, Java Developer!"

        // 6. Splitting
        String[] words = trimmed.split(" ");
        System.out.println("Word count: " + words.length); // 3

        // 7. Comparison
        String s1 = "Java";
        String s2 = "java";
        System.out.println("Equals: " + s1.equals(s2));                   // false
        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s2)); // true
    }
}