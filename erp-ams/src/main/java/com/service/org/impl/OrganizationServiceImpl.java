package com.service.org.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.common.dao.SysOrganizationMapper;
import com.common.entity.SysOrganization;
import com.service.org.OrganizationService;


@Service("organizeService")
@Transactional
public class OrganizationServiceImpl implements OrganizationService {

	@Autowired
	private SysOrganizationMapper orgMapper;
	@Override
	public void addOrganization(SysOrganization org) {
		orgMapper.insert(org);
	}

}
