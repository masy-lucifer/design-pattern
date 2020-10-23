package com.masy.create.prototype;

import java.io.*;
import java.util.List;

/**
 * 原型类，以此为原型进行复制（必须实现Cloneable接口）
 * @Author: masy
 * @Date: 2020/10/23 15:55
 * @Version: 1.0
 */
public class Prototype implements Cloneable, Serializable {

    private static final long serialVersionUID = 633818313864168617L;

    private List<String> strs;

    /**
     * 浅复制，方法名不固定，应为Cloneable是个空接口。
     * @Author: masy
     * @Date: 2020/10/23 15:58
     * @Version: 1.0
     * @return java.lang.Object
     */
    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    /**
     * 深复制
     * @Author: masy
     * @Date: 2020/10/23 15:59
     * @Version: 1.0
     * @return java.lang.Object
     */
    public Object deepClone(){
        try {
            /* 写入当前对象的二进制流 */
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            /* 读出二进制流产生的新对象 */
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return ois.readObject();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException co) {
            co.printStackTrace();
        }
       return null;
    }

    public List<String> getStrs() {
        return strs;
    }

    public void setStrs(List<String> strs) {
        this.strs = strs;
    }
}
