package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;
import com.example.demo.exception.NoticeNotFoundException;
import com.example.demo.model.Notice;
import com.example.demo.repo.NoticeRepo;
import java.util.List;

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

  public List<Notice> findAllNotices () {
    return noticeRepo.findAll(Sort.by(Sort.Direction.DESC, "id"));
  }

  public Notice findNoticeById(Long id) {
    return noticeRepo.findById(id)
                     .orElseThrow(() -> new NoticeNotFoundException("Notice ID %s not found".formatted(id)));
  }
}
