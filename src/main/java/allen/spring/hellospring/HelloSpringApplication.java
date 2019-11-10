package allen.spring.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext");

        TextEditor editor = (TextEditor) context.getBean("textEditor");
        editor.spellCheck();
    }
}
