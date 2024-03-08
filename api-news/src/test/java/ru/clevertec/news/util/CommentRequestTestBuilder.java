package ru.clevertec.news.util;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.With;
import ru.clevertec.news.entity.dto.CommentRequest;
import ru.clevertec.news.entity.dto.User;
import ru.clevertec.news.entity.dto.UserRequest;


import java.time.LocalDateTime;
import java.util.UUID;

@With
@AllArgsConstructor
@NoArgsConstructor(staticName = "aCommentRequest")
public class CommentRequestTestBuilder implements TestBuilder<CommentRequest> {

    private Long id = 1L;
    private String text = "Test text comment";
    private UserRequest userRequest = UserRequestBuilderTest.aUserRequest().build();

    @Override
    public CommentRequest build() {
        return new CommentRequest(text, id);
    }
}
