package com.menu;

import java.util.ArrayList;
import java.util.List;

import com.common.entity.SysMenu;
public class HtmlMenuTree {
	private StringBuffer html = new StringBuffer();
	private List<SysMenu> nodes;
	
	public HtmlMenuTree(List<SysMenu> nodes){
		this.nodes = nodes;
	}
	public String buildTree(){
		html.append("<li class='layui-nav-item'>");
		for (SysMenu node : nodes) {
			if (node.getMenuFatherId() == null) {
				html.append("<a href='javascript:;'>" + node.getMenuName()+ "</a>");
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
				html.append("<dd><a href='javascript:;' data-url='"+child.getMenuUrl()+"' data-id="+child.getMenuId()+"><cite>"+child.getMenuName()+"</cite></a></dd>");
				//build(child);
			}
			html.append("</dl>");
		} 
	}
	private List<SysMenu> getChildren(SysMenu node){
		List<SysMenu> children = new ArrayList<SysMenu>();
		Integer id = node.getMenuId();
		for (SysMenu child : nodes) {
			if (id.equals(child.getMenuFatherId())) {
				children.add(child);
			}
		}
		return children;
	}
}

