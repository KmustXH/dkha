package com.dkha.dto;

import com.dkha.commons.tools.validator.group.DefaultGroup;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


/**
 * 学生档案信息
 *
 * @author Mark
 * @since v1.0.0 2020-08-23
 */
@Data
@ApiModel(value = "学生档案信息")
public class ScStudentsCountDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "学生姓名")
	@Length(max = 50,message = "名称长度不能超过50个字符", groups = DefaultGroup.class)
	private String scStuname;

	@ApiModelProperty(value = "学生照片地址")
	private String scPhotoimg;

	@ApiModelProperty(value = "学生性别：0 男 1女")
	private Integer scSex;

	@ApiModelProperty(value = "宿舍号")
	private String drNum;


	@ApiModelProperty(value = "学生手机号")
	private String scPhonenum;

	@ApiModelProperty(value = "未归次数")
	private String number;

	@ApiModelProperty(value = "创建时间")
	private Date createDate;

	@ApiModelProperty(value = "学生档案ID")
	private Long scStdid;
	@ApiModelProperty(value = "照片")
	private byte[] scPhotoimgByte;

}
