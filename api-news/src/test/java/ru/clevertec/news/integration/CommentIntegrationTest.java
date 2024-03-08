//package ru.clevertec.news.integration;
//
//import com.github.tomakehurst.wiremock.junit5.WireMockTest;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.web.reactive.function.client.ClientResponse;
//import org.springframework.web.reactive.function.client.WebClient;
//import ru.clevertec.news.service.CommentService;
//
//import java.util.Map;
//
//import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
//import static com.github.tomakehurst.wiremock.client.WireMock.get;
//import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
//import static org.assertj.core.api.Assertions.assertThat;
//
//
//@SpringBootTest
//@WireMockTest(httpPort = 9998)
//@ActiveProfiles("test")
//class CommentIntegrationTest {
//
//
//    @Autowired
//    private CommentService commentService;
//
//    @Autowired
//    private WebClient.Builder webClient;
//
//    @Test
//    void test(){
//        stubFor(get("/comments/1").willReturn(aResponse().withStatus(200)));
//        ClientResponse block = webClient.build().get()
//                .uri(uriBuilder ->
//                        uriBuilder
//                                .scheme("http")
//                                .host("localhost")
//                                .port(9998)
//                                .path("/comments/{id}")
//                                .build(Map.of("id", 1))
//                )
//                .exchange().block();
//        assertThat(block.statusCode().is2xxSuccessful()).isTrue();
//
//    }
//
//
//    //    @Test
////    void shouldReturnCommentWhenCommentExists() throws JsonProcessingException {
////
////        CommentRequest commentRequest = CommentRequestTestBuilder.aCommentRequest().build();
////        String json = mapper.writeValueAsString(commentRequest);
////
////        CommentResponse commentResponse = CommentResponseTestBuilder.aCommentResponse().build();
////        ResponseEntity<CommentResponse> expected = ResponseEntity.ok().body(commentResponse);
////
////        stubFor(WireMock.get("/comment-server/comments/1")
////                .willReturn(aResponse()
////                        .withStatus(200)
////                        .withHeader("Content-Type", "application/json")
////                        .withBody(json)));
////
////        ResponseEntity<CommentResponse> actual = commentService.get(1L).block();
////
////        assertThat(actual).isEqualTo(expected);
////    }
////    @Test
////    void shouldReturnCommentWhenCommentExists() throws JsonProcessingException {
////        // Arrange
////        Long commentId = 1L;
////        CommentResponse expectedResponse = CommentResponseTestBuilder.aCommentResponse().build();
////        String json = new ObjectMapper().writeValueAsString(expectedResponse);
////        stubFor(WireMock.get("/comments/1")
////                .willReturn(aResponse()
////                        .withHeader("Content-Type", "application/json")
////                        .withBody(json)
////                        .withStatus(200)));
////
////        // Act
////        Mono<ResponseEntity<CommentResponse>> result = commentService.get(commentId);
////
////        var body = result.block().getBody();
////
////        // Assert
////        StepVerifier.create(result)
////                .expectNextMatches(response -> {
////                    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
//////                    assertThat(response.getBody()).isEqualToComparingFieldByField(expectedResponse);
////                    return true;
////                })
////                .verifyComplete();
////    }
//
////    @Test
////    public void shouldThrowNotFoundExceptionWhenCommentDoesNotExist() {
////        // Arrange
////        Long commentId = 99L;
////        stubFor(get(urlEqualTo("/comments/" + commentId))
////                .willReturn(aResponse()
////                        .withStatus(404)));
////
////        // Act & Assert
////        StepVerifier.create(commentService.get(commentId))
////                .expectError(MicroserviceResponseException.class)
////                .verify();
////    }
////
////    @Test
////    public void shouldHandleServerErrorWhenServerIsDown() {
////        // Arrange
////        Long commentId = 1L;
////        stubFor(get(urlEqualTo("/comments/" + commentId))
////                .willReturn(aResponse()
////                        .withStatus(500)));
////
////        // Act & Assert
////        StepVerifier.create(commentService.get(commentId))
////                .expectError(MicroserviceResponseException.class)
////                .verify();
////    }
//
//
//    private static final String HTTP_SCHEME = "http";
//    private static final String COMMENT_SERVICE_HOST = "comment-service";
//    private static final String COMMENTS_SEARCH_URL = "/comments/search";
//    private static final String SEARCH_PARAM = "search";
//    private static final String OFFSET_PARAM = "offset";
//    private static final String LIMIT_PARAM = "limit";
//    private static final String PAGE_SIZE_PARAM = "pageSize";
//    private static final String NUMBER_PAGE_PARAM = "numberPage";
//    private static final String COMMENTS_NEWS_ID_URL = "/comments/news/{id}";
//    private static final String COMMENTS_ID_URL = "/comments/{id}";
//    private static final String COMMENTS_URL = "/comments";
//    private static final String COMMENTS_ARCHIVE_URL = "/comments/archive";
//    private static final String COMMENTS_ARCHIVE_ID_URL = "/comments/archive/{id}";
//    private static final String COMMENTS_ARCHIVE_NEWS_ID_URL = "/comments/archive/news/{id}";
//    private static final String COMMENTS_COMMENT_ID_NEWS_NEWS_ID_URL = "/comments/{commentId}/news/{newsId}";
//}