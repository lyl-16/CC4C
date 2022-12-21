package com.cc4c.utility;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BlogState {
  UNVERIFIED(0),
  VERIFIED(1);

  private final Integer state;
}
