package com.company;
import java.lang.StringBuffer;

public class Main {
    public static String delete(String str, char ch)
    {
        StringBuffer buffer = new StringBuffer();
        boolean pierwsza = true;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
                buffer.append(str.charAt(i));

            else{
                if(pierwsza){
                    buffer.append(str.charAt(i));
                    pierwsza=true;
                }
            }
        }
        return buffer.toString();
    }
    public static void main(String[] args) throws Exception {
        String napis = "Taakkk";
        System.out.println(delete(napis,'e'));
        napis = "Taakkk Nieee";
        System.out.println(delete(napis,'e'));
    }
}
