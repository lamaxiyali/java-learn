package com.example.demo.test;

public class Solution {
    public static void main(String[] args) {
        String s = "010";
        Solution solution = new Solution();
        System.out.println(solution.countBinarySubstrings(s));

    }
    public int countBinarySubstrings(String s) {
        StringBuilder sb = new StringBuilder();
        int middle = s.length() / 2;
        int count = 0;
        String reverse;
        for(int i =1; i<=middle; i++){
            count += countSubStrCount(s, getSubStr(i).toString());
            count += countSubStrCount(s, getSubStr(i).reverse().toString());
        }
        return count;
    }

    // 统计一个子字符串在给定字符串出现次数
    public int countSubStrCount(String s, String sub){
        int a = 0;
        String replace = s;
        while(replace.length() >0){
            if(replace.indexOf(sub) != -1){
                int tag = replace.indexOf(sub);
                a++;
                replace = replace.substring(tag+1, replace.length());
            }
            else{
                break;
            }
        }
        return a;
    }
    public StringBuilder getSubStr(int len){
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        while(len>0){
            sb.append("0");
            len--;
            sb1.append("1");
        }
        return sb.append(sb1);

    }
}
