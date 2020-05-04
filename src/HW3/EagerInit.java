package HW3;

public class EagerInit {
    private static final EagerInit instance = new EagerInit();
    private EagerInit(){}

    public static EagerInit getInstance(){
        return instance;
    }
}
