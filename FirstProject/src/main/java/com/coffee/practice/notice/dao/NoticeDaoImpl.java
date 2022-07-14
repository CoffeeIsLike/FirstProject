package com.coffee.practice.notice.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coffee.practice.notice.dto.NoticeDto;

@Repository
public class NoticeDaoImpl implements NoticeDao{

	@Autowired
	private SqlSession session;
	
	@Override
	public List<NoticeDto> getList(NoticeDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCount(NoticeDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insert(NoticeDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public NoticeDto getData(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NoticeDto getData(NoticeDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addViewCount(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(NoticeDto dto) {
		// TODO Auto-generated method stub
		
	}

}
