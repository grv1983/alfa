package ua.alfabank.work22;

public class Task22 {
    public static void main(String[] args){
        long currentTimeSeconds = System.currentTimeMillis()/1000;
        int coefficient =60;
        long ss,mm,hh,dd;
        ss = currentTimeSeconds % coefficient;
        mm = currentTimeSeconds / coefficient % coefficient;
        hh = currentTimeSeconds / coefficient / coefficient % 24 + 2;
        System.out.println("CurrentTime is  "+hh+":"+mm+":"+ss);

    }
}
