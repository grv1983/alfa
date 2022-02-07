package ua.alfabank.work24;

public class Task24 {
    public static void main(String[] args){
        int num = 345 ;
        int reversNum , hundres, des, numNum;
        hundres = num / 100 ;
        System.out.println(hundres);
        des = (num - 100 * hundres) / 10 ;
        numNum = num - 100 * hundres - des * 10 ;
        reversNum = numNum * 100 + des * 10 + hundres ;
        System.out.println("Разность "+(num- reversNum);

    }
}
