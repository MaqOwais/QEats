/*
 *
 *  * Copyright (c) Crio.Do 2019. All rights reserved
 *
 */

package com.crio.qeats.exchanges;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GetRestaurantsRequest {
  @NotNull
  @Min(value = -90, message = "must be equal or greater than -90")  
  @Max(value = 90, message = "must be equal or less than 90")  
  private Double latitude;
  @NotNull
  @Min(value = -180, message = "must be equal or greater than 18")  
  @Max(value = 180, message = "must be equal or less than 45")  
  private Double longitude;
  private String searchFor;

  public GetRestaurantsRequest(double d, double e) {
    this.latitude = d;
    this.longitude = e;
  }

}
