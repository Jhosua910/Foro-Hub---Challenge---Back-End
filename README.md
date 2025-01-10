# **Foro API**  
🌐 *Un foro desarrollado con Java y Spring Boot para gestionar discusiones y usuarios de forma segura.*

## **Descripción**  
Foro API es una aplicación backend desarrollada en Java que proporciona funcionalidades esenciales para un foro en línea, como:  
- Gestión de usuarios y roles con autenticación y autorización.  
- Creación, actualización, y eliminación de temas y comentarios.  
- Documentación automática con **Spring Doc**.  

---

## **Características**  
- 🔐 **Autenticación y autorización** mediante **Spring Security**.  
- 📝 Gestión completa de temas y comentarios.  
- 📖 **Documentación interactiva** generada automáticamente con **OpenAPI**.  
- Escalabilidad y facilidad de integración con sistemas frontend.  

---

## **Capturas de Pantalla**  
<!-- Agrega aquí capturas de la interfaz de Swagger o ejemplos de respuestas JSON -->
![Swagger UI](/assets/screenshot0.png)
![Swagger UI](/assets/screenshot1.png)

---

## **Tecnologías Usadas**  
- ☕ **Java 21**  
- 🛠️ **IntelliJ IDEA**  
- 📦 **Maven**  
- 🌱 **Spring Boot**  
- 🔒 **Spring Security**  
- 📜 **Spring Doc** para la documentación interactiva de la API.
- 🗄️ **PostgreSQL** como base de datos relacional.

---

## **Instalación y Uso**

### **1. Requisitos Previos**
- Java 21 instalado.  
- Maven configurado.
- PostgreSQL instalado y configurado.
- IntelliJ IDEA (opcional pero recomendado).

### **2. Configuración de PostgreSQL**
1. Crea una base de datos llamada `foro_api`.  
2. Configura las credenciales en el archivo `application.properties` o `application.yml` del proyecto:  
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:8080/foro_api
   spring.datasource.username=tu_usuario
   spring.datasource.password=tu_contraseña
   spring.jpa.hibernate.ddl-auto=update

### **3. Clonar el Repositorio**

    git clone https://github.com/tu_usuario/foro-api.git
    cd foro-api

### **4. Construir y Ejecutar el Proyecto**

    ./mvnw clean install
    ./mvnw spring-boot:run

### **5. Acceso a la API**

La API estará disponible en:

    http://localhost:8080

La documentación interactiva estará disponible en:

    http://localhost:8080/swagger-ui.html

## **Contribuciones**

¡Contribuciones son bienvenidas! Por favor, sigue los pasos a continuación:

Haz un fork del repositorio.
Crea una nueva rama:

    git checkout -b feature/nueva-funcionalidad

Realiza tus cambios y haz commit:

    git commit -m 'Agregada nueva funcionalidad'

Sube los cambios:

    git push origin feature/nueva-funcionalidad

Crea un pull request.

## **Contacto**

📧 Jhosuaea910l@gmail.com
💼 [LinkedIn](https://www.linkedin.com/in/jhosua910/)

## **Licencia**

📜 Este proyecto está bajo la Licencia MIT. Consulta el archivo LICENSE para más información.
