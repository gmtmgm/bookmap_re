package BookMap.PentaRim.Book.Dto;

import BookMap.PentaRim.Book.Book;
import lombok.Getter;

@Getter
public class BookTopResponseDto {
    private String title;
    private String author;
    private String publisher;
    private String image;
    public BookTopResponseDto(Book book){
        this.title = book.getTitle();
        this.author = book.getAuthor();
        this.publisher = book.getPublisher();
        this.image = book.getImage();
    }
}