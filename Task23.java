package ua.alfabank.work23;

public class Task23 {
    public static void main(String[] args){
        int a = -10 ;
        int b = 15 ;
        System.out.println("Значение  до   изменения переменная а = "+ a +" переменная b = "+ b );
        a = a + b ;
        b = a - b ;
        a = a - b ;
        System.out.println("Значение после изменения переменная а = "+ a +" переменная b = "+ b );

    }

}
