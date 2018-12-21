package com.bob.please.board.free.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bob.please.board.free.dto.BoardFreeDto;

@Repository
public class BoardFreeDaoImpl implements BoardFreeDao{
	
	@Autowired
	private SqlSession session;
	
	@Override
	public List<BoardFreeDto> getList(BoardFreeDto dto) {
	
		return session.selectList("boardFree.getList", dto);
	}

	@Override
	public void insert(BoardFreeDto dto) {
		
		session.insert("boardFree.insert", dto);
		
	}

	@Override
	public int getCount(BoardFreeDto dto) {
		
		return session.selectOne("boardFree.getCount", dto);
	}

	@Override
	public BoardFreeDto getData(BoardFreeDto dto) {
		
		return session.selectOne("boardfree.getData2", dto);
	}

	@Override
	public void addViewCount(int num) {
		session.update("boardfree.addViewCount", num);
	}

	@Override
	public void delete(int num) {
		session.delete("boardfree.delete", num);
		
	}

	@Override
	public BoardFreeDto getData(int num) {
	
		return session.selectOne("boardfree.getData", num);
	}

	@Override
	public void update(BoardFreeDto dto) {
		
		session.update("boardfree.update", dto);
	
	}

}
