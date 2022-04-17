package Day15;

public class HashTableMain {
	public static void main(String[] args) {
		HashImplement<String, Integer> hashImpl = new HashImplement();
        String message = "To be or not to be";

        
        String[] msg = message.toLowerCase().split(" ");

        for(String word: msg) {
            
            Integer value =  hashImpl.get(word);
            
            if( value == null) {
                value = 1;
            }
            else {
               
                value = value + 1;
            hashImpl.add(word , value);
        }
        System.out.println(hashImpl);
    }
}
}