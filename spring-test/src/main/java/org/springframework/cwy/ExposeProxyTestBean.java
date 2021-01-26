package org.springframework.cwy;

import org.springframework.aop.framework.AopContext;

/**
 * @author cuiweiyao
 * @version ExposeProxyTestBean.java, v 0.1 2021-01-25 22:31 cuiweiyao Exp $$
 */
public class ExposeProxyTestBean {

	public void A() {
		System.out.println("ExposeProxyTestBean::A start");
		innerA();
	}
	public void innerA() {
		System.out.println("ExposeProxyTestBean::innerA start");
	}

	public void exposeA() {
		System.out.println("ExposeProxyTestBean::A start");
		final ExposeProxyTestBean proxy = (ExposeProxyTestBean)AopContext.currentProxy();
		proxy.innerA();
	}
}