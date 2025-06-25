package com.example.Kopoproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity // 해당 클래스가 엔티티임을 명시 -> 테이블이 생성
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Article {

    @Id
    @GeneratedValue // row 하나 추가 시 자동으로 Id를 1씩 증가
    private Long id;

    @Column // 컬럼임을 명시해주는 애노테이션
    private String title;

    @Column
    private String content;
}

    /*
    // AllArgsConstructor
    public Article(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    // 기본 생성자(NoArgsConstructor)
    public Article() {

    }
}

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
     */

