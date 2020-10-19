package com.masy.create.singleton;

/**
 * 懒汉式单例（单例对象能保证在一个jvm中，只有一个实例存在。）
 * 特点：类加载时没有生成单例，只有第一次调用getInstance方法时才创建这个单例。
 * @Author: masy
 * @Date: 2020/10/14 13:41
 * @Version: 1.0
 */
public class LazySingleton {

   /**
    * 私有构造方法，防止被实例化
    * @Author: masy
    * @Date: 2020/10/14 14:18
    * @Version: 1.0
    */
   private LazySingleton() {}

   /**私有静态实例，防止被引用*/
   private static LazySingleton instance = null;

   /**
    * 静态工程方法，创建实例
    * @Author: masy
    * @Date: 2020/10/14 14:22
    * @Version: 1.0
    * @Return: com.masy.create.singleton.LazySingleton
    */
   public static LazySingleton getInstance() {
      if (instance == null) {
        synchronized(LazySingleton.class) {
          if (instance == null) {
            instance = new LazySingleton();
          }
        }
      }
      return instance;
   }

  /**
   * 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
   * @Author: masy
   * @Date: 2020/10/14 14:32
   * @Version: 1.0
   * @Return: java.lang.Object
   */
  public Object readResolve() {
    return instance;
  }

}
