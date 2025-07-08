public class compress {
    
    public static String Compress(String str){
        StringBuilder compress = new StringBuilder("");
        int i = 0;
      while(i < str.length()){
            compress.append(str.charAt(i));
            char ch = str.charAt(i);
            int count = 0;
            while(i < str.length() && str.charAt(i) == ch){
              count++;
              i++;  
            }
            
            if(count > 1){
            compress.append(count);
            }
        }
        
        
        return compress.toString();

    }

    public static void main(String[] args) {
        String str = "aaaabbcd";

        System.out.println("the compressed string is "+ Compress(str));

    }

}
