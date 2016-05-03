Feature: Clickable links on the front page
	
	Scenario: Navigation buttons take people places
	
		When we access "http://localhost:8080/TestTemplate-App/" using Google Chrome
		Then the title should be "Home Page!"
		
		When I click the About button
		Then the title should be "About Page!"
		
		When I click the Contact button
		Then the title should be "Contact Page!"
		
		When I click the Project Title button
		Then the title should be "Home Page!"
		