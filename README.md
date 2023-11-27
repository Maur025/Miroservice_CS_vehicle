Microservicio 4: Vehicle
<br>
Tecnologías Utilizadas:
<br>
SpringBoot (Versión 3.2.0)
<br>
Java (Versión 17.+.+) Compatible con la version de SpringBoot
<br>
postgresSql (Version 16.+)
<br>
Instrucciones de Ejecución:
<br>
primero abre el proyecto en el ide de java, eso hara que se reconozca el proyecto y maven instale las dependencias.
La ejecucion de los Microservicios en el siguiente orden:
<br>

Config
<br>
Eureka
<br>
Client
<br>
Vehicle (actual)
<br>
Gateway
<br>
<br>
API Endpoint:
Endpoint de Cliente: http://localhost:8090/api/client/
<br>
Este Endpoint contiene las rutas de consulta de:
<br>
Nuevo cliente:
http://localhost:8090/api/client/create
<br>
Listar Todos los Clientes:
http://localhost:8090/api/client/all
<br>
Buscar cliente por id:
http://localhost:8090/api/client/search/id
<br>
Buscar los Vehiculos pertenecientes a un cliente:
http://localhost:8090/api/client/search_vehicles/iddeCliente
<br>
proximamente se agregaran la de editar y eliminar
<br>

Endpoint de Vehicle: http://localhost:9090/api/vehicle/

Endpoint de Eureka: http://localhost:8761/eureka

Endpoint del gateway: http://localhost:8080/

Los links a los otros microservicios seran agregados proximamente en esta seccion:
