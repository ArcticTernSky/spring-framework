package arctic.tern.sky.series.springAOP;

import arctic.tern.sky.series.springAOP.assistant.IntRange;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author Ocean
 * @date 2020/3/6.
 * Spring中没有直接定义对应Around Advice的实现接口，而是采用AOP Alliance的标准接口MethodInterceptor.
 * 可以将MethodInterceptor作为Around Advice.
 */
public class DiscountMethodInterceptor implements MethodInterceptor {

    private static final Integer DEFAULT_DISCOUNT_RATIO = 80;
    private static final IntRange RATIO_RANGE = new IntRange(5,80);

    private Integer discountRatio = DEFAULT_DISCOUNT_RATIO;
    private boolean compaignAvailable;

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        Object returnValue = methodInvocation.proceed();
        if(RATIO_RANGE.containsInteger(getDiscountRatio())){
            return ((Integer)returnValue) * getDiscountRatio()/100;
        }
        System.out.println("-DiscountMethodInterceptor.invoke!");
        return returnValue;
    }

    private Integer getDiscountRatio(){
        return discountRatio;
    }

    private void setDiscountRatio(Integer ratio){
        this.discountRatio = ratio;
    }
}
