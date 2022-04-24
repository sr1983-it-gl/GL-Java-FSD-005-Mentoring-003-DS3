package com.gl.javafsd.ds3.binarytree;

public class TreeNode <DT> {

	private DT data;
	private TreeNode<DT> leftNode;
	private TreeNode<DT> rightNode;
	private TreeNode<DT> parentNode;
	
	public TreeNode(DT data) {
		this.data = data;
	}
	
	public DT getData() {
		return data;
	}
	public void setData(DT data) {
		this.data = data;
	}
	public TreeNode<DT> getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(TreeNode<DT> leftNode) {
		this.leftNode = leftNode;		
		this.leftNode.setParentNode(this);
	}
	public TreeNode<DT> getRightNode() {
		return rightNode;
	}
	public void setRightNode(TreeNode<DT> rightNode) {
		this.rightNode = rightNode;
		this.rightNode.setParentNode(this);
	}
	
	public TreeNode<DT> getParentNode() {
		return parentNode;
	}
	public void setParentNode(TreeNode<DT> parentNode) {
		this.parentNode = parentNode;
	}
}
