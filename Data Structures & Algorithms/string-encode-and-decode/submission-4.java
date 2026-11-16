class Solution {

   public String encode(List<String> strs) {
       
        StringBuilder st = new StringBuilder();
        
        for(String str : strs){

            st.append(str.length()).append('#').append(str);

        }

        return st.toString();
    }

    public List<String> decode(String str) {
        
          List<String> result = new ArrayList<>();


        int i =0 ;

        while(i<str.length()){
            
            int delimeter = str.indexOf('#', i);
            int longuer = Integer.parseInt( str.substring(i, delimeter));

            int firstIndexCaracter  = delimeter + 1;


            result.add(str.substring(firstIndexCaracter, longuer+firstIndexCaracter));

            i = longuer+firstIndexCaracter;




        }

        return result;
    }
}
