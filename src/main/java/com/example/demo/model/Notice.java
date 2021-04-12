package com.example.demo.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Notice implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(nullable = false, updatable = false)
  private Long id;
  private String title;
  private String description;

  public Notice () {}

  public Notice(String title, String description) {
    this.title = title;
    this.description = description;
  }

  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getDescription(){
    return description;
  }

  @Override
  public String toString() {
    return "Notice - id: " + id + " title: " + title + " description: " + description;
  }
}
