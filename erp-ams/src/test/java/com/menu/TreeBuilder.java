package com.menu;

import java.util.ArrayList;
import java.util.List;

import com.common.entity.SysMenu;

public class TreeBuilder {

	List<SysMenu> nodes = new ArrayList<SysMenu>();

	public TreeBuilder(List<SysMenu> nodes) {
		super();
		this.nodes = nodes;
	}

	/**
	 * 构建树形结构
	 * 
	 * @return
	 */
	public List<SysMenu> buildTree() {
		List<SysMenu> treeNodes = new ArrayList<SysMenu>();
		List<SysMenu> rootNodes = getRootNodes();
		for (SysMenu rootNode : rootNodes) {
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
	public void buildChildNodes(SysMenu node) {
		List<SysMenu> children = getChildNodes(node);
		if (!children.isEmpty()) {
			for (SysMenu child : children) {
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
	public List<SysMenu> getChildNodes(SysMenu pnode) {
		List<SysMenu> childNodes = new ArrayList<SysMenu>();
		for (SysMenu n : nodes) {
			if (pnode.getMenuId().equals(n.getMenuFatherId()) && !n.getMenuFatherId().equals(n.getMenuId())) {
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
	public boolean rootNode(SysMenu node) {
		boolean isRootNode = false;
		if (node.getMenuFatherId().equals(node.getMenuId())) {
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
	public List<SysMenu> getRootNodes() {
		List<SysMenu> rootNodes = new ArrayList<SysMenu>();
		for (SysMenu n : nodes) {
			if (rootNode(n)) {
				rootNodes.add(n);
			}
		}
		return rootNodes;
	}
}
