package br.com.marcelbraghini.example.adapters.controller.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class UserResponse {

    private String name;

    private int age;

    private String userName;

    private List<String> languages;

}
