	package com.wjh.web.test;
	
	
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;
	
	@RestController
	public class web1 {
	
		@GetMapping("/web")
		public String web() {
			return "<h1>h2<h1>";
	}
}
		
