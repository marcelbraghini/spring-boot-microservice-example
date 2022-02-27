package br.com.marcelbraghini.example.adapters.repository.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@Document("users")
public class UserModel {

    @Id
    private String id;

    private String name;

    private int age;

    private String userName;

    private List<String> languages;

}
