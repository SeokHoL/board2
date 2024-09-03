package kr.ac.kopo.board2.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude = "writer")
public class Board extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bno;

    private String title;
    private String content;
    
    @ManyToOne(fetch = FetchType.LAZY) //board쪽에서 봤을때 board가 다수고  member가 1이기 때문에
    private Member writer;  //forignyKey 설정이 된거임 (참조무결성 유지)
    


}
