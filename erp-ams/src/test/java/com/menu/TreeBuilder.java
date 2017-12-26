package com.menu;

import java.util.ArrayList;
import java.util.List;

import com.common.entity.Menu;

public class TreeBuilder {

	List<Menu> nodes = new ArrayList<Menu>();

	public TreeBuilder(List<Menu> nodes) {
		super();
		this.nodes = nodes;
	}

	/**
	 * 构建树形结构
	 * 
	 * @return
	 */
	public List<Menu> buildTree() {
		List<Menu> treeNodes = new ArrayList<Menu>();
		List<Menu> rootNodes = getRootNodes();
		for (Menu rootNode : rootNodes) {
			buildChildNodes(rootNode);
			treeNodes.add(rootNode);
		}
		return treeNodes;
	}

	/**
	 * 递归子节点
	 * 
	 * @param node
	 */
	public void buildChildNodes(Menu node) {
		List<Menu> children = getChildNodes(node);
		if (!children.isEmpty()) {
			for (Menu child : children) {
				buildChildNodes(child);
			}
			node.setChildren(children);
		}
	}

	/**
	 * 获取父节点下所有的子节点
	 * 
	 * @param nodes
	 * @param pnode
	 * @return
	 */
	public List<Menu> getChildNodes(Menu pnode) {
		List<Menu> childNodes = new ArrayList<Menu>();
		for (Menu n : nodes) {
			if (pnode.getwMenuId().equals(n.getwMenuFatherId()) && !n.getwMenuFatherId().equals(n.getwMenuId())) {
				childNodes.add(n);
			}
		}
		return childNodes;
	}

	/**
	 * 判断是否为根节点
	 * 
	 * @param nodes
	 * @param inNode
	 * @return
	 */
	public boolean rootNode(Menu node) {
		boolean isRootNode = false;
		if (node.getwMenuFatherId().equals(node.getwMenuId())) {
			isRootNode = true;
		}
		return isRootNode;
	}

	/**
	 * 获取集合中所有的根节点
	 * 
	 * @param nodes
	 * @return
	 */
	public List<Menu> getRootNodes() {
		List<Menu> rootNodes = new ArrayList<Menu>();
		for (Menu n : nodes) {
			if (rootNode(n)) {
				rootNodes.add(n);
			}
		}
		return rootNodes;
	}
}
