package com.acuity.rs.api;


//Generated by the injector on run.

//Extends java/lang/Object
public interface RSPlayerComposite {

	int[] getBodyColors();

	int[] getEquipmentIDs();

	int getTransformedNpcID();

	com.acuity.api.rs.wrappers.peers.composite.PlayerComposite getWrapper();

	com.acuity.rs.api.RSModel invokeGetModel(com.acuity.rs.api.RSAnimationSequence var0, int var1, com.acuity.rs.api.RSAnimationSequence var2, int var3);

	boolean isFemale();

	void setBodyColors(int[] var0);

	void setEquipmentIDs(int[] var0);

	void setFemale(boolean var0);

	void setTransformedNpcID(int var0);

	void setWrapper(com.acuity.api.rs.wrappers.peers.composite.PlayerComposite var0);
}
