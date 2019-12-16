package GoF;

/**
 * @author gaozhen@cloudwalk.cn
 * 2019年10月10日 10:55
 */
public class LazySingleton {
    private static LazySingleton lazySingleton =null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                //双重验证
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }

}
