package Java;
import java.util.Arrays;
import java.util.Optional;

public class StringMethodsDemo {

    public static void main(String[] args) {
        String str = "  Hello Java World!  ";
        String str2 = "hello java world!";
        String empty = "";

        // getBytes()
        byte[] bytes = str.getBytes();
        System.out.println("getBytes(): " + Arrays.toString(bytes));

        // equals()
        System.out.println("equals(): " + str.equals(str2));

        // equalsIgnoreCase()
        System.out.println("equalsIgnoreCase(): " + str.trim().equalsIgnoreCase(str2.trim()));

        // hashCode()
        System.out.println("hashCode(): " + str.hashCode());

        // indexOf()
        System.out.println("indexOf(\"Java\"): " + str.indexOf("Java"));

        // lastIndexOf()
        System.out.println("lastIndexOf(\"l\"): " + str.lastIndexOf("l"));

        // substring()
        System.out.println("substring(2, 7): " + str.substring(2, 7));

        // subSequence()
        System.out.println("subSequence(2, 7): " + str.subSequence(2, 7));

        // matches()
        System.out.println("matches(\".*Java.*\"): " + str.matches(".*Java.*"));

        // replace()
        System.out.println("replace(\"Java\", \"Python\"): " + str.replace("Java", "Python"));

        // replaceFirst()
        System.out.println("replaceFirst(\" \", \"_\" ): " + str.replaceFirst(" ", "_"));

        // replaceAll()
        System.out.println("replaceAll(\" \", \"_\"): " + str.replaceAll(" ", "_"));

        // split()
        String[] parts = str.trim().split(" ");
        System.out.println("split(\" \"): " + Arrays.toString(parts));

        // lines() – Java 11+
        String multiLine = "Line1\nLine2\nLine3";
        System.out.println("lines():");
        multiLine.lines().forEach(System.out::println);

        // indent() – Java 12+
        System.out.println("indent(4):\n" + multiLine.indexOf(4));

        // stripIndent() – Java 15+
        String indented = "    A line\n        Another line";
        System.out.println("stripIndent():\n" + indented.stripIndent());

        // transform() – Java 12+
        String upper = str.transform(s -> s.toUpperCase());
        System.out.println("transform(): " + upper);

        // format()
        String formatted = String.format("My name is %s and age is %d", "John", 25);
        System.out.println("format(): " + formatted);

        // intern()
        String s1 = new String("Java").intern();
        String s2 = "Java";
        System.out.println("intern(): " + (s1 == s2));  // true

        // valueOf() and copyValueOf()
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        System.out.println("valueOf(char[]): " + String.valueOf(chars));
        System.out.println("copyValueOf(char[]): " + String.copyValueOf(chars));

        // repeat() – Java 11+
        System.out.println("repeat(3): " + "Hi ".repeat(3));

        // describeConstable() – Java 12+
        Optional<? extends Constable> constable = str.describeConstable();
        System.out.println("describeConstable(): " + constable);

        // resolveConstantDesc() – Java 12+
        ConstantDesc desc = str.resolveConstantDesc(null);
        System.out.println("resolveConstantDesc(): " + desc);

        // formatted() – Java 15+
        String f = "My name is %s and I am %d years old.".formatted("Alice", 30);
        System.out.println("formatted(): " + f);

        // translateEscapes() – Java 15+
        String escaped = "Line1\\nLine2\\tTabbed".translateEscapes();
        System.out.println("translateEscapes(): \n" + escaped);
    }
}