/**
 *
 */
package net.freelancertech.vaccation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author simon.pascal.ngos
 *
 */
@Controller
public class HomePageController {

	@GetMapping({ "/", "/ui" })
	public String homepage() {
		return "redirect:/ui/index.htm";
	}

	@GetMapping("/ui/index.htm")
	public String index() {
		return "index";
	}
}
