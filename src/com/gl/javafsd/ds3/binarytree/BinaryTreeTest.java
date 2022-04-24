package com.gl.javafsd.ds3.binarytree;

public class BinaryTreeTest {

	public static void main(String[] args) {
		
		TreeNode<Integer> _40 = new TreeNode<Integer>(40);
		TreeNode<Integer> _50 = new TreeNode<Integer>(50);
		
		
		TreeNode<Integer> _20 = new TreeNode<Integer>(20);
		_20.setLeftNode(_40);
		_20.setRightNode(_50);
		

		//
		
		TreeNode<Integer> _60 = new TreeNode<Integer>(60);
		TreeNode<Integer> _70 = new TreeNode<Integer>(70);
		
		
		TreeNode<Integer> _30 = new TreeNode<Integer>(30);
		_30.setLeftNode(_60);
		_30.setRightNode(_70);
		
		//

		TreeNode<Integer> _10 = new TreeNode<Integer>(10);
		_10.setLeftNode(_20);
		_10.setRightNode(_30);

		BinaryTree<Integer> tree = new BinaryTree<Integer>(_10);
		
		findLCA(tree, 20, 30);
		findLCA(tree, 40, 30);
		findLCA(tree, 60, 70);
		findLCA(tree, 20, 40);
		
	}
	
	private static void findLCA(
		BinaryTree<Integer> tree, Integer key1, Integer key2) {
		
		Integer result 
		= tree.findLowestCommonAncestor(key1, key2);
		System.out.println("Least common ancestor ->" + result);
		
	}
}
