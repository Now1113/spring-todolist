package org.example.repository;

import org.example.model.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 데이터베이스와 데이터를 주고받기 위한 인터페이스를 정의한 부분
 * 실질적인 데이터 저장소가 아닌 데이터를 주고받기 위한 인터페이스
 * TodoRepository
 */

// JpaRepository<데이터베이스와 연결될 객체, 해당 객체 id의 필드타입>
@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Long> {
}
