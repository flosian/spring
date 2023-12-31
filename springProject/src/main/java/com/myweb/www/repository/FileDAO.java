package com.myweb.www.repository;

import java.util.List;

import com.myweb.www.domain.FileVO;

public interface FileDAO {

	int insertFile(FileVO fvo);

	List<FileVO> getAllFile(long bno);

	int removeFile(String uuid);

	void deleteAllFile(long bno);

	List<FileVO> selectListAllFiles();

}
