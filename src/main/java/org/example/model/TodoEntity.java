package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


/**
 * @Data -> @Getter, @Setter, @ToString, @EqualsAndHashCOde, @RequiredArgsConstructor 를 한번에 명시하는 효과
 * @Entity
 * -> @Entity 어노테이션을 클래스에 선언하면 그 클래스는 JPA 가 관리한다.
 * -> 반드시 no-arg(파라미터가 없는) 생성자를 가지고 있어야함
 * @NoArgsConstructor -> 기본 생성자 자동 생성
 * @AllArgsConstructor -> 필드값을 모두 포함한 생성자 자동 생성
 */

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
//실제 데이터베이스와 연관된 클래스
public class TodoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String title;
    
    //order 키워드는 H2 데이터베이스에서 이미 예약어로 사용되기에 name를 새로 지정
    @Column(name = "todoOrder", nullable = false)
    private Long order;
    
    private Boolean completed;
}
