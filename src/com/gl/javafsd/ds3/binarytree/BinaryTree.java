package com.gl.javafsd.ds3.binarytree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BinaryTree<DT> {

	private TreeNode<DT> root;
	
	public BinaryTree(TreeNode root) {
		this.root = root;
	}

	public TreeNode<DT> getRoot() {
		return root;
	}

	public void setRoot(TreeNode<DT> root) {
		this.root = root;
	}
	
	public DT findLowestCommonAncestor(DT key1, DT key2) {
		
		// Find the existence of the keys
		
		TreeNode<DT> node1 = findNode(key1);
		if (node1 == null) {
			
			System.out.println("Key " + key1 + " is not found");
			return null;
		}
		
		TreeNode<DT> node2 = findNode(key2);
		if (node2 == null) {
			
			System.out.println("Key " + key2 + " is not found");
			return null;
		}
		
		//
		List<DT> ancestorsNode1 = collectAncestors(node1);
		System.out.println("Ancestor Node for " + key1 + " is " + ancestorsNode1);
		
		List<DT> ancestorsNode2 = collectAncestors(node2);
		System.out.println("Ancestor Node for " + key2 + " is " + ancestorsNode2);
		
		DT result = findFinalOutcome(ancestorsNode1, ancestorsNode2);
		return result;
	}
	
	private DT findFinalOutcome(List<DT> ancestors1, List<DT> ancestors2) {
		
		DT result = null;
		List<DT> biggerList = null;
		List<DT> smallList = null;
		
		if (ancestors1.size() == ancestors2.size()) {
			
			biggerList = ancestors1;
			smallList = ancestors2;
		}else {
			
			biggerList = (ancestors1.size() > ancestors2.size()) ?
				ancestors1 : ancestors2;

			smallList = (ancestors1.size() < ancestors2.size()) ?
					ancestors1 : ancestors2;			
		}
	
		Iterator<DT> iterator = biggerList.iterator();
		
		//
//		Ancestor Node for 60 is [60, 30, 10]
//		Ancestor Node for 70 is [70, 30, 10]

//		Example-2
//		Ancestor Node for 20 is [20, 10]
//		Ancestor Node for 40 is [40, 20, 10]
						
		while (iterator.hasNext()) {
			
			DT element = iterator.next();
		
			if (smallList.contains(element)) {
				
				// Match found
				result = element;
				break;
			}else {
				continue;
			}			
		}
		
		return result;
	}
	
	
	private List<DT> collectAncestors(TreeNode<DT> node) {
		
		List<DT> ancestors = new ArrayList<>();
		
		TreeNode<DT> tempNode = node;
		
		while (tempNode != null) {
			
			DT ancestorData = tempNode.getData();
			ancestors.add(ancestorData);
			
			tempNode = tempNode.getParentNode();
		}
		
		return ancestors;
	}
	
	private TreeNode<DT> findNode(DT key) {
		
		return findNodeInternal(root, key);
	}
	
	private TreeNode<DT> findNodeInternal(
		TreeNode<DT> aNode, DT key){
		
		if (aNode == null) {
			return null;
		}
		
		if (aNode.getData() == key) {
			
			// Match found
			return aNode;
		}
		
		TreeNode<DT> resultNode = 
				findNodeInternal(aNode.getLeftNode(), key);
		
		if (resultNode != null) {
			return resultNode;
		}
		
		resultNode = 
			findNodeInternal(aNode.getRightNode(), key);
		return resultNode;
	}
}
