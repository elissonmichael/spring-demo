package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Notice;
import com.example.demo.repo.NoticeRepo;

@Service
public class NoticeService {
  private final NoticeRepo noticeRepo;

  @Autowired
  public NoticeService(NoticeRepo noticeRepo) {
    this.noticeRepo = noticeRepo;
  }

  public Notice addNotice(Notice notice) {
    return noticeRepo.save(notice);
  }
}
