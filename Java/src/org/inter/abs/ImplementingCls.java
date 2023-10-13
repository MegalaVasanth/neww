package org.inter.abs;

public class ImplementingCls extends AbstractCls implements InterfaceCls {

	@Override
	public void absMethode(Object obj) {
		System.out.println("implemented abstract Method in "+obj);
	}

	@Override
	public void interMethod(Object obj) {
		System.out.println("Interface Method is implemented in :"+obj.getClass());
	}
public static void main(String[] args) {
	InterfaceCls inter = new ImplementingCls();	
	inter.interMethod(inter);
	System.out.println("----------------------------------------------");
	AbstractCls abs = new ImplementingCls();
	abs.absMethode(abs.getClass());
	abs.interMethod(inter);
}
}
