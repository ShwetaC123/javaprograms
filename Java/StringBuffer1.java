package Java;
public class StringBuffer1 {
    public static void main(String[] args) {
    StringBuffer str = new StringBuffer("Cooking");
    str.append("Emergency");
    System.out.println(str);

    str.insert(16 , "Technology" );
    System.out.println(str);
    
    str.replace(26, 26, "IOT");
    System.out.println(str);

    str.reverse();
    System.out.println(str);
    
    System.out.println(str.capacity());
}
}
