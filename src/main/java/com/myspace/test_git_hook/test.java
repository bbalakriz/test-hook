package com.myspace.test_git_hook;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class test implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private int cool;

	private int newfield;

	public test() {
	}

	public int getCool() {
		return this.cool;
	}

	public void setCool(int cool) {
		this.cool = cool;
	}

	public int getNewfield() {
		return this.newfield;
	}

	public void setNewfield(int newfield) {
		this.newfield = newfield;
	}

	public test(int cool, int newfield) {
		this.cool = cool;
		this.newfield = newfield;
	}

}