package com.example.demo.commandobject;

import javafx.util.Pair;

import java.util.*;

/**
 * @author 32933
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light() {
            @Override
            public void on() {
                System.out.println("the light is on");
            }

            @Override
            public void off() {
                System.out.println("the light is off");
            }
        };
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();
        String s = "010010101";
        s.contains("10");
        System.out.println(countSubStrCount(s, "0011"));
        Map<String, ArrayList<String>> jj = new LinkedHashMap<>();

        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        Pair<Integer, Integer> ll = new Pair<>(11, 12);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(ll.getKey());
        System.out.println(ll.getValue());
        Set<Integer> set = new LinkedHashSet<>();
        Deque<Integer> integers = new LinkedList<>();
        }
    public static int countSubStrCount(String s, String sub){
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
}
