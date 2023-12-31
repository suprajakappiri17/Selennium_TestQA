Feature: Testing modules

Scenario: FaceBook login successfully with valid user name and valid passward

Given User is present on Facebook login page
When tiltle is Login in to Facebook
Then USer enter the valid "AdminTest123" and "Test123"
Then click on login button and logged in successfully.