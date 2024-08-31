# Keytool - Generate key and self-signed certificate

[Keytool](https://docs.oracle.com/en/java/javase/13/docs/specs/man/keytool.html). 

NOTE: Keytool is already installed with the Java Development Kit. No additional installed is required.

## Generate Key and Self-Signed Certificate

1. Open a terminal/command-prompt window.

2. Move into the directory of your Spring Boot ecommerce project.
cd spring-boot-ecommerce

3. In the terminal window, run this command to generate the key and certificate. This is one long command, copy/paste in its entirety.

keytool -genkeypair -alias ecommerce -keystore src/main/resources/ecommerce-keystore.p12 -keypass secret -storeType PKCS12 -storepass secret -keyalg RSA -keysize 2048 -validity 365 -dname "C=US, ST=Pennsylvania, L=Philadelphia, O=ecommerce, OU=Training Backend, CN=localhost" -ext "SAN=dns:localhost"


3. The command generates the file: `src/main/resources/ecommerce-keystore.p12` .

## Verify Results
1. View the contents of your certificate.
keytool -list -v -alias ecommerce -keystore src/main/resources/ecommerce-keystore.p12 -storepass secret



## Spring Boot HTTPS configs
1. Edit your `application.properties` file

1. Add this snippet for Spring Boot SSL configs to the end of your `application.properties` file

#####
#
# HTTPS configuration
#
#####

# Server web port
server.port=8443

# Enable HTTPS support (only accept HTTPS requests)
server.ssl.enabled=true

# Alias that identifies the key in the key store
server.ssl.key-alias=luv2code

# Keystore location
server.ssl.key-store=classpath:luv2code-keystore.p12

# Keystore password
server.ssl.key-store-password=secret

# Keystore format
server.ssl.key-store-type=PKCS12


Congrats! You have successfully configured your Spring Boot project to use a self-signed certificate for https.

