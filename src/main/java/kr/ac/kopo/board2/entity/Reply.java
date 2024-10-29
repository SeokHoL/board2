package kr.ac.kopo.board2.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude = "board")//exclude(배제하다)
public class Reply extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rno;

    private String text;

    private String replyer;


    //지연로딩 방식으로 수정이유: 즉시로딩을 사용할경우 불피요한 join을 안할수 있다.
    @ManyToOne(fetch = FetchType.LAZY) //Reply쪽에서 봤을때 Reply가 다수고  Board가 1이기 때문에
    private Board board; //Foreign Key(참조무결성유지)
}
