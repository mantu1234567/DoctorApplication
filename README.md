
# Hospital Management System
[![Java](https://img.shields.io/badge/Java>=8.0-blue.svg)](https://docs.spring.io/spring-boot/docs/0.5.0.M6/api/org/springframework/boot/SpringApplication.html)
[![maven](https://img.shields.io/badge/maven->=3.0.5-green.svg)](https://www.npmjs.com/package/npm/v/5.5.0)
[![springBoot](https://img.shields.io/badge/SpringBoot->=3.0.6-blue.svg)](https://nodejs.org/en/blog/release/v9.3.0)
>The Hospital Management System API is a RESTful API designed to facilitate the management of patient and doctor data and appointments in a healthcare system. It provides endpoints for patient registration, authentication, appointment booking, and retrieval of doctor information.

[Homepage]();

## Framework used
 * Spring Boot
## Languaged Uesd
 * Java
## Dependencies
 * Spring Web
 * Spring boot Devtool
 * lombok
 * MySQL
 * swagger

## Data Model
>The data model is defined in the Hotel Room Model class, which has the following attributes
```
* Admin
adminID (Integer) : Unique identifier for Admin ID and Generation Type AUTO.
adminName (String) : Admin Name
adminEmail (String) : Admin Email.
adminPassword (String) : Admin Password.
* Doctor
doctorID (Integer) : Unique identifier for Doctor Id Generation Type AUTO.
doctorName (String) : Doctor Name.
specialization (Enum - String) : ENT,ORTHO,GYNO,CARDIO,DENTAL.
doctorContactNumber (String) : Doctor Contact Number
qualification (Enum-String) : MBBS , MD.
doctorConsultationFee (Double) : Doctor fee
* Patient
patientID (Integer) : Unique identifier for Patient Id Generation Type AUTO.
patientName (String) : Pateint Name.
patientEmail (String) : Patient Email.
patientPassword (String) : Patient Password Should not be blank.
patientAge (Integer) : Patient Age.
patientAddress (String) : Patient Address.
Gender (Enum-string) : Patient Gender Male,Female or Other.
```
## Validation
```
To validate the input we get from client, we've used validation annotations that are used to enforce specific constraints on the values of the variables. These constraints ensure that the data input by the user is of the correct format and meets certain criteria.
* @Valid - In Spring Framework, the @Valid annotation is used in conjunction with @PostMapping and @PutMapping annotations, which are used to handle POST and PUT requests, respectively. When used with @PostMapping or @PutMapping, the @Valid annotation is typically applied to a method parameter annotated with @RequestBody.
* @NotEmpty: This annotation is used to validate that the annotated field is not null or empty.
* @NotNull: This annotation is used to validate that the annotated field is not null.
* @Max : This annotation is used to validate that the annotated field is not greater than the mentioned value in field.
* @Min : This annotation is used to validate that the annotated field is not smaller than the mentioned value in field.
```
## Data Flow
```
1. User send as a request to the application throgh the endpoints
2. the api recived request and sends it to the appropriate controll method
3. the controller method makes a call to the method in service class.
4. he controller method returns a response to the API
5. The API sends the response back to the user
```
## Api End Points
The following endpoints are available in the API:
* Doctor Controller
```
POST /doctor: Adds a new doctor to the system.
GET /doctor: Get All Doctor from Database.
```
* Patient Controller
POST /patient/signup: Creates a new patient account.
POST /patient/signin: Authenticates a patient and generates an access token.
DELETE/signout : Pateint cant sign out account after work done.
GET/patients : Get all Patients from database.
POST /appointment/schedule : Creates a new appointment with doctor.
DELETE /patient/appointment/cancel : Cancels an existing appointment.

## Data Structure Used
* SQL database
```
We have used Persistent database to implement CRUD Operations.
```

## Project Summary
```
The hospital Management API is a RESTful API developed using Spring Boot, Java, and MySQL. It provides a comprehensive solution for managing patient and doctor data, as well as appointments, within a healthcare system. The API allows patients to register, sign in, Sign out , book appointments with available doctors, and cancel appointments if needed. Doctors can be added to the system, and their appointment schedules can be retrieved.
```
## Author

Saurav Kumar

* twiter : [@saurav](https://twitter.com/Sauravjha24)
* Github : [@sjha](https://github.com/sjha24)

## Contributing

Contributions , issues and features requestes are welcome !

Feel free to check issues page

## Show your support

Give a rating if this project help you

## License

Copyright : 2023 [Saurav Kumar]()
This project is [GeekSter](https://www.geekster.in/) license
