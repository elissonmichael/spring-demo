package com.example.demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Notice;

public interface NoticeRepo extends JpaRepository<Notice, Long> {

}
