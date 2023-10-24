package cn.itcast.user.web;

import cn.itcast.user.config.MyNacosProperties;
import cn.itcast.user.pojo.User;
import cn.itcast.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Slf4j
@RestController
@RequestMapping("/user")
//@RefreshScope
//配置热更新
public class UserController {

    @Autowired
    private UserService userService;

     //测试注入nacos中的配置属性
//     @Value("${pattern.dateformat}")
//     private String dateformat;
    @Autowired
    private MyNacosProperties myNacosProperties;

     //编写controller，通过日期格式化器来格式化现在时间并返回
     @GetMapping("now")
     public String now(){
         return LocalDateTime.now().format(
            DateTimeFormatter.ofPattern(myNacosProperties.getDateformat(), Locale.CHINA)
//            DateTimeFormatter.ofPattern(dateformat, Locale.CHINA)
         );
     }


    /**
     * 路径： /user/110
     *
     * @param id 用户id
     * @return 用户
     */
    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Long id) {
        return userService.queryById(id);
    }
}
