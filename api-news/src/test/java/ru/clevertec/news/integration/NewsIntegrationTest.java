//package ru.clevertec.news.integration;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.github.tomakehurst.wiremock.client.WireMock;
//import com.github.tomakehurst.wiremock.junit5.WireMockTest;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import ru.clevertec.news.service.NewsServiceImpl;
//
//import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
//import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
//import static org.assertj.core.api.Assertions.assertThat;
//
//@SpringBootTest
//@WireMockTest(httpPort = 8083)
//class NewsIntegrationTest {
//
//    @Autowired
//    private NewsServiceImpl newsService;
//    private final ObjectMapper mapper = new ObjectMapper();
//
//
////    @Test
////    void testProductsSizeIsEmpty() throws JsonProcessingException {
////        stubFor(
////                WireMock.get("/news/1")
////                        .willReturn(aResponse()
////                                .withHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
////                                .withBody("[]"))
////        );
////        stubFor(
////                WireMock.get("/comments/news/1")
////                        .willReturn(aResponse()
////                                .withHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
////                                .withBody("[]"))
////        );
////
////        String s = mapper.writeValueAsString(newsService.get(1L, 1, 1).block());
////        assertThat(s).isEqualTo("");
////    }
//
//}
