class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] result = new int[photo.length];
        int count = 0;
        for (String[] str : photo) {
            for (String s : str) {
                for (int i=0; i<name.length; i++) if (s.equals(name[i])) result[count] += yearning[i];  
            } count++;
        } return result;
    }
}