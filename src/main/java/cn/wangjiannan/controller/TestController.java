package cn.wangjiannan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.wangjiannan.common.base.BaseController;

/**
 * 测试
 * 
 * @author wangjiannan
 *
 */
@Controller
@RequestMapping("/test")
public class TestController extends BaseController {
	// @Autowired
	// private UserService userService;
	//
	// @RequestMapping("/test1")
	// @ResponseBody
	// public void test1() {
	// logger.info("-------------------------------");
	// User user = userService.selectById(1L);
	// System.out.println("---------" + user.getName());
	// System.out.println("----------------");
	// UserVo userVo = new UserVo();
	// userVo.setLoginName("admin");
	// // userVo.setId(1L);
	// List<User> list = userService.selectByLoginName(userVo);
	// logger.info("-----" + list.get(0).toString());
	//
	// }
}
