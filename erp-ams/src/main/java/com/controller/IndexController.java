package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.common.entity.AuthorityMenuKey;
import com.common.entity.Menu;
import com.service.index.IndexService;
import com.util.TreeBuilder;

@Controller
@RequestMapping("/indexController")
public class IndexController {
	private static Logger logger = Logger.getLogger(IndexController.class);

	@Autowired
	public IndexService indexService;

	@RequestMapping(value = "/toIndex")
	public String toRegPage() {
		return "/index";
	}

	@RequestMapping(value = "/menuInstall", method = RequestMethod.POST)
	@ResponseBody
	public List<Menu> menuInstall() {
		AuthorityMenuKey authority = new AuthorityMenuKey();
		authority.setwAuthorityId(1);
		ArrayList<Menu> menulist = indexService.menuList(authority);
		TreeBuilder treeBuilder = new TreeBuilder(menulist);
		logger.info(treeBuilder.buildTree());
		return treeBuilder.buildTree();
	}
}
