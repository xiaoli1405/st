package www.lst.mall.api.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
public class MallUserLoginParam implements Serializable {
    @ApiModelProperty("登入名")
    @NotEmpty(message = "登入名不能为空")
    private String loginName;
    @ApiModelProperty("用户密码(需要MD5加密)")
    @NotEmpty(message = "密码不能为空")
    private String passwordMd5;
}
