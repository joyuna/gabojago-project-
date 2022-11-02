
package com.bitcamp.gabojago.service;

import com.bitcamp.gabojago.dao.JangSoReviewDao;
import com.bitcamp.gabojago.vo.JangSoReview;
import com.bitcamp.gabojago.vo.RecAttachedFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultJangSoReviewService implements JangSoReviewService  {

  @Autowired
  JangSoReviewDao jangSoReviewDao;
  @Override
  public List<JangSoReview> jangSoReviewList(int recono) throws Exception {
    return jangSoReviewDao.jangSoReviewList(recono);
  }

  @Override
  public RecAttachedFile getAttachedFile(int fileNo) throws Exception {
    return null;
  }

  @Override
  public boolean deleteAttachedFile(int fileNo) throws Exception {
    return false;
  }
}
