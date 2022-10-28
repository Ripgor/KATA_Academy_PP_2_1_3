import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration      // аннотация для обозначения конфиг-класса
public class AppConfig {
 
    @Bean(name="helloworld")        // @Bean "управляет" созданием объектов
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name="cat")
    @Scope("prototype")     // Чтобы каждый раз создавался новый объект
    public Cat getCat() {
        Cat cat= new Cat();
        cat.setName("Mur");
        return cat;
    }
}