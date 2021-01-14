package org.springframework.cwy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author cuiweiyao
 * @version CwyTestBean.java, v 0.1 2021-01-13 22:39 cuiweiyao Exp $$
 */
public class CwyTestBean implements BeanFactoryPostProcessor {
	private String value = "CwyTestBeanName";

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

	}
}