package kr.ac.kopo.board2.service;

import kr.ac.kopo.board2.dto.BoardDTO;
import kr.ac.kopo.board2.entity.Board;
import kr.ac.kopo.board2.entity.Member;

public interface BoardService {

    //새글을 등록하는 기능
    Long register(BoardDTO dto);

    /*
    * , 인터페이스에서 메서드의 기본 구현을 제공할 수 있게 해줍니다.
    * 즉, 인터페이스를 구현하는 클래스들이 반드시 그 메서드를 구현하지 않아도 된다는 것을 의미합니다.*/
    default Board dtoToEntity(BoardDTO dto){
        Member member = Member.builder()
                .email(dto.getWriterEmail())
                .build();

        Board board = Board.builder()
                .bno(dto.getBno())
                .title(dto.getTitle())
                .content(dto.getContent())
                .writer(member)
                .build();

        return board;
    }


}
