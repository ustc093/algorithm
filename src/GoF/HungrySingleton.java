package GoF;

/**
 * @author gaozhen@cloudwalk.cn
 * 2019年10月10日 11:23
 */
public class HungrySingleton {
    private static HungrySingleton hungrySingleton;

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
