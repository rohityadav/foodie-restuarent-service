package com.foodie.foodierestuarentservice.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

/**
 * Created by ryadav1 on 7/23/17.
 */
@Getter @Setter
@ToString
public class Restuarent {
    @Id
    private String id;
    private String name;
    private String type;

    public Restuarent() {
    }

    public Restuarent(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
