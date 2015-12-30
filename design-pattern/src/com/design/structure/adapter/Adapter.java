package com.design.structure.adapter;

/**
 * 适配器本身
 * （相当于usb和ps/2的转接器）
 * @author Administrator
 *
 */
public class Adapter extends Adaptee implements Target{

	@Override
	public void handleReq() {

		super.request();
	}

	
}
