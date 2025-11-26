public class Cwh_14_string_methods {

    public static void main(Srings[] args) {
        Srings name ="harry";
        int value =name.length();
        System.out.println(value);
        Srings lString=name.toLowerCase();
    System.out.println(lString);
        Srings ustring  =name.toUpperCase();
        System.out.println(ustring);
        Srings  nonTrimmedString ="        Shivam        ";
        System.out.println(nonTrimmedString);
        Srings trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);
        System.out.println(name.substring(1));
        System.out.println(name.substring(0,5));
        System.out.println(name.replace('r', 'p'));
        System.out.println(name.replace("r","ier"));
        System.out.println(name.startsWith("par"));
        System.out.println(name.endsWith("f"));
    System.out.println(name.charAt(3));
        System.out.println(name.indexOf("r"));
        System.out.println(name.equals("harry"));
        System.out.println(name.equalsIgnoreCase("Harry"));
        System.out.println("hello i am \tShivam gupta\" ");


    }
}