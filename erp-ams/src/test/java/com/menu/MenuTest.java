package com.menu;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.common.entity.Menu;


public class MenuTest {
	/** 
     * @param args 
     */  
    public static void main(String[] args) {  
        List<Menu> menus = new ArrayList<Menu>();
        Menu menu = new Menu();
        menu.setwMenuId(1);
        menu.setwMenuName("根目录");
        menu.setwMenuFatherId(1);
        menu.setwMenuUrl(null);
        menu.setwMenuController(null);
        menu.setwMenuIcon("123");
        menus.add(menu);
        Menu menu1 = new Menu();
        menu1.setwMenuId(2);
        menu1.setwMenuName("百度搜索");
        menu1.setwMenuFatherId(1);
        menu1.setwMenuUrl("http://www.baidu.com");
        menu1.setwMenuController(null);
        menu1.setwMenuIcon("123");
        menus.add(menu1); 
        Menu menu2 = new Menu();
        menu2.setwMenuId(3);
        menu2.setwMenuName("搜狗搜索");
        menu2.setwMenuFatherId(1);
        menu2.setwMenuUrl("http://www.sogou.com");
        menu2.setwMenuController(null);
        menu2.setwMenuIcon("123");
        menus.add(menu2); 
        Menu menu3 = new Menu();
        menu3.setwMenuId(4);
        menu3.setwMenuName("百度搜索");
        menu3.setwMenuFatherId(1);
        menu3.setwMenuUrl("http://www.sogou.com");
        menu3.setwMenuController(null);
        menu3.setwMenuIcon("123");
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