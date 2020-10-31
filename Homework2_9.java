public class Homework2_9 {
    public static void main(String[] args){
        int i = 3;
        i++;
        System.out.println(i); // "4"
        ++i;
        System.out.println(i); // "5"
        System.out.println(++i); // "6" այստեղ սկզբում կատարում է 1 գումարելու գործողությունըմ հետո տպումը
        System.out.println(i++); // "6" այստեղ ընթացիկ արժեքն է տպում, հետո ավելացնում 1
        System.out.println(i); // "7"
    }
}
