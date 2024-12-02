class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] morseArr = {
            ".- a", "-... b", "-.-. c", "-.. d", ". e", "..-. f",
            "--. g", ".... h", ".. i", ".--- j", "-.- k", ".-.. l",
            "-- m", "-. n", "--- o", ".--. p", "--.- q", ".-. r",
            "... s", "- t", "..- u", "...- v", ".-- w", "-..- x",
            "-.-- y", "--.. z"
        };
        
        String[] letterArr = letter.split(" ");
        for(String l : letterArr){
            for(String i: morseArr){
                String[] s = i.split(" ");
                if(l.equals(s[0])){
                    answer+=s[1];
                }
                

            }
        }
        
        
        return answer;
    }
}