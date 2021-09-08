package cn.zsk.basic.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.Proxy;

/**
 * 使用jdk动态代理和cglib动态代理demo
 *
 * @Author : zsk
 * @CreateTime : 2021-08-25   17:30
 */
public class ProxyDemo {

    /**
     * jdk动态代理
     *
     * @param object
     * @throws
     * @return: java.lang.Object
     * @time: 2021-08-25 17:43
     * @author: zsk
     */
    public static Object jdkProxyObject(Object object) {
        //拦截器
        InterceptorDemo interceptor = new InterceptorDemo();
        return Proxy.newProxyInstance(
                object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    //拦截器–前置处理
                    interceptor.before();
                    Object result = method.invoke(object, args);
                    //拦截器–后置处理
                    interceptor.after();
                    return result;
                });
    }

    /**
     * cglib动态代理
     *
     * @param object
     * @throws
     * @return: Object
     * @time: 2021-08-25 17:43
     * @author: zsk
     */
    public static Object cglibProxyObject(Object object) {
        //模拟拦截器
        InterceptorDemo interceptor = new InterceptorDemo();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(object.getClass());
        enhancer.setCallback((MethodInterceptor) (o, method, objects, methodProxy) -> {
            //拦截器–前置处理
            interceptor.before();
            Object result = method.invoke(object, objects);
            //拦截器-后置处理
            interceptor.after();
            return result;
        });
        return enhancer.create();
    }

}
