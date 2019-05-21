package annotation.impl;

import annotation.api.GreetingService;
import org.apache.dubbo.config.annotation.Service;

@Service()
public class AnnotationGreetingServiceImpl implements GreetingService {

    @Override
    public String sayHello(String name) {
        System.out.println("greeting service received: " + name);
        return "hello, " + name;
    }
}
