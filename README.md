# Microservicio 4 - Vehicle

## Tecnologías Utilizadas:

SpringBoot (Versión 3.2.0)
<br>
Java (Versión 17.+.+) Compatible con la version de SpringBoot
<br>
postgresSql (Version 16.+)
<br>

## Instrucciones de Ejecución:

Ejecuta el proyecto en el IDE de java (de tu preferencia), eso hara que se reconozca el proyecto y maven instale las dependencias. <br>

### Realiza la ejecucion de los Microservicios en el siguiente orden:

- Config
- Eureka
- Client (actual)
- Vehicle
- Gateway

## API Endpoint:

Endpoint de Cliente: http://localhost:8090/api/client/
<br>

Endpoint de Vehicle: http://localhost:9090/api/vehicle/
<br>

### Este Endpoint contiene las rutas de consulta de:

Nuevo vehiculo:<br>
http://localhost:8080/api/vehicle/create<br>
<br>
Listar Todos los Vehiculos:<br>
http://localhost:8080/api/vehicle/all<br>
<br>
Buscar Vehiculo por id:<br>
http://localhost:8080/api/vehicle/search/id<br>
<br>
Buscar los Vehiculos pertenecientes a un cliente:<br>
http://localhost:8080/api/vehicle/search_by_client/iddeCliente<br>
<br>
proximamente se agregaran la de editar y eliminar<br>
<br>
Endpoint de Eureka: http://localhost:8761/eureka<br>
<br>
Endpoint del gateway: http://localhost:8080/<br>

## Enlaces de los otros microservicios:

config-url: https://github.com/Maur025/Microservice_CS_Config.git<br>
eureka-url: https://github.com/Maur025/Microservice_CS_eureka.git<br>
client-url: https://github.com/Maur025/Microservice_CS_Client.git<br>
gateway-url: https://github.com/Maur025/Microservice_CS_gateway.git<br>
