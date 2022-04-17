package Day15;

public class HashTableMain {
    public static void main(String[] args) {
    	HashImplement<String, Integer> hashImpl = new HashImplement();
        String message = "Paranoids are not paranoid because they are paranoid but " +
                "because they keep putting themselves deliberately into paranoid avoidable situations";

        //Split the words when a white space comes up.
        //Convert all the words in lowercase
        String[] msg = message.toLowerCase().split(" ");

        for(String word: msg) {
            //Search for the word in the hashtable
            Integer value =  hashImpl.get(word);
          
            if( value == null)
                value = 1;
            else
               
                value = value + 1;
            hashImpl.add(word , value);
            System.out.println("Value = "+value);
        }
        System.out.println(hashImpl);

        
        hashImpl.remove("avoidable");

        System.out.println(hashImpl);
    }
}