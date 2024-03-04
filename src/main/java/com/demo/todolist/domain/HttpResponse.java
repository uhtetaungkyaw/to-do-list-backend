package com.demo.todolist.domain;

import com.demo.todolist.entity.Category;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class HttpResponse {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy hh:mm:ss", timezone = "Asia/Rangoon")
    private Date timeStamp;
    private int httpResponse;
    private HttpStatus httpStatus;
    private String message;
    private Category category;

    public HttpResponse(Category category, HttpStatus httpStatus) {
        this.timeStamp = new Date();
        this.httpResponse = httpStatus.value();
        this.httpStatus = httpStatus;
        this.message = httpStatus.getReasonPhrase().toUpperCase();
        this.category = category;
    }

}
