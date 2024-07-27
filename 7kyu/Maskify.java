public class Maskify {
    public static String maskify(String str) {
        //throw new UnsupportedOperationException("Unimplemented");
      if (str.length() - 4 <= 0) return str;

        String masked = new String();  
      
        for (int i = 0; i < str.length() - 4; i++){
          
          masked = masked + "#";
        }
   
      return masked + str.substring(str.length() - 4, str.length()); 
    }
}