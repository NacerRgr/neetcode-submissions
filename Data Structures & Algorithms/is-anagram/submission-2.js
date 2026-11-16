class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
       
       
        if(s.length!==t.length)
        return false


        let hash1 = new Map();
        let hash2 = new Map();
 
        for(let i  = 0 ; i<s.length ; i++){

            if(!hash1.has(s.charAt(i))){
                
                hash1.set(s.charAt(i),0)

            }else{
                hash1.set(s.charAt(i),hash1.get(s.charAt(i))+1);
            }
            if(!hash2.has(t.charAt(i))){
                hash2.set(t.charAt(i),0);
            }else{
                hash2.set(t.charAt(i),hash2.get(t.charAt(i))+1);

            }

            

        }

        for(let [key,value] of hash1){
            if(hash2.get(key) !== value ){
                return false
            }
        }
        return true;

    }
}
