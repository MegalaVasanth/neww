package org.inter.abs;

public abstract class AbstractCls implements InterfaceCls {
	public abstract void absMethode(Object obj);

	private void nonabsMethod() {
		System.out.println("Non abstract Method...");
	}

	public AbstractCls() {

		System.out.println("Abstract class Constructor...");
	}

	@Override
	public void interMethod(Object obj) {
		System.out.println("Implementing Interface in :" + obj.getClass());
	}
}
