package arctic.tern.sky.series.springAOP;

import arctic.tern.sky.series.springAOP.assistant.ITask;
import arctic.tern.sky.series.springAOP.assistant.MockTask;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;

/**
 * @author Ocean
 * @date 2020/3/7.
 */
public class ProxyFactoryMain {
    public static void main(String[] args) {
        aopDemo();
    }

    private static void aopDemo(){
        ITask mock = new MockTask();
        ProxyFactory proxyFactory = new ProxyFactory(mock);
        NameMatchMethodPointcutAdvisor advisor = new NameMatchMethodPointcutAdvisor();
        DiscountMethodInterceptor advice = new DiscountMethodInterceptor();
        advisor.setAdvice(advice);
        advisor.setMappedName("execute");

        proxyFactory.setInterfaces(new Class[]{ITask.class});
        proxyFactory.addAdvisor(advisor);

        ITask target = (ITask) proxyFactory.getProxy();
        target.execute();
    }
}
