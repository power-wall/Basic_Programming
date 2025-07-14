package Java.Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class compareWord implements Comparator<String>{

    @Override
    public int compare(String word1, String word2) {
        if(word1.length() != word2.length()){
            return word1.length() - word2.length();
        }
        return word1.compareTo(word2);
    }
    
}

public class BOJ1181 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        HashSet<String> word = new HashSet<>();

        for(int i = 0; i < num; i++){
            word.add(bf.readLine());
        }

        List<String> wordList = new ArrayList<>(word);

        Collections.sort(wordList, new compareWord());

        for(int i = 0; i < wordList.size(); i++){
            System.out.println(wordList.get(i));
        }

        
        
    }
    
}
