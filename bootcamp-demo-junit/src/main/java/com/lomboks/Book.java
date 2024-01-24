package com.lomboks;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
// tostring, getter, setter, required_argument, 
@AllArgsConstructor
@NoArgsConstructor
@Builder
// lombok tools -> 4 for a class

public class Book {

  @ToString.Exclude
  private String author;

  private LocalDate localDate;

}
