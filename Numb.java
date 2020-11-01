package com.main;

public class Numb {
    public void contain(String str, int n) {
        if (str.contains("3") == true) {
            System.out.println("1) " + n + "^2 contains number 3!");
        } else {
            System.out.println("1) " + n + "^2 doesn`t contain number 3!");
        }
    }
        public String reverseStr (String str){
            char[] array = str.toCharArray();
            String str1 = "";
            for (int i = array.length - 1; i >= 0; i--) {
                str1 += array[i];
            }
            return str1;
        }
        public String firstLast (String str){
            char[] array = str.toCharArray();
            char str1 = array[0];
            char str2 = array[array.length - 1];
            array[0] = str2;
            array[array.length - 1] = str1;
            return String.valueOf(array);
        }
        public String one (String str){
            str += "1";
            String str1 = "1";
            return str1.concat(str);
        }

}
