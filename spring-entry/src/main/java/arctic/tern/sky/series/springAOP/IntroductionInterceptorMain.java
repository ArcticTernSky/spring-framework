package arctic.tern.sky.series.springAOP;

import org.springframework.aop.support.DelegatePerTargetObjectIntroductionInterceptor;

/**
 * @author Ocean
 * @date 2020/3/6.
 */
public class IntroductionInterceptorMain extends DelegatePerTargetObjectIntroductionInterceptor {

	private static long SerialVersionUID = -1234567L;

    public IntroductionInterceptorMain(Class<?> defaultImplType, Class<?> interfaceType) {
        super(defaultImplType, interfaceType);
    }
}
