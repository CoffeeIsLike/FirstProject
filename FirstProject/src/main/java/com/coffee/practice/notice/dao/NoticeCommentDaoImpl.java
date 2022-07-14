package com.coffee.practice.notice.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coffee.practice.notice.dto.NoticeCommentDto;

@Repository
public class NoticeCommentDaoImpl implements NoticeCommentDao{

	@Autowired
	private SqlSession session;
	
	@Override
	public List<NoticeCommentDto> getList(NoticeCommentDto dto) {
		return session.selectList("noticeComment.getList", dto);
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(NoticeCommentDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getSequence() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(NoticeCommentDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public NoticeCommentDto getData(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCount(int ref_group) {
		// TODO Auto-generated method stub
		return 0;
	}

}
