package kata.recruitment.potter.bookstore.api.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import kata.recruitment.potter.bookstore.api.dto.BasketDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/book-store")
public class BookStoreCashRegister {
    @Operation(
            summary = "Register books",
            description = "Register all books based on the basket configuration and returns the final price." +
                    "<br>" +
                    "Example of basket configuration with final price:" +
                    "<br>" +
                    "   <ul>- 2 copies of the first book</ul>" +
                    "   <ul>- 2 copies of the second book</ul>" +
                    "   <ul>- 2 copies of the third book</ul>" +
                    "   <ul>- 1 copy of the fourth book</ul>" +
                    "   <ul>- 1 copy of the fifth book</ul>" +
                    "<br>" +
                    "<br>" +
                    "answer:<br>" +
                    "&nbsp;&nbsp;&nbsp;(4 * 8) - 20% [first book, second book, third book, fourth book]<br>" +
                    "+ (4 * 8) - 20% [first book, second book, third book, fifth book]<br>" +
                    "= 25.6 * 2<br>" +
                    "= 51.20",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Final price")
            }
    )
    @PostMapping(value = {"/register"})
    @ResponseStatus(HttpStatus.OK)
    public Mono<ResponseEntity<Integer>> create(@RequestBody BasketDto basket) {
        return Mono.empty();
    }
}
