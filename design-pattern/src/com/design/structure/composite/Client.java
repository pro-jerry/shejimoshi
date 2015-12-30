package com.design.structure.composite;

public class Client {

	public static void main(String[] args) {
		
		AbstractFile f2,f3,f4,f5;
		Folder f1 = new Folder("我的收藏");
		f2 = new ImageFile("头像.jpg");
		f3 = new TextFile("1.txt");
		
		f1.add(f2);
		f1.add(f3);
		
		Folder f11 = new Folder("我的电影");
		f4  = new VideoFile("a.avi");
		f5 = new VideoFile("b.avi");
		f11.add(f4);
		f11.add(f5);
		
		f1.add(f11);
		
//		f2.killVirus();
		f1.killVirus();
		
	}
}
