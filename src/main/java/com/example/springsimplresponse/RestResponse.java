package com.example.springsimplresponse;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class RestResponse {
    @Getter
    @Setter
    public String name;
}
