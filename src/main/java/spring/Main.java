package spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext((CartConfig.class));


        Cart cart = context.getBean(Cart.class);
        System.out.println(cart);

        ProductRepository repository = context.getBean(ProductRepository.class);
        System.out.println(repository);

    }
}
