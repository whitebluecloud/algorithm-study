package codewars;

public class FindMissingLetter {
    public static char findMissingLetter(char[] array)
    {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        int first = alphabet.indexOf(array[0]);

        if(first == -1) {
            alphabet = alphabet.toUpperCase();
            first = alphabet.indexOf(array[0]);
        }
        int last = alphabet.indexOf(array[array.length-1]);

        char[] alphabetArray = alphabet.substring(first, last).toCharArray();
        for(int i=0; i< array.length; i++){
            if(array[i] != alphabetArray[i]){
                return alphabetArray[i];
            }
        }
        return ' ';
    }
}
