Feature: Login

  Rule: Customers need to provide valid credentials to access the product catalog

      Example: Colin login with valid credential
        Given Colin is on the login page
        When Colin login with valid credentials
        Then he should be presented with the product catalog