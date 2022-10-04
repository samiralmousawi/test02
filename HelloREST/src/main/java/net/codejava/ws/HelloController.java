package net.codejava.ws;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/getproduct")
	public Product getProduct() {
		return new Product(1,"samsung", 999.99f);
	}
	
	@PostMapping("addquote")
	public void addQuote(@RequestBody Quote q) {
		q.setType("NewYork");
		Value v = new Value();
		v.setId(Long.parseLong("2222"));
		v.setQuote("ORCLLLLLLLL");
		q.setValue(v);
		System.out.println(q.toString());
	}
	
	@RequestMapping("/getquote")
	public Quote getQuote() {
		
		Quote q=new Quote();
		q.setType("Nasdaq");
		Value v = new Value();
		v.setId(Long.parseLong("111"));
		v.setQuote("MSFTTTTT");
		q.setValue(v);
		return q;
	}
	
	@PostMapping("addproduct")
	public void addProduct(@RequestBody Product product) {
		System.out.println(product);
	}
	
	@RequestMapping("/getproducts")
	public List<Product> getProducts() {
		List<Product> products = new ArrayList<Product> ();
		products.add(new Product(1,"samsung", 999.99f));
		products.add(new Product(2,"samsung20", 1222.99f));
		
		return products;
	}
	
@RestController
public class HelloController2 {
		@RequestMapping("/hello2")
		public String hello2(@RequestParam(name = "name", defaultValue ="World") String name) {
			return "howdy " + name;
		}
	}

		@PostMapping("/hellopost")
		public String add() {
			return "this is apost "  ;
		}
		
		@PutMapping("/helloput")
		public String update() {
			return "this is apost "  ;
		}
}
