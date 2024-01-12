package com.shop.dto;


import com.shop.entity.Board;
import com.shop.entity.Member;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

import java.time.LocalDate;

@Getter
@Setter
@Data
public class WriteFormDto {
    @NotBlank(message = "제목은 필수 입력 값 입니다.")
    private String title;
    @NotBlank(message = "내용은 필수 입력 값 입니다.")
    private String content;

    private String writer;

    private LocalDate localDate;


    private static ModelMapper modelMapper = new ModelMapper();

    public static WriteFormDto of(Board board) {
        return modelMapper.map(board, WriteFormDto.class);
    }
}
