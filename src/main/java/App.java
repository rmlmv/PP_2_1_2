import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld anotherOneBean =
                applicationContext.getBean("helloworld", HelloWorld.class);
        Cat catBean = applicationContext.getBean("catBean", Cat.class);
        Cat anotherOneCatBean = applicationContext.getBean("catBean", Cat.class);

        System.out.println("Являются ли бины \"HelloWorld\" одним и тем же объектом? "
                + (bean == anotherOneBean));
        System.out.println("Являются ли бины \"Cat\" одним и тем же объектом? "
                + (catBean == anotherOneCatBean));
    }
}