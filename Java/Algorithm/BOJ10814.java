package Java.Algorithm;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class SignUp {
    int age;
    String name;

    public SignUp(int age, String name){
        this.age = age;
        this.name = name;
    }
    
}

public class BOJ10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        List<SignUp> arr = new ArrayList<>();

        for(int i = 0; i < num; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            arr.add(new SignUp(age, name));
        }

        Collections.sort(arr, (a1, a2) -> a1.age - a2.age);

        for(SignUp s : arr){
            System.out.println(s.age + " " + s.name);
        }



      
    }
    
}
