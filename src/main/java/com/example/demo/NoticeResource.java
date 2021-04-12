package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.util.List;
import com.example.demo.model.Notice;
import com.example.demo.service.NoticeService;

@RestController
@RequestMapping("/notices")
public class NoticeResource {
  private final NoticeService noticeService;

  public NoticeResource (NoticeService noticeService) {
    this.noticeService = noticeService;
  }

  @GetMapping
  public ResponseEntity<List<Notice>> getAllNotices() {
    List<Notice> notices = noticeService.findAllNotices();
    return new ResponseEntity<>(notices, HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<Notice> addNotice(@RequestBody Notice notice) {
    Notice newNotice = noticeService.addNotice(notice);
    return new ResponseEntity<>(newNotice, HttpStatus.CREATED);
  }
}
