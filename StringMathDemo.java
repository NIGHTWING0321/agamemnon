public class StringMathDemo {
    public static void main (String[] args){
        String str1="Green";
        String str2="lantern";

        String str3=str1.concat(" "+str2);

        System.out.println("Concatenation: " + str3);
        System.out.println(" length of str1:"+str1.length());
        System.out.println("Character of index 1:"+str1.charAt(1));
        System.out.println("substringof str2(0-3:"+str2.substring(0,3));
        System.out.println("Equals? str1 and str2:"+str1.equals(3));
        System.out.println("Uppercase str1:"+str1.toUpperCase());
        
       double a=16.0;
       double b=3.7;
       
       
       System.out.println("square rootrof a;"+ Math.sqrt(a));
        System.out.println("a raised to b;"+ Math.pow(a,b));
        System.out.println("Mix of a and b;"+Math.max(a,b));
         System.out.println("min of a and b;"+Math.min(a,b));
         System.out.println("Random number(0-1);"+ Math.random());
          System.out.println("Random number(20-1);"+(10+Math.random()*(20-1)));
          System.out.println("floor number(30-100);"+(1+Math.random()*(30-100)));
          System.out.println("cell of b;" + Math.ceil(b));


    }
}