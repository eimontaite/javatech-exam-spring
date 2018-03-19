package lt.egzaminas.Configuration;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class BeanLogger{

    private static final Logger logger = LogManager.getLogger(BeanLogger.class);


//    @Override
//    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("Bean: " + bean + ", with name: " + beanName + ", will be created...");
//        return bean;
//    }
//
//    @Override
//    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("Bean: " + bean + ", with name: " + beanName + ", are created...");
//        return bean;
//    }
}
