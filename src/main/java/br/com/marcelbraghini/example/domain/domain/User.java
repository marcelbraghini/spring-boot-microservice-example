package br.com.marcelbraghini.example.domain.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class User {

    private String id;

    private String name;

    private int age;

    private String userName;

    private List<String> languages;

}
