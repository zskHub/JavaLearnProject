package cn.zsk.basic.classload;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @Author : zsk
 * @CreateTime : 2021-07-16   15:51
 */
public class MyClassLoad extends ClassLoader{
    private String path;
    private String classLoaderName;

    public MyClassLoad(String path, String classLoaderName){
        this.path = path;
        this.classLoaderName = classLoaderName;
    }
    @Override
    public Class findClass(String name){
        byte[] b = loadClassData(name);
        return defineClass(name, b, 0, b.length);
    }

    private byte[] loadClassData(String name){
        name = path + name + ".class";
        InputStream in = null;
        ByteArrayOutputStream out = null;
        try{
            in = new FileInputStream(name);
            out = new ByteArrayOutputStream();
            int i = 0;
            while ((i = in.read()) != -1){
                out.write(i);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                out.close();
                in.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return out.toByteArray();
    }
}
