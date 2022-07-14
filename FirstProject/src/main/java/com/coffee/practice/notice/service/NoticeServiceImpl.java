package com.coffee.practice.notice.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffee.practice.notice.dao.NoticeCommentDao;
import com.coffee.practice.notice.dao.NoticeDao;
import com.coffee.practice.notice.dto.NoticeCommentDto;
import com.coffee.practice.notice.dto.NoticeDto;

@Service
public class NoticeServiceImpl implements NoticeService{

	@Autowired 
	private NoticeDao noticeDao;
	@Autowired 
	private NoticeCommentDao noticeCommentDao;
	
	@Override
	public void getList(HttpServletRequest request) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getDetail(HttpServletRequest request) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveContent(NoticeDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateContent(NoticeDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteContent(int num, HttpServletRequest request) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveComment(HttpServletRequest request) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteComment(HttpServletRequest request) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateComment(NoticeCommentDto dto) {
		noticeCommentDao.update(dto);
		
	}

	@Override
	public void moreCommentList(HttpServletRequest request) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getData(HttpServletRequest request) {
		//수정할 글번호
		int num=Integer.parseInt(request.getParameter("num"));
		//수정할 글의 정보 얻어와서 
		NoticeDto dto=noticeDao.getData(num);
		//request 에 담아준다.
		request.setAttribute("dto", dto);
		
	}

}
