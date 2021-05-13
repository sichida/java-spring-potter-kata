package kata.recruitment.potter.bookstore.api.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BasketDto {
    int firstBookCount;
    int secondBookCount;
    int thirdBookCount;
    int fourthBookCount;
    int fifthBookCount;
}
