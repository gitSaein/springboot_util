package com.gitSaein.springboot_util.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults( level = AccessLevel.PRIVATE)
public class ParamsVo {
	
	@ApiModelProperty(notes = "parameter1", required = true)
	String param1;
	
	@ApiModelProperty(notes = "parameter2", required = false)
	String param2;
}
