package com.ex06.test01;

public class test01 {
    public static void main(String[] args) {
        Chinese chinese = new Chinese(188, 70);
        chinese.chinaGongfu();

        Beijingmen beijingmen = new Beijingmen(180, 50);
        beijingmen.beijingOpera();

        American american = new American(160, 60);
        american.americanBoxing();
    }
}
