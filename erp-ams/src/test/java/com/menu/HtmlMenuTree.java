package com.menu;

import java.util.ArrayList;
import java.util.List;

import com.common.entity.Menu;
public class HtmlMenuTree {
	private StringBuffer html = new StringBuffer();
	private List<Menu> nodes;
	
	public HtmlMenuTree(List<Menu> nodes){
		this.nodes = nodes;
	}
	public String buildTree(){
		html.append("<li class='layui-nav-item'>");
		for (Menu node : nodes) {
			if (node.getwMenuFatherId() == null) {
				html.append("<a href='javascript:;'>" + node.getwMenuName()+ "</a>");
				build(node);
			}
		}
		html.append("</li>");
		return html.toString();
	}
	private void build(Menu node){
		List<Menu> children = getChildren(node);
		if (!children.isEmpty()) {
			html.append("<dl class='layui-nav-child'>");
			for (Menu child : children) {
				html.append("<dd><a href='javascript:;' data-url='"+child.getwMenuUrl()+"' data-id="+child.getwMenuId()+"><cite>"+child.getwMenuName()+"</cite></a></dd>");
				//build(child);
			}
			html.append("</dl>");
		} 
	}
	private List<Menu> getChildren(Menu node){
		List<Menu> children = new ArrayList<Menu>();
		Integer id = node.getwMenuId();
		for (Menu child : nodes) {
			if (id.equals(child.getwMenuFatherId())) {
				children.add(child);
			}
		}
		return children;
	}
}

