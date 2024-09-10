package kr.ac.kopo.board2.service;

import kr.ac.kopo.board2.dto.BoardDTO;
import kr.ac.kopo.board2.entity.Board;
import kr.ac.kopo.board2.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

    @Autowired
    private final BoardRepository repository;

    @Override
    public Long register(BoardDTO dto) {
        Board board = dtoToEntity(dto);
        repository.save(board);

        return board.getBno();
    }
}
