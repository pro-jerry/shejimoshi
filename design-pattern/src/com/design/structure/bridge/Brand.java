package com.design.structure.bridge;

/**
 * 品牌
 * @author Administrator
 *
 */
public interface Brand {

	void sale();
}

class Lenovo implements Brand{

	@Override
	public void sale() {

		System.out.println("销售联想电脑");
	}
}

class Dell implements Brand{

	@Override
	public void sale() {

		System.out.println("销售DELL电脑");
	}
}
