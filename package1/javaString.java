package package1;

public class javaString {
    public static void main(String[] args){
        String a="hello how are you";
        String b="hii i am fine";
        System.out.println(a.length());
        System.out.println(b.length());
        String c=a.substring(4);
        System.out.println(c);
        System.out.println(a.concat(b));
        System.out.println(a.isEmpty());
        System.out.println(a.charAt(3));
        System.out.println(a.equals(b));
        System.out.println(a==b);
        System.out.println(a.indexOf("l"));
        System.out.println(a.lastIndexOf("l"));
        System.out.println(a.contains("l"));
        System.out.println(a.startsWith("h"));
        System.out.println(a.endsWith("l"));
        String h="*".repeat(23);
        System.out.println(h);
        System.out.println(a.replace("l","g"));
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
    }
}


