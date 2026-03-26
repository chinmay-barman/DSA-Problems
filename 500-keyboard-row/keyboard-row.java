class Solution {
    public String[] findWords(String[] words) {
        HashSet<Character>set1 = new HashSet<>();
        HashSet<Character>set2 = new HashSet<>();
        HashSet<Character>set3 = new HashSet<>();
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";
        for(int i=0;i<10;i++){
            set1.add(r1.charAt(i));
        }
        for(int i=0;i<9;i++){
            set2.add(r2.charAt(i));
        }
        for(int i=0;i<7;i++){
            set3.add(r3.charAt(i));
        }
        ArrayList<String> arr = new ArrayList<String>();
        for(int i=0;i<words.length;i++){
            HashSet<Character> selectRow;
            if(set1.contains(Character.toLowerCase(words[i].charAt(0)))){
                selectRow = set1;
            }
            else if(set2.contains(Character.toLowerCase(words[i].charAt(0)))){
                selectRow = set2;
            }
            else{
                selectRow = set3;
            }
            boolean check = true;
            for(int j=1;j<words[i].length();j++){
                if(!selectRow.contains(Character.toLowerCase(words[i].charAt(j)))){
                    check = false;
                    break;
                }
            }
            if(check){
                arr.add(words[i]);
            }
        }
        String res[] = new String[arr.size()];
        for(int i=0;i<arr.size();i++){
            res[i] = arr.get(i);
        }
        return res;
    }
}