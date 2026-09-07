public class StringMethod {
    public static void main(String[] args) {
        String s = "PiNtU";
        System.out.println(s);
        int lenght;
        //lenght of the String
        lenght=s.length();
        System.out.println(lenght);
        String lower= s.toLowerCase();
        System.out.println(lower);
        String upper= s.toUpperCase();
        System.out.println(upper);
        // remove all space
        String space = "  pintu   ";
        String removespace =space.trim();
        System.out.println(removespace);

        //return substring
        String s1 = "pintu kumar";
        System.out.println(s1.substring(2,7));

        //replace character
        System.out.println(s1.replace("pin","mith"));
       
        //startsWith
        System.out.println(s1.startsWith("pik"));
        System.out.println(s1.startsWith("pin"));

        //endsWith
        System.out.println(s1.endsWith("ar"));
        System.out.println(s1.endsWith("a"));

        // chatAt();
        System.out.println(s1.charAt(7));

        //equals();
        System.out.println(s1.equals("pintu kumar"));
        System.out.println(s1.equals("pintu"));
    }   
}
