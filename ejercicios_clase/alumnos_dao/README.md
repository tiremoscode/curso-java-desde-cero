## Aplicación Alumnos aplicando el patrón DAO.

### Separación correcta de nuestra aplicación.

### 1. Modelo.

El modelo representa una entidad del sistema.
Ejemplo: Alumno

- La clase modelo solo guarda atributos y métodos getter / setter.
- No debe tener consultas SQL.

### 2. DAO.

Contiene las operaciones de base de datos.
Utilizando sus métodos para: Insetar, Consultar, Actualizar y Eliminar.

El DAO: usa las clases: `javaConnection, PreparedStatement y ResultSet`.

### 3. Aplicación

Es la parte que ejecuta el programa.
Método main, lógica de resultados para el usuario, menú dinámico.
La aplicación usa a DAO, pero no debe escribir SQL directamente.

### Estructura recomendada

```
src
├── database
│ ConexionDB.java
│
├── model
│ Alumno.java
│
├── dao
│ AlumnoDAO.java
├── lib
│ mysql-connector-j-9.6.0.jar
│
└── app
  Main.java
```

### Compilar la aplicación

## Windows

```bash
javac -cp "ejercicios_clase/alumnos_dao/lib/*;." -d . ejercicios_clase/alumnos_dao/database/*.java ejercicios_clase/alumnos_dao/model/*.java ejercicios_clase/alumnos_dao/dao/*.java ejercicios_clase/alumnos_dao/app/*.java
```

## MacOS / Linux

```bash
javac -cp "ejercicios_clase/alumnos/lib/*:." -d . ejercicios_clase/alumnos_dao/database/*.java ejercicios_clase/alumnos_dao/model/*.java ejercicios_clase/alumnos_dao/dao/*.java ejercicios_clase/alumnos_dao/app/*.java
```

### Ejecutar la aplicación

## Windows

```bash
java -cp "ejercicios_clase/alumnos_dao/lib/\*;." ejercicios_clase.alumnos_dao.app.Main
```

## MacOS / Linux

```bash
java -cp "ejercicios_clase/alumnos/lib/*:." ejercicios_clase.alumnos_dao.app.Main
```
