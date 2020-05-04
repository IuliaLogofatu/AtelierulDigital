package HW3;

public class Main {
    public static void main(String[] args){
        EagerInit eagerInit = EagerInit.getInstance();
        System.out.println(eagerInit);

        EagerInit eagerInit1 = EagerInit.getInstance();
        System.out.println(eagerInit1);
    }
}
