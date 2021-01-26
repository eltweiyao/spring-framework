package org.springframework.cwy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author cuiweiyao
 * @version ExposeProxyTestAspect.java, v 0.1 2021-01-25 22:33 cuiweiyao Exp $$
 */
@Aspect
public class ExposeProxyTestAspect {

	@Pointcut("execution(* org.springframework.cwy.ExposeProxyTestBean.*(..))")
	public void pointCut() {
	}

	@Before("pointCut()")
	public void before() {
		System.out.println("ExposeProxyTestAspect::before");
	}
}