package com.github.egorovag.springHomeWork.Bean10;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.*;

//Аннотация @Profiling стоящая над конкретным методом: рассчитывает время выполнения этого метода
@Component
public class ProfilingBeanPostProcessor implements BeanPostProcessor {
    private Map<String, List<Method>> map = new HashMap<>();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class<?> beanClass = bean.getClass();
        Method[] declaredMethods = beanClass.getDeclaredMethods();
        map.put(beanName, new ArrayList<>());
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.isAnnotationPresent(Profiling.class)) {
                Method methodInterface = null;
                Class<?>[] interfaces = beanClass.getInterfaces();
                for (Class<?> anInterface : interfaces) {
                    try {
                        methodInterface = anInterface.getMethod(declaredMethod.getName(), declaredMethod.getParameterTypes());
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                }
                map.get(beanName).add(methodInterface);
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (map.containsKey(beanName)) {
            Class<?> beanClass = bean.getClass();
            List<Method> methods = map.get(beanName);
            return Proxy.newProxyInstance(beanClass.getClassLoader(), beanClass.getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    if (methods.contains(method)) {
                        System.out.println("Профилирую");
                        long before = System.nanoTime();
                        Object retVal = method.invoke(bean, args);
                        long after = System.nanoTime();
                        System.out.println("Время работы " + (after - before));
                        System.out.println("Закончил профилировать");
                        return retVal;
                    } else {
                        return method.invoke(bean, args);
                    }
                }
            });
        }
        return bean;
    }
}

//Аннотация @Profiling над классом: расчитывается время выполнения всех методов по отдельности
//@Component
//public class ProfilingBeanPostProcessor implements BeanPostProcessor {
//    private Map<String, Class> map = new HashMap<>();
//
//
//    @Override
//    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        Class<?> beanClass = bean.getClass();
//        if (beanClass.isAnnotationPresent(Profiling.class))
//            map.put(beanName, beanClass);
//        return bean;
//    }
//
//    @Override
//    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        Class beanClass = map.get(beanName);
//        if (beanClass != null) {
//            return Proxy.newProxyInstance(beanClass.getClassLoader(), beanClass.getInterfaces(), new InvocationHandler() {
//                @Override
//                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                    System.out.println("Профилирую");
//                    long before = System.nanoTime();
//                    Object retVal = method.invoke(bean, args);
//                    long after = System.nanoTime();
//                    System.out.println("Время работы " + (after - before));
//                    System.out.println("Закончил профилировать");
//                    return retVal;
//                }
//            });
//        }
//        return bean;
//    }
//}