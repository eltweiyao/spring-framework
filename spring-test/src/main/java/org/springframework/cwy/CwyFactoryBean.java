package org.springframework.cwy;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author cuiweiyao
 * @version CwyFactoryBean.java, v 0.1 2021-01-18 22:36 cuiweiyao Exp $$
 */
public class CwyFactoryBean implements FactoryBean<CwyBean> {
	@Override
	public CwyBean getObject() throws Exception {
		CwyBean cwyBean = new CwyBean();
		cwyBean.setStr("cwy");
		return cwyBean;
	}

	@Override
	public Class<?> getObjectType() {
		return CwyBean.class;
	}
}