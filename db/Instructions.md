## Instalación y Uso de Docker

Fuentes:

- Instalación de Docker: https://www.youtube.com/watch?v=_et7H0EQ8fY
- Instalación de WSL2: https://learn.microsoft.com/en-us/windows/wsl/install-manual

## Instrucciones

1. Construir la imagen de Docker con el siguiente comando:

```bash
docker build -t miserver-mysql-tg .
```

2.- Ejecutar un contenedor con la imagen recién construida:

```bash
docker run -d -p 3306:3306 --name mysql-server-tg miserver-mysql-tg
```

3.- Validar que el contenedor haya iniciado correctamente

```bash
docker ps
```

4.- Ingresar a la consola del contenedor de MySQL.

```bash
docker exec -it mysql-server-tg bash
```

5.- Ingresar a la consola de base de datos para crear nuestra tabla.

```bash
mysql -u root -p
```

6.- Crear nuestra base de datos

```sql
CREATE DATABASE grupotg;
```

7.- Utilizar nuestra base de datos

```sql
use grupotg;
```

8.- Crear una tabla Alumnos con los siguientes datos:

```sql
CREATE TABLE alumnos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(60),
    edad int(2)
);
```

9.- Insertar algunos registros

```sql
INSERT INTO alumnos (nombre, edad) VALUES
('César', 24),
('Karla', 26),
('Miguel', 37)
;
```

10.- Descargar previamente el MySQL-Connector desde esta [url](https://dev.mysql.com/downloads/connector/j/).

11.- Compilar nuestra clase haciendo uso de la librería.

## Windows

```bash
javac -cp "ejercicios_clase/alumnos/lib/*;." ejercicios_clase/alumnos/*.java
```

## MacOS / Linux

```bash
javac -cp "ejercicios_clase/alumnos/lib/*:." ejercicios_clase/alumnos/*.java
```

12.- Ejecutar nuestro proyecto

## Windows

```bash
java -cp "ejercicios_clase/alumnos/lib/*;." ejercicios_clase.alumnos.GrupoTg
```

## MacOS / Linux

```bash
java -cp "ejercicios_clase/alumnos/lib/*:." ejercicios_clase.alumnos.GrupoTg
```
