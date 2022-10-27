package Programerce;
import java.util.HashMap;


public class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String,Integer> memo = new HashMap<>();

        for(int i=0;i<participant.length;i++){
            String key = participant[i];
            memo.put(key,1);
        }
        for(int i=0;i<completion.length;i++){
            String key = completion[i];
            memo.put(key,0);
        }

        for(String key : memo.keySet()){
            if(memo.get(key)==1){
                answer = key;
            }
        }


        return answer;
    }
}
