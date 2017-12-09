package stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Attirude {
	
	@Given("^I work in ([^\"]*)$")
	public void Iwork(String str){
		
	if(str.equals("Latenights")){
		
		System.out.println("latenights automation");
		
	}
	
	if(str.equals("Mornings")){
		
		System.out.println("mornings automation");
	}
	
		
		
	}
	
	@When("^I meet ([^\"]*)$")
	public void Imeet(String str){
		
		if(str.equals("watchman")){
			
			System.out.println("Watchman automation");
		}
		
		if(str.equals("newsPaperBoy")){
			
			System.out.println("NewsPaper automation");
		}
	
	
	}
	
	@Given("^we work in \"([^\"]*)\"$")
	public void we_work_in(String ss) throws Throwable{
		
	System.out.println(ss);
	
	}	
	
	@When("^we meet \"([^\"]*)\"$")
	public void wemeet(String ss) throws Throwable{
		
	System.out.println(ss);

	
   }

	
	
	
	@Then("^I ([^\"]*) him$")
	public void Igreeted(String str){
		
		if(str.equals("Greeted")){
			
			System.out.println("Greeted automation");
			
		}
		
		if(str.equals("skipGreeting")){
			
			System.out.println("skipGreeting automation");
		}
	}
	
	
	
}	