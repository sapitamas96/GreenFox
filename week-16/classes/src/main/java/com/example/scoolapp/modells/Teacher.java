package com.example.scoolapp.modells;

import com.example.scoolapp.dto.PersonCreationDTO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@DiscriminatorValue("Teacher")
@Proxy(lazy = false)
public class Teacher extends Person{

    public Teacher(PersonCreationDTO dto) {
        super(dto.getName(), dto.getAge(), Role.valueOf(dto.getRole().toUpperCase()));
    }
}
