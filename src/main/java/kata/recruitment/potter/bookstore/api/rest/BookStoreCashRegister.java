package kata.recruitment.potter.bookstore.api.rest;

import kata.recruitment.potter.bookstore.api.dto.BasketDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

/**
 * <p>
 *
 * @author shoun
 * @since 13/05/2021
 */
@RestController
@RequestMapping("/book-store")
public class BookStoreCashRegister {
    @PostMapping(value = { "/register" })
    @ResponseStatus(HttpStatus.OK)
    public Mono<ResponseEntity<Integer>> create(@RequestBody BasketDto basket) {
        return Mono.empty();
    }
}
