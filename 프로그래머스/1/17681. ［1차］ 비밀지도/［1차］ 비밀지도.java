import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] s1 = new String[arr1.length];
        String[] s2 = new String[arr2.length];
        for (int i=0; i<arr1.length; i++) {
            s1[i] = String.format("%0" + arr1.length + "d", 
                    Long.parseLong(Integer.toBinaryString(arr1[i])));
            s2[i] = String.format("%0" + arr2.length + "d", 
                    Long.parseLong(Integer.toBinaryString(arr2[i])));
        } String[] result = new String[arr1.length];
        for (int i=0; i<arr1.length; i++) {
            String s = "";
            for (int j=0; j<arr1.length; j++) {
                if (s1[i].charAt(j) == '1' || s2[i].charAt(j) == '1') s += "#";
                else s += " ";
            } result[i] = s;
        } return result;
    }
}