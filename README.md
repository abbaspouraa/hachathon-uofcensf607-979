# Final-Project
607 final project

Amir Abbaspour 	30076398
Cameron Pepper 	30142126
ALi Zirahi	30036449


**Please follow these steps to test our APIs **
- First, run the Vet_Application_Database.sql databse file
> - Make sure you update your credentials in the application.properites
> > - User name
> > - Password

- Navigate to "http://localhost:8090/swagger-ui/"
- Have fun


**Please note**: Some of the tables have the annotation of "@GeneratedValue(strategy = GenerationType.AUTO)" where you are not supposed to send that attribute throu json.
> - animalId in Animal class
> - id in User class

**Please note**: The "sex" attribute of animal class is set to Character ('m' or 'f')!
> - The auto-generated json has a "string" type default.