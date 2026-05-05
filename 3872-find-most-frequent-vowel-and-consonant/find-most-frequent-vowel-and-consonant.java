class Solution {
    public int maxFreqSum(String s) {
        HashMap <Character,Integer> vowels = new HashMap<>();
        HashMap <Character, Integer> consonants = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                if(vowels.containsKey(ch)){
                    int count = vowels.get(ch);
                    vowels.put(ch, ++count);
                }
                else{
                    vowels.put(ch,1);
                }
            }
            else{
                if(consonants.containsKey(ch)){
                    int count = consonants.get(ch);
                    consonants.put(ch,++count);
                }
                else{
                    consonants.put(ch,1);
                }
            }
        }
        int maxVowel = 0;
        int maxCons = 0;
        for (Character key : vowels.keySet()) {
            if(vowels.get(key)>maxVowel){
                maxVowel = vowels.get(key);
            }
        }
        for (Character key : consonants.keySet()) {
            if(consonants.get(key)>maxCons){
                maxCons = consonants.get(key);
            }
        }
        return maxVowel+maxCons;
    }
}