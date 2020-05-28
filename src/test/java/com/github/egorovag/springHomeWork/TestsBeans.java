package com.github.egorovag.springHomeWork;

import com.github.egorovag.springHomeWork.Bean1.User;
import com.github.egorovag.springHomeWork.Bean10.AbleToSpeak;
import com.github.egorovag.springHomeWork.Bean10.Person;
import com.github.egorovag.springHomeWork.Bean2.SpringConfig;
import com.github.egorovag.springHomeWork.Bean2.User2;
import com.github.egorovag.springHomeWork.Bean3.User3;
import com.github.egorovag.springHomeWork.Bean4.User4;
import com.github.egorovag.springHomeWork.Bean5.Client5;
import com.github.egorovag.springHomeWork.Bean5.User5;
import com.github.egorovag.springHomeWork.Bean6.User6;
import com.github.egorovag.springHomeWork.Bean7.Bean7;
import com.github.egorovag.springHomeWork.Bean8.BeanResult8;
import com.github.egorovag.springHomeWork.Bean8.InterfaceForBeans;
import com.github.egorovag.springHomeWork.Bean9.User9;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestsBeans {

    //1 создать контекст с 1 бином с помощью xml
    @Test
    public void testBean1() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User bean = context.getBean(User.class);
        System.out.println(bean.toString());
        context.close();
    }

    //2 создать контекст с 1 бином с помощью java config
    @Test
    public void testBean2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        context.scan("com.github.egorovag.springHomeWork.Bean2");
//        context.refresh();
        User2 bean = context.getBean(User2.class);
        System.out.println(bean.toString());
        context.close();

    }

    //3 создать контекст с 1 бином с помощью аннотаций
    @Test
    public void testBean3() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.github.egorovag.springHomeWork.Bean3");
        User3 bean = context.getBean("user3", User3.class);
        System.out.println(bean.toString());
        context.close();
    }

    //4 сделать инжект бина через поле
    @Test
    public void testBean4() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.github.egorovag.springHomeWork.Bean4");
        User4 bean = context.getBean("user4", User4.class);
        System.out.println(bean.toString());
        context.close();
    }

    //5 сделать инжект бина через сеттер
    @Test
    public void testBean5() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.github.egorovag.springHomeWork.Bean5");
//        context.register(Client5.class,User5.class);
        context.refresh();
        User5 bean = context.getBean("user5", User5.class);
        System.out.println(bean.toString());
        context.close();
    }

    //6 сделать инжект бина через конструктор
    @Test
    public void testBean6() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.github.egorovag.springHomeWork.Bean6");
        User6 bean = context.getBean("user6", User6.class);
        System.out.println(bean.toString());
        context.close();
    }

    //7 сделать инжект 2 бинов одного интерфейса по имени
    @Test
    public void testBean7() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.github.egorovag.springHomeWork.Bean7");
        Bean7 bean = context.getBean("bean7", Bean7.class);
        bean.getUserClient().registration();
        bean.getUserAdministrator().registration();
        System.out.println(bean.toString());
        context.close();
    }

    //8 сделать инжект списка бинов через конструктор
    @Test
    public void testBean8() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.github.egorovag.springHomeWork.Bean8");
        BeanResult8 bean = context.getBean("beanResult8", BeanResult8.class);
        for (InterfaceForBeans beans : bean.getBeans()) {
            beans.method();
        }
        context.close();
    }

    //9 сделать инжект значения из файла проперти
    @Test
    public void testBean9() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.github.egorovag.springHomeWork.Bean9");
        context.refresh();
        User9 bean = context.getBean(User9.class);
        System.out.println(bean.toString());
        context.close();
    }

    //10 Написать свой бинпостпроцессор который будет замерять время работы метода помеченного аннотацией
    @Test
    public void testBean10() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.github.egorovag.springHomeWork.Bean10");
        context.refresh();
        AbleToSpeak bean = context.getBean("person", AbleToSpeak.class);
        bean.saySay();
        bean.say();
        context.close();
    }
}
