package annotation.action;

import annotation.api.GreetingService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component("annotationConsumer")
public class GreetingServiceConsumer {
    @Reference // dung de noi dung define ra doi tuong greetingService
    private GreetingService greetingService;

    public String doSayHello(String name) {
        return greetingService.sayHello(name);

    }
}
