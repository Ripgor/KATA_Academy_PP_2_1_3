import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        // создание context для чтения config-файла
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Создание бинов
        // Здесь Возвращается тип Object, поэтому мы самостоятельно кастим до нужного класса
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        // А вот здесь я явно указал класс и кастить не нужно
        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        Cat cat2 = applicationContext.getBean("cat", Cat.class);

        System.out.println("Is bean equal to bean2? " + (bean == bean2));       // true
        System.out.println("Is cat1 equal to cat2? " + (cat1 == cat2));     // false
    }
}