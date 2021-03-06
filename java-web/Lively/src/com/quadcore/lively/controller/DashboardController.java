package com.quadcore.lively.controller;

import java.util.List;

import com.quadcore.lively.model.StmtVO;
import com.quadcore.lively.model.WordVO;
import com.quadcore.lively.service.DashboardService;

public class DashboardController {
	private DashboardService service;
	
	public DashboardController() {
		service = new DashboardService();
	}
	
	public List<WordVO> searchWords(String word) {
		return service.searchWords(word);
	}

	public List<StmtVO> searchStatements(String word) {
		return service.searchStatements(word);
	}

	public List<String> searchPerhapsWords(String word, List<WordVO> wordVOList) {
		return service.searchPerhapsWords(word, wordVOList);
	}
	
//	public String getWordMeans(String word) {
//		return service.getWordMeans(word);
//	}
	

}
