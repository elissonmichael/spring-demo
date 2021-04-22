package com.example.demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

import com.example.demo.model.Notice;

public interface NoticeRepo extends JpaRepository<Notice, Long> {

  Optional<Notice> findNoticeById(Long id);

  void deleteNoticeById(Long id);
}
