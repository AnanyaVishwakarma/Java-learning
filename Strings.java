
public class Strings {

    public static void main(String[] args) {

        // String str3 = "Ananya";
        // name = name + " Vishwakarma";
        // System.out.println("Hello " + name);//no other operator can be used other than + operator 
        //System.out.println(name.charAt(2));//this in built property gives us the character which we need from a particular index
       // System.out.println(name.concat(" Vishwakarma"));//concatenation without tha + operator

       //Mutable and immutable strings
       StringBuffer sb = new StringBuffer("Ananya");
       //System.out.println(sb.capacity());//prints the size of string 
    //    System.out.println(sb.length());
    System.out.println(sb.append(" Vishwakarma"));//concatenated 
    String str = sb.toString();//it will convert the stringBuffer into string
    
    
    }

}
