package kata.recruitment.potter.bookstore.api.rest;

import kata.recruitment.potter.bookstore.api.dto.BasketDto;
import kata.recruitment.potter.bookstore.api.rest.BookStoreCashRegister;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.BodyInserters;

/**
 * <p>
 *
 * @author shoun
 * @since 13/05/2021
 */
@ExtendWith(SpringExtension.class)
@WebFluxTest(controllers = BookStoreCashRegister.class)
public class BookStoreCashRegisterTest {
    @Autowired
    private WebTestClient webClient;

    @Test
    public void it_should_send_book_list() {
        BasketDto basket = BasketDto.builder()
                .firstBookCount(1)
                .secondBookCount(1)
                .thirdBookCount(1)
                .fourthBookCount(1)
                .fifthBookCount(1)
                .build();
        webClient.post()
                .uri("/book-store/register")
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(basket))
                .exchange()
                .expectStatus()
                .is2xxSuccessful();
    }
}
