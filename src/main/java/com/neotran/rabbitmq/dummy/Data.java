package com.neotran.rabbitmq.dummy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

@AllArgsConstructor
@Getter
@ToString
public class Data implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private long id;
    private String message;
}
