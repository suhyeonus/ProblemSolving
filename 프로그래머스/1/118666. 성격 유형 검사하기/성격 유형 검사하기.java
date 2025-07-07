import java.util.*;

class Solution {
    static HashMap<Character, Integer> h;
    static String answer = "";
    
    public void comparing(char a, char b) {
        if(h.get(a) > h.get(b))
            answer += a;
        else if (h.get(a) < h.get(b))
            answer += b;
        else {
            if((int)a<(int)b) answer += a;
            else answer += b;
        }
    }
    
    public String solution(String[] survey, int[] choices) {
        h = new HashMap<>();
        h.put('R', 0);  h.put('T', 0);
        h.put('C', 0);  h.put('F', 0);
        h.put('J', 0);  h.put('M', 0);
        h.put('A', 0);  h.put('N', 0);
        
        
        for(int i = 0; i < survey.length; i++) {
            switch(choices[i]) {
                case 1:
                    h.put(survey[i].charAt(0), h.get(survey[i].charAt(0))+3);
                    break;
                case 2:
                    h.put(survey[i].charAt(0), h.get(survey[i].charAt(0))+2);
                    break;
                case 3:
                    h.put(survey[i].charAt(0), h.get(survey[i].charAt(0))+1);
                    break;
                case 5:
                    h.put(survey[i].charAt(1), h.get(survey[i].charAt(1))+1);
                    break;
                case 6:
                    h.put(survey[i].charAt(1), h.get(survey[i].charAt(1))+2);
                    break;
                case 7:
                    h.put(survey[i].charAt(1), h.get(survey[i].charAt(1))+3);
                    break;
            }
        }
        
        comparing('R', 'T');
        comparing('C', 'F');
        comparing('J', 'M');
        comparing('A', 'N');
        return answer;
    }
}