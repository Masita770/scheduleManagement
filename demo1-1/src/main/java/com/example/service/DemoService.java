package com.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.DemoInfo;
import com.example.mapper.DemoMapper;

@Service
public class DemoService {
	@Autowired
	DemoMapper mapper;
	public List<DemoInfo> getDemoList() {
	return mapper.selectAll();
	}
	/*
	 * 仮新規追加処理 2022/04/07
	 */
	public void create(DemoInfo demoInfo) {
		mapper.add(demoInfo);
	}
	//*仮作成
//	public DemoInfo createCheck(DemoInfo cari) {
//		return mapper.createCheck(cari);
//	}
}
