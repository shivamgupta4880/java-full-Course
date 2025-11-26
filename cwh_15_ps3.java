public class cwh_15_ps3 {
    public static void main(Srings[] args) {
        //problem1
        //String namr = "jack parker";
       // namr =namr.toLowerCase();
        //System.out.println(namr);
        
        //problem 2
        //String text="To Lower Case";
        //text =text.replace(" ", "_");
        //System.out.println(text);
        
        //problem3
        Srings letter ="Dear <|name|>, thanks a lot";
        letter = letter.replace("<|name|>",  "Shivam");
        System.out.println(letter);
        //problem 4
        Srings myString = "This string contains   double and triple  spaces ";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));
        //problem 5
        Srings myLetter = "Dear Shivam.\n\tThis java course done.\n\tThanks";
        System.out.println(myLetter);


    }
    
}
