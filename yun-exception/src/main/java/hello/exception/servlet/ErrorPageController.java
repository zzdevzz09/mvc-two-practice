package hello.exception.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ErrorPageController {

	@RequestMapping("/error-page/404")
	public String error404(HttpServletRequest request, HttpServletResponse response) {
		log.info("errorPage 404");
		return "error-page/404";
	}

	@RequestMapping("/error-page/500")
	public String error500(HttpServletRequest request, HttpServletResponse response) {
		log.info("errorPage 500");
		return "error-page/500";
	}
}
