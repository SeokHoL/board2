package kr.ac.kopo.board2.service;

import kr.ac.kopo.board2.dto.BoardDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardServiceTests {

    @Autowired
    private BoardService boardService;

    @Test
    public void testRegister(){
        BoardDTO dto = BoardDTO.builder()
                .title("101 Boardtest..")
                .content("101 Board Test,Board Test,Board Test")
                .writerEmail("user7@kopo.ac.kr")
                .build();
        Long bno = boardService.register(dto);

        System.out.println("정상적으로 글이 저장되었습니다: " +bno);
    }
}
