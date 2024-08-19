public class Main {
        public static void main(String args[]){
        String encryptedString = "EBG13 rknzcyr.";
        String decryptedString = "ROT13 example.";
        String result;
    
        result = decrypt(encryptedString);
    
        System.out.println(encryptedString + " should decrypt to " + decryptedString + "\n" + result);
    
    
    }
    
        public static String decrypt(String input){
            char[] array = input.toCharArray();
            
            for(int i = 0; i < array.length; i++){
                if(Character.isLetter(array[i])){
                    if (array[i] > 64 && array[i] < 78){
                            array[i] += 13;
                    }
                    else if(array[i] > 77 && array[i] < 90){
                            array[i] -= 13;
                    }
                    else if(array[i] > 96 && array[i] < 110){
                        array[i] += 13;
                    }
                    else if(array[i]>109 && array[i] < 123){
                        array[i] -= 13;
                    }
                }
            }
            String out = new String(array);
            return out;
        }
}
    
