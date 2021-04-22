package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.util.List;
import com.example.demo.model.Notice;
import com.example.demo.service.NoticeService;

@RestController
@RequestMapping("/notices")
@CrossOrigin(origins = "https://next-js-demo-sigma.vercel.app")
public class NoticeResource {
  private final NoticeService noticeService;

  public NoticeResource (NoticeService noticeService) {
    this.noticeService = noticeService;
  }

  @GetMapping
  public ResponseEntity<List<Notice>> getAllNotices() {
    var notices = noticeService.findAllNotices();
    return new ResponseEntity<>(notices, HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Notice> getNoticeById(@PathVariable("id") Long id) {
    var notice = noticeService.findNoticeById(id);
    return new ResponseEntity<>(notice, HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<Notice> addNotice(@RequestBody Notice notice) {
    var newNotice = noticeService.addNotice(notice);
    return new ResponseEntity<>(newNotice, HttpStatus.CREATED);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<?> deleteNotice(@PathVariable("id") Long id) {
    noticeService.deleteNotice(id);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
