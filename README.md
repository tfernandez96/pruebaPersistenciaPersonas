# pruebaPersistenciaPersonas
Compara la performance de los distintos tipos de tablas para la herencia.

Para usar los metodos de persistencia se debera contar con una instancia de mysql.
Una base de datos Llamada Prueba disponible en localhost:3306/Prueba.
Esta base de datos debe permitir a un usuario con
user: user
pass: password

1) Correr el CargarBaseDeDatosTest (Tiene un loop modificable)
2) Correr PruebasPersistenciaTest (Y ver los prints al final de cada test)

Los @Data, @NoArgsConstructor y @AllArgsConstructor son de lombok, no vienen al caso de persistencia.
Si el intellij marca en rojo algunos getter y setter, es porque no tienen el plugin lombok.
