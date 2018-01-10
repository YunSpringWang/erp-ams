package com.menu;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.common.entity.SysMenu;


public class MenuTest {
	/** 
     * @param args 
     */  
    public static void main(String[] args) {  
        List<SysMenu> menus = new ArrayList<SysMenu>();
        SysMenu menu = new SysMenu();
        menu.setMenuId(1);
        menu.setMenuName("根目录");
        menu.setMenuFatherId(1);
        menu.setMenuUrl(null);
        menu.setMenuController(null);
        menu.setMenuIcon("123");
        menus.add(menu);
        SysMenu menu1 = new SysMenu();
        menu1.setMenuId(2);
        menu1.setMenuName("百度搜索");
        menu1.setMenuFatherId(1);
        menu1.setMenuUrl("http://www.baidu.com");
        menu1.setMenuController(null);
        menu1.setMenuIcon("123");
        menus.add(menu1); 
        SysMenu menu2 = new SysMenu();
        menu2.setMenuId(3);
        menu2.setMenuName("搜狗搜索");
        menu2.setMenuFatherId(1);
        menu2.setMenuUrl("http://www.sogou.com");
        menu2.setMenuController(null);
        menu2.setMenuIcon("123");
        menus.add(menu2); 
        SysMenu menu3 = new SysMenu();
        menu3.setMenuId(4);
        menu3.setMenuName("百度搜索");
        menu3.setMenuFatherId(1);
        menu3.setMenuUrl("http://www.sogou.com");
        menu3.setMenuController(null);
        menu3.setMenuIcon("123");
        menus.add(menu3); 
       // HtmlMenuTree tree = new HtmlMenuTree(menus);
        TreeBuilder treeBuilder = new TreeBuilder(menus);
        System.out.println(treeBuilder.buildTree());
        String json = JSON.toJSONString(treeBuilder.buildTree());
        System.out.println("构建JSON树形结构"+json);
    } 
    
    

	/**
	 * 构建JSON树形结构
	 * 
	 * @return
	 */
/*	public String buildJSONTree() {
		List<Menu> nodeTree = buildTree();
		for(Menu menu : nodeTree){
			System.out.println("树形结构:"+menu);
		}
		 JSONArray jsonArray = JSON.parseArray(nodeTree);
		
		System.out.println("JSON树形结构:"+JSON.toJSONString(nodeTree) );
		return JSON.toJSONString(nodeTree);
	}
*/
    
}  