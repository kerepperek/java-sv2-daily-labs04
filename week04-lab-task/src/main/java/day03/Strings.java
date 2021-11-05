package day03;

public class Strings {
    public static void main(String[] args) {
        String alma="alma";
        String almacopy=alma;
        System.out.println(alma==almacopy);

        String alma2="almafa".substring(0,4);
        System.out.println(alma+"/"+alma2);
        System.out.println(alma==alma2);
    }
}
