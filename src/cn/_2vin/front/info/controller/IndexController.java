package cn._2vin.front.info.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn._2vin.common.base.controller.FrontController;

/**
 * 首页控制器
 * @author liuxuewen
 * @date 2014-1-22
 */
@Controller
@RequestMapping("/*")
public class IndexController extends FrontController {
	/**
	 * 首页
	 * 
	 * @return
	 */
	@RequestMapping("index.do")
	public ModelAndView index() {
		ModelAndView mnv = new ModelAndView();
		mnv.setViewName("/index");
		return mnv;

	}
}
