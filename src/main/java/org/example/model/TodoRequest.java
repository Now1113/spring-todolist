package org.example.model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @Data -> @Getter, @Setter, @ToString, @EqualsAndHashCOde, @RequiredArgsConstructor 를 한번에 명시하는 효과
 * @NoArgsConstructor -> 기본 생성자 자동 생성
 * @AllArgsConstructor -> 필드값을 모두 포함한 생성자 자동 생성
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
//데이터베이스로부터 요청과 관련된 클래스
public class TodoRequest {

    private String title;
    private Long order;
    private Boolean completed;

}
