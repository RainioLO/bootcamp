package com.lomboks;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor // this call the partent no agrs
@AllArgsConstructor

// public Developer


@ToString(callSuper = true) // name? age?
@EqualsAndHashCode(callSuper = true) // name ? age?
@SuperBuilder // call all-args

public class Developer extends Staff {

  List<String> skills;

  public Developer(String name, int id, List<String> skills) {
    super(id, name);
    this.skills = skills;
  }

  public static void main(String[] args) {

    Developer developer = new Developer();
    developer.setSkills(null);
    System.out.println(developer.getSkills());

    Developer developer2 =
        new Developer(new ArrayList<>(List.of("coding", "testing")));

    System.out.println(developer2.toString());

    System.out.println(developer2.getName());

    Developer developer3 = Developer.builder().name("Ue").id(2)
        .skills(new ArrayList<>(List.of("coding", "testing"))).build();

    Developer developer4 = Developer.builder().name("Ue").id(2)
        .skills(new ArrayList<>(List.of("coding", "testing"))).build();

    System.out.println(developer3.equals(developer4)); // true

  }
}
