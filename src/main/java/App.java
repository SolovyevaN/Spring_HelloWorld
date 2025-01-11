import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        System.out.println(bean == bean2);


        Cat beanCat = (Cat) applicationContext.getBean("catBean");
        System.out.println(beanCat.getCatName());
        Cat beanCat2 = (Cat) applicationContext.getBean( "catBean");
        System.out.println(beanCat2.getCatName());
        System.out.println(beanCat==beanCat2);
    }
}