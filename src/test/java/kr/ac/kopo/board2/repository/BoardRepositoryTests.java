package kr.ac.kopo.board2.repository;

import kr.ac.kopo.board2.entity.Board;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootTest
public class BoardRepositoryTests {

    @Autowired
    private BoardRepository boardRepository;

    @Transactional
    @Test
    public void testRead(){
        Optional<Board> result = boardRepository.findById(5L);
        Board board =result.get();

        System.out.println(board);
        System.out.println(board.getWriter());
    }

    @Test
    public void testReadWithReply(){

        List<Object[]> result = boardRepository.getBoardWithReply(77L);
        for (Object[] arr : result){
            System.out.println(Arrays.toString(arr));
        }
    }
}
