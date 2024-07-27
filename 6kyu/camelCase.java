public class camelCase {

    public static String toCamelCase(String s){
    
        String[] parts = s.split("[\\-_]");
        StringBuilder result = new StringBuilder(parts[0]);

        for (int i = 1; i < parts.length; i++){

            //Using Character has more compatibility with especial characters 
            result.append(Character.toUpperCase(parts[i].charAt(0))).append(parts[i].substring(1));
        }

        return result.toString();
        
        // String aux = ""; 

        // int counter = 0;

        // for (String part : parts){

        //     if (counter == 0){
        //         aux+= part;
        //     }
        //     else{
              
        //         aux+= part.substring(0,1).toUpperCase() + part.substring(1, part.length()); 
        //     }

        //     counter++;
        // }
        // return aux;
    }

    public static void main(String[] args) {
        String str = "hello-world";
        System.out.println(toCamelCase(str));
    }
}
