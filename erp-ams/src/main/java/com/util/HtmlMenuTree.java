package com.util;

import java.util.List;

import com.common.entity.SysMenu;
public class HtmlMenuTree {
	private StringBuffer html = new StringBuffer();
	private List<SysMenu> nodes;
/*	
	public HtmlMenuTree(List<SysMenu> nodes){
		this.nodes = nodes;
	}
	public String buildTree(){
		html.append("<li class='layui-nav-item'>");
		for (SysMenu node : nodes) {
			if (node.getwMenuFatherId() == null) {
				html.append("<a href='javascript:;'>" + node.getwMenuName()+ "</a>");
				build(node);
			}
		}
		html.append("</li>");
		return html.toString();
	}
	private void build(SysMenu node){
		List<SysMenu> children = getChildren(node);
		if (!children.isEmpty()) {
			html.append("<dl class='layui-nav-child'>");
			for (SysMenu child : children) {
				html.append("<dd><a href='javascript:;' data-url='"+child.getwMenuUrl()+"' data-id="+child.getwMenuId()+"><cite>"+child.getwMenuName()+"</cite></a></dd>");
				//build(child);
			}
			html.append("</dl>");
		} 
	}
	private List<SysMenu> getChildren(SysMenu node){
		List<SysMenu> children = new ArrayList<Menu>();
		Integer id = node.getwMenuId();
		for (SysMenu child : nodes) {
			if (id.equals(child.getwMenuFatherId())) {
				children.add(child);
			}
		}
		return children;
	}
*/}

