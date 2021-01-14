package org.springframework.cwy;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author cuiweiyao
 * @version BeanFactoryTest.java, v 0.1 2021-01-13 22:34 cuiweiyao Exp $$
 */
public class BeanFactoryTest {


	
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("org/springframework/cwy/beanFactoryTest.xml"));
		AbstractXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("org/springframework/cwy/beanFactoryTest.xml");
		System.out.println(applicationContext.getBeanDefinitionNames());
	}
}