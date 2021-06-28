Error Observed:


***************************
APPLICATION FAILED TO START
***************************

Description:

Parameter 0 of constructor in com.example.dependencyInjection.Customers required a bean of type 'int' that could not be found.


Action:

Consider defining a bean of type 'int' in your configuration.


Solution: 
Dummy constructor is absent hence causing Bean creation failed. Fixing by adding Dummy Contructor